package javaBean;

public class JavaBeanImplementation {

	public static void main(String[] args) {
		EmployeeDetails ed=new EmployeeDetails();
		ed.setEmpId(1);
		ed.setEmpName("x");
		ed.setEmpSalar(10.5);
		
		int id=ed.getEmpId();
		String name=ed.getEmpName();
		double salary=ed.getEmpSalary();
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);

	}

}
