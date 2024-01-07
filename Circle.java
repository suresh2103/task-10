package task10;

public class Circle {

	double radius;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int r = 3;

		Circle obj = new Circle(r);

		System.out.println("Radius of the circle is: " + r);
		System.out.println("The Circumference of the circle is: " + obj.getCircumference());

	}

	public Circle(double radius) {

		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getCircumference() {

		return 2 * Math.PI * radius;
	}
}
