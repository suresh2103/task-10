package task10;

public class Employee {
	
	
	int ID;
	String FirstName;
	String LastName;
	double Salary;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee obj = new Employee(54321, "Suresh", "Karthik", 10000.00);
		System.out.println("-------Embeloyee Details------");
		obj.embeloyeeDetails();
		obj.getAnnualSalary();
		
		obj.raiseSalary(10);
		System.out.println("*****After raising salary*****");
		System.out.println("10% increment for the Embeloyee: ");
		obj.embeloyeeDetails();

	}	

	public Employee(int ID, String FirstName, String LastName, double Salary) {

		this.ID = ID;
		this.FirstName = FirstName;
		this.LastName = LastName;
		this.Salary = Salary;
	}

	public int getID() {
		return ID;
	}

	public void setID(int ID) {
		this.ID = ID;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String FirstName) {
		this.FirstName = FirstName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLasttName(String LastName) {
		this.LastName = LastName;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double Salary) {
		this.Salary = Salary;
	}
	
	public void getAnnualSalary() {

		this.Salary=Salary*12;
	}

	public void raiseSalary(double percentage) {
		
		Salary = Salary + Salary * percentage / 100;
	}

	public void embeloyeeDetails() {

		System.out.println("Employee ID: " + ID);
		System.out.println("Name: " + FirstName+" "+ LastName);
		//System.out.println("LastName: " + LastName);
		System.out.println("Salary: " + Salary);

	}
}
