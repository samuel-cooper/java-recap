public class Test {
	
	public static void main(String args[]) {
	
		int arg1 = Integer.parseInt(args[0]);
	
		AccountNumber arg2 = new AccountNumber(true);
		Barcode	arg3 = arg2.toBarcode();
		
		for(int i = 0; i < arg1; i++) {
			System.out.println(arg3.toString());
		}
			
	}	
	
}
