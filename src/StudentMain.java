
public class StudentMain {
	

		public static void main(String[] args) {
			
			StudentDataCapture_obj sd=new StudentDataCapture_obj(1,"java",81,88);
			ProcessStdData psd=new ProcessStdData();
			int totMks=psd.calcToMks(sd);
			System.out.println("Total Marks is "+totMks);
		
				}

	}