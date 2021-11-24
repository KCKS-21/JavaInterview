package abstractAndInterface;

public class Rectangular extends Shape {
	int l;
	int w;
	int b;
	
	Rectangular(int l,int w,int b)
	
	{
		this.l=l;
		this.w=w;
		this.b=b;
	}

	@Override
	public void getarea() {
		
		int area=l*w;
		System.out.println("Area of rectangular is "+ area);
		
	}
	public void getPerimeter()
	{
		int perimeter= 2*(l*b);
		System.out.println("Perimeter is" + perimeter);
	}

}
