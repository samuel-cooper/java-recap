public class Test {
	public static void main(String[] args) {
		double arg1 = Double.parseDouble(args[0]);
		double arg2 = Double.parseDouble(args[1]);
		double area = TriArea.getArea(arg1, arg2);
		System.out.println("Area = " + area);
	}
}
