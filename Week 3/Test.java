public class Test {

	public static void main(String[] args) {

		//declare all variables
		double arg0, arg1, arg2, arg3;

		//parse values from args[] into variables
		arg0 = Double.parseDouble(args[0]);
		arg1 = Double.parseDouble(args[1]);
		arg2 = Double.parseDouble(args[2]);
		arg3 = Double.parseDouble(args[3]);

		//construct new Rectangle object 
		Rectangle fuzzyBox = new Rectangle(arg0, arg1, arg2, arg3);
		
		//print Rectangle.toString();
		System.out.println("rectangle = " + fuzzyBox.toString());
		//print Rectangle.getArea();		
		System.out.println("area = " + fuzzyBox.getArea());
		//print Rectangle.getPerimeter		
		System.out.println("perimeter = " + fuzzyBox.getPerimeter());
	
	}

}
