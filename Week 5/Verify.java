import java.util.Scanner;
import java.io.File;

public class Verify {

	public static void main(String[] args) {
	
		File f = new File("input.txt");
		String ac;
		try(Scanner scan = new Scanner(f);) {
			
			while(scan.hasNextLine()) {
			
				ac = scan.nextLine();
				AccountNumber acc = AccountNumber.fromString(ac);
				if(acc == null) {
					System.out.println(ac + " is invalid");
				} else {
					System.out.println(ac + " is valid " + acc.toString());
				}
			}
		} catch (java.io.FileNotFoundException e) {
			//handle
		}
	}
}