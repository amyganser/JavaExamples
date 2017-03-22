public class Shape {
	private String color;
	
	public Shape(String color) {
		this.color = color;
	}
	public Shape() {}
	public String getColor() {
		return color;
	}
	public double area() {
		return 0.0;
	}
	public String toString() {
		return "generic shape";
	}
}