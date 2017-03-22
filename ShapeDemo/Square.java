public class Square extends Shape {
	private double side;
	
	public Square(String color, double side) {
		super(color);
		this.side = side;
	}
	public double area() {
		return side * side;
	}
	public String toString() {
		return getColor() + " Square with side length of " + side + " and area of " + area();
	}
}
