package inheritance;

public abstract class Employee {
	int empId;
	   String empName;
	   public Employee() {
	  
	}
		public Employee(int empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
		 //concrete method
		void showData() {
		System.out.println("Emp data is"+empId+" "+empName);
	}
		abstract int calcSal();
	}
		class RegularEmployee extends Employee{
		int bSal;
	    public RegularEmployee() {
		super();
	  }
		public RegularEmployee(int empId,String empName,int bSal) {
		super();
		this.bSal = bSal;
	}
		@Override
		int calcSal() {	
		int pf=200;  //(int pf=(int)(0.12f *bsal)
		return bSal-pf;
		}	
	}
		class ContractEmp extends Employee{
		@Override
		int calcSal() {
		return 15000;
		}}


