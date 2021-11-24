package abstractAndInterface;

public class InitialisingClass {

	public static void main(String[] args) {
		System.out.println("=============================");
		invokeAllShapes(new Circle(4));
		invokeAllShapes(new Rectangular(4,3,7));
	}

	public static void invokeAllShapes(Shape s1) {
		s1.rotate();
		s1.getarea();

	}
}
