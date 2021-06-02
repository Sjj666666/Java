package week14.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

import week14.tools.DbConnection;
import week14.vo.Student;

public class StudentDao {
	// 按关键字进行查询，返回查询结果，存放在对象中（最多一条）
	public static Student get(String id) {
		Student stu = null;
		DbConnection db = new DbConnection();
		Connection con = db.getCon();
		String sql = "select * from t_student where id=?";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, id);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				stu = new Student(rs.getString("id"), rs.getString("name"), rs.getString("birth"),
						rs.getString("gender"), Double.parseDouble(rs.getString("score")));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return stu;
	}

	// 按指定的字段进行查询，返回查询结果，存放在集合中（可能是多条）
	public ArrayList<Student> query(String fieldName, String value) {
		ArrayList<Student> list = new ArrayList<Student>();
		DbConnection db = new DbConnection();
		Connection con = db.getCon();
		String sql = "select * from t_student where " + fieldName + "=?";
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, value);
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				Student stu = new Student(rs.getString("id"), rs.getString("name"), rs.getString("birth"),
						rs.getString("gender"), Double.parseDouble(rs.getString("score")));
				list.add(stu);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	// 从键盘中输入若干个学生数据，存放在集合中
	public ArrayList<Student> readStudentFromKeyBoard() {
		ArrayList<Student> list = new ArrayList<Student>();
		System.out.println("请输入学生学号，姓名，生日，性别，成绩:(end结束)");
		Scanner scan = new Scanner(System.in);
		String message = scan.nextLine();
		while (!message.equalsIgnoreCase("end")) {
			String array[] = message.split(",|，");
			if (get(array[0]) == null) {
				Student stu = new Student(array[0], array[1], array[2], array[3], Double.parseDouble(array[4]));
				list.add(stu);
			} else {
				System.out.println("添加失败,已存在!");
			}
			message = scan.nextLine();
		}
		return list;
	}

	// 将一个学生对象插入到数据库中，返回成功插入记录的条数（>1，表示插入成功）
	public int insert(ArrayList<Student> list) {
		int iRet = 0;
		DbConnection db = new DbConnection();
		Connection con = db.getCon();
		try {
			for (Student student : list) {
				String sql = "insert into t_student(id,name,birth,gender,score) values(?,?,?,?,?) ";
				PreparedStatement pst = con.prepareStatement(sql);
				pst.setString(1, student.getId());
				pst.setString(2, student.getName());
				pst.setString(3, student.getBirth());
				pst.setString(4, student.getGender());
				pst.setDouble(5, student.getScore());
				int count = pst.executeUpdate();
				iRet += count;
			}
		} catch (Exception e) {
			e.printStackTrace();
			db.close();
		}
		return iRet;
	}

	// 删除指定关键字的记录，返回成功删除记录的条数(>1,表示删除成功)
	public int delete(String id) {
		int iRet = 0;
		DbConnection db = new DbConnection();
		Connection con = db.getCon();
		try {
			String sql = "delete from t_student where id=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, id);
			int count = pst.executeUpdate();
			iRet += count;
		} catch (Exception e) {
			e.printStackTrace();
			db.close();
		}
		return iRet;
	}

	public int update(Student stu,String id) {
		int iRet = 0;
		DbConnection db = new DbConnection();
		Connection con = db.getCon();
		StringBuffer sql = new StringBuffer("update t_student ");
		sql.append("set id='" + stu.getId() + "',name='"
				+stu.getName() + "',birth='"+stu.getBirth()
				+"',gender='"+stu.getGender()+"',score='"
				+stu.getScore()+"' where id='" + id + "'");
		//System.out.println(sql.toString());
		try {
			PreparedStatement pst = con.prepareStatement(sql.toString());
			iRet = pst.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return iRet;
	}
}
