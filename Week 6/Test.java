import java.util.Scanner;

public class Test {
	
	public static void main(String args[]) {
	
		Scanner scan = new Scanner(System.in);
	
		while(scan.hasNextLine()) {
		
			String bits = scan.nextLine();
			Barcode bc = Barcode.fromString(bits);
			
			if(bc == null) {
				System.out.println("Not a valid account number");
				
			} else {
				AccountNumber an = AccountNumber.fromBarcode(bc);
			
				if(an == null) {
					System.out.println("Not a valid account number");
					
				} else {
					System.out.println(an.toString());
				}
			}
			
		}
			
	}	
	
}
