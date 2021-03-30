package One;

public class Employee {
	private String department;
	private String name;
	private double baseSalry;
	
	public Employee() {
		super();
	}
	public Employee( String name,String department, double baseSalry) {
		super();
		this.department = department;
		this.name = name;
		this.baseSalry = baseSalry;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBaseSalry() {
		return baseSalry;
	}
	public void setBaseSalry(double baseSalry) {
		this.baseSalry = baseSalry;
	}
	public void updateSalary(){
		this.baseSalry = this.baseSalry*(1+0.035);
	}
	public String toString(){
		return "name = "+this.name+
				",department = "+this.department+
				",baseSalary = "+this.baseSalry;
	}
	
	
}