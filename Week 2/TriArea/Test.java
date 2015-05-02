public class Test {
	public static void main(String[] args) {

		double arg1, arg2, arg3, area;

		arg1 = Double.parseDouble(args[0]);
		arg2 = Double.parseDouble(args[1]);
		arg3 = Double.parseDouble(args[2]);
		area = TriArea.getArea(arg1, arg2, arg3);
		
		System.out.println("Area = " + area);
	}
}
