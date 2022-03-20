
public class Shape {
	private double side;
	
	enum color{
		
	}
	public double gertPerimeter()
	{
		return 0;
	}
	public String toString()
	{
		return getSide() + " ";
	}
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	public Shape(double side) {
		super();
		this.side = side;
	}
	public Shape() {
		super();
	}
	

}
