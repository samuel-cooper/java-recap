public class LesserString {
	public static void main(String[] args) {
		String arg1, arg2, lesser;

		arg1 = args[0];
		arg2 = args[1];

		if(arg1.compareToIgnoreCase(arg2) < 0) {
			System.out.println(arg1);
		} else {
			System.out.println(arg2);
		}
	}		
}
