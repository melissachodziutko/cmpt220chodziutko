
public class circle2d {
	private double x; 
	private double y; 
	private double radius;

	//declare circle2d raduis
	circle2d() {
		this(0, 0, 1);
	}

	//circle with x, y, and radius
	circle2d(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}


	public double x() {
		return x;
	}
	public double y() {
		return y;
	}

	
	public double radius() {
		return radius;
	}

	//area calculation
	public double area() {
		return Math.PI * Math.pow(radius, 2);
	}

	//perimeter calculation
	public double perimeter() {
		return 2 * Math.PI * radius;
	}

	//boolean to return true if it is within the radius
	public boolean contains(double x, double y) {
		return Math.sqrt(Math.pow(x - this.x, 2) + 
				 Math.pow(y - this.y, 2)) 
				 < radius;
	}

	//boolean to return true if overlaps circles
	public boolean overlaps(circle2d circle) {
		return Math.sqrt(Math.pow(circle.x() - x, 2) + 
				 Math.pow(circle.y() - y, 2)) 
				 <= radius + circle.radius();
	}
	
	//boolean to return true if inside circle
	public boolean contains(circle2d circle) {
		return Math.sqrt(Math.pow(circle.x() - x, 2) + 
				 Math.pow(circle.y() - y, 2)) 
				 <= Math.abs(radius - circle.radius());
	}

}