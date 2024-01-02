package inheritance;

public class DemoMain {
	public static void main(String[] args) {
		String subj[] = {"maths","cc","DD"};
		StudentSubject child =new StudentSubject(1,"java",subj);
		child.showData();
	}

}

