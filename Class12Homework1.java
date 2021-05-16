package week11;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Class12Homework1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			//�½�һ���ļ���Ŵ�
			File aFile1 = new File("D:/java--��ҵ/week11/answer.txt");
			FileWriter fw = new FileWriter(aFile1);
			PrintWriter pw = new PrintWriter(fw);
			
			
			String fileName = "D:/java--��ҵ/week11/question.txt";
			// 1.��ˮ��
			File aFile = new File(fileName);
			// 2.��ˮ��
			FileReader fr = new FileReader(aFile);
			// 3.��ˮ��ͷ
			BufferedReader bf = new BufferedReader(fr);
			// 4.��ˮ��ͷ
			String aLine = "";
			while ((aLine = bf.readLine()) != null) {
				String express = aLine;
				String oldexpress = express;
				String regex = "((add)|(sub)|(min)|(max)|(doubleMe)|(muti)|(div))\\(\\d{1,}(,\\d{1,})?\\)";
				Pattern p = Pattern.compile(regex);
				Matcher m = p.matcher(express);
				while (m.find()) {
					String basicExpress = m.group();
					String result = cal(basicExpress);
					basicExpress = basicExpress.replaceAll("\\(", "\\\\(");
					basicExpress = basicExpress.replaceAll("\\)", "\\\\)");
					express = express.replaceAll(basicExpress, result);
					m = p.matcher(express);
				}
				pw.println(oldexpress + "=" + express);
			}
			// 5.�ر�
			pw.close();
			bf.close();
			fr.close();
		} catch (Exception e) {
			e.printStackTrace();
		}	
	}
	public static String cal(String basicExpress) {
		String result = "";
		int pos1 = basicExpress.indexOf("(");
		int pos2 = basicExpress.indexOf(")");
		String op = basicExpress.substring(0,pos1);
		if (op.equalsIgnoreCase("doubleMe")) {
			int num = Integer.parseInt(basicExpress.substring(pos1 + 1, pos2));
			result += String.valueOf(num * num);
		} else {
			String num = basicExpress.substring(pos1 + 1, pos2);
			String array[] = num.split(",|��");
			switch (op) {
			case "add":
				result += String.valueOf(Integer.parseInt(array[0]) + Integer.parseInt(array[1]));
				break;
			case "sub":
				result += String.valueOf(Integer.parseInt(array[0]) - Integer.parseInt(array[1]));
				break;
			case "min":
				result += String.valueOf(Integer.parseInt(array[0]) < Integer.parseInt(array[1])
						? Integer.parseInt(array[0]) : Integer.parseInt(array[1]));
				break;
			case "max":
				result += String.valueOf(Integer.parseInt(array[0]) > Integer.parseInt(array[1])
						? Integer.parseInt(array[0]) : Integer.parseInt(array[1]));
				break;
			case "muti":
				result += String.valueOf(Integer.parseInt(array[0]) * Integer.parseInt(array[1]));
				break;
			case "div":
				result += String.valueOf(Integer.parseInt(array[0]) / Integer.parseInt(array[1]));
				break;
			}
		}
		return result;
	}
	
	
}