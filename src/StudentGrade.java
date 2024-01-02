
public class StudentGrade {

	int StdId;
	String StdName;
	int csc_mks;
	int phy_mks;
	public StudentGrade() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentGrade(int stdId, String stdName, int csc_mks, int phy_mks) {
		super();
		StdId = stdId;
		StdName = stdName;
		this.csc_mks = csc_mks;
		this.phy_mks = phy_mks;
	}
	
	int gettotmks() {
		return(csc_mks + phy_mks);
	}
	
	int getpercentage() {
		
		return(gettotmks()/2);
	}
	 char getgrade() {
		
		int per =getpercentage();
		
		if(per>90)
			return 'A';
		 
		else if (per<35) {
			return 'c';
		}
		else
			return 'B';
		}
	String getresult() {
		
		if(getpercentage()<35)
			return "failed";
		
		else 
			return "pass";
	}

}
