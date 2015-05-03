import java.util.Scanner;

public class LesserString {
	
	public static void main(String[] args) {
		//create a new Scanner object to read input
		Scanner scan = new Scanner(System.in);
		
		//declare all variables needed
		String arg1, arg2, lesser;

		//read lines from user input
		arg1 = scan.nextLine();
		arg2 = scan.nextLine();

		//compare and print lesser
		if(arg1.compareToIgnoreCase(arg2) < 0) {
			System.out.println("Lesser is: " + arg1);
		} else {
			System.out.println("Lesser is: " + arg2);
		}

	}
		
}
