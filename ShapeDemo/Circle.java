public class Circle extends Shape {
	private double radius;
	
	public Circle() {}
	public Circle(String color, double radius) {
		super(color);
		this.radius = radius;
	}
	public double area() {
		return Math.PI * radius * radius;
	}
	public String toString() {
		return getColor() + " circle with radius of " + radius + " and area of " + area();
	}
}