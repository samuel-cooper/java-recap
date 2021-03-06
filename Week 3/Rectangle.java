public class Rectangle {
	
	public static double x;
	public static double y;
	public static double w;
	public static double h;
	
	public Rectangle(double arg1, double arg2, double arg3, double arg4) {
		x = arg1;
		y = arg2;
		w = arg3;
		h = arg4;
	}

	public static double getArea() {
		double area;
		area = w * h;
		return area;
	}

	public static double getPerimeter() {
		double perimeter;
		perimeter = 2*(w+h);
		return perimeter;
	}

	public String toString() {
		return "(" + x + ", " + y + ", " + w + ", " + h + ")";
	}
}
