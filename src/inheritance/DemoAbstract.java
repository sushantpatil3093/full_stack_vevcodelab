package inheritance;

public class DemoAbstract {
	
public static void main(String[] args) {
		
		Employee e;   //reference to abstract class
		RegularEmployee re=new RegularEmployee(1,"java",12345);
		ContractEmp ce= new ContractEmp();
		
		e= re;
		System.out.println("Reg employee Sal is "+e.calcSal());

		e=ce;
		System.out.println("Con Emp Sal is "+e.calcSal());

	}

}

