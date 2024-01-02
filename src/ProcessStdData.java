
public class ProcessStdData {
	public ProcessStdData() {
		super();
	}
 
	//Constructor 
	//process data -total marks,percentage,result ,Grade
	int calcToMks(StudentDataCapture_obj sd) {
		return(sd.mks_cs + sd.mks_dd);
	}
	
}
