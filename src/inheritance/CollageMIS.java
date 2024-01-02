package inheritance;

public class CollageMIS {
	
		private Integer enroll_id;
		private String stud_name;
		
		public CollageMIS() {
			super();
		}
		public CollageMIS(Integer enroll_id, String stud_name) {
			super();
			this.enroll_id = enroll_id;
			this.stud_name = stud_name;
		}
		
		void  showData() {
			System.out.println("Parent class data "+enroll_id+ "\t"+stud_name);
		}
	}


