public class Generate {

	public static void main(String args[]) {
		
		if(args.length > 0) {
			int arg1 = Integer.parseInt(args[0]);
			
			for(int i = 0; i < arg1; i++) {
				AccountNumber acc = new AccountNumber(true);
				System.out.println(acc.toString());
			}
		
		} else {
			System.out.println("No number was entered");
		}
	}
}