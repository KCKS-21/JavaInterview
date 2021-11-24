package abstractAndInterface;

public class Circle extends Shape {

	 private double pi = 3.14;
	int r;

	Circle(int r) {
		this.r = r;
	}

	@Override
	public void getarea() {
		
		double area=pi*r*r;
		System.out.println("area of circle" + area);
				
	}
	
	public void getCircumference() {
		double circumference=2*pi*r;
		System.out.println("circumfrence is " + circumference);
	}

}
