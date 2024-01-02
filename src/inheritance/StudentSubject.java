package inheritance;

public class StudentSubject extends CollageMIS{
		String subj[];

		public StudentSubject() {
			super();
		
		}
		public StudentSubject(int enroll_id,String stud_name ,String[] subj){
			//invoke the super class constructor
			//should be the first line while using constructor
			super(enroll_id,stud_name);
			this.subj=subj;
		
		}
		
		//Method Overriding
		
	    void showData() {
	    	super.showData();
	    	for (int i=0;i<subj.length;i++)
	    		System.out.println(subj[i]);
		
	}
	}


