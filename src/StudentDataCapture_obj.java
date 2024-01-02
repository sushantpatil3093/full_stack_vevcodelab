
public class StudentDataCapture_obj {

		//Properties
		
		int stdId;
		String stdName;
		int mks_cs;
		int mks_dd;
		
		//Constructor

		public StudentDataCapture_obj() {
			super();

		}

		public StudentDataCapture_obj(int stdId, String stdName, int mks_cs, int mks_dd) {
			super();
			this.stdId = stdId;
			this.stdName = stdName;
			this.mks_cs = mks_cs;
			this.mks_dd = mks_dd;
		}
		
		
			void showData() {
				System.out.println("Student data :"+ stdId +" "+ stdName +" " + mks_cs + mks_dd);
				}
	}

