public class Rectangle extends Shape {
	private double width;
	private double length;
	public Rectangle(String color, double length, double width) {
		super(color);
		this.width = width;
		this.length = length;
	}
	public double area() {
		return width * length;
	}
	public String toString() {
		return getColor() + " Rectangle with length of " + length + " and the width of " + width + " and area of " + area();
	}
}