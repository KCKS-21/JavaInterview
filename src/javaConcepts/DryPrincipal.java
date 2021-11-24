package javaConcepts;


public class DryPrincipal {
	
	int studentId;
	String studentName;
	int studentMarks;
	
	public void studentInfo() {
		System.out.println(studentId);
		System.out.println(studentName);
		System.out.println(studentMarks);
	}

	public static void main(String[] args) {
		
		
		DryPrincipal d1=new DryPrincipal();
		DryPrincipal d2=new DryPrincipal();
		
		d1.studentId=400;
		d1.studentName="A";
		d1.studentMarks=100;
		
		d2.studentId=500;
		d2.studentName="B";
		d2.studentMarks=200;
		
		d1.studentInfo();
		System.out.println("");
		d2.studentInfo();
		
	}

}
