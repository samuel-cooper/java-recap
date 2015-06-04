import java.util.Arrays;

public class Barcode {

	public final static String[] CODE =
	{	"00001",	// 0
		"00010",	// 1
		"00100",	// 2
		"00111",	// 3
		"01000",	// 4
		"01011",	// 5
		"01101",	// 6
		"01110",	// 7
		"10000",	// 8
		"10011",	// 9
		"10101",	// START
		"11001" 	// STOP
	};
	
	public static final int START 	= 10,
							STOP 	= 11,
							UNKNOWN	= -1; 
	
	private int[] digits;
	
	//create a new barcode object.
	public Barcode(int[] digits) {
		
		this.digits = Arrays.copyOf(digits, digits.length);
	
	}
	
	//public draw() {
		//for future implementation
	//}
	
	//return a string of ones and zeros to represent the barcode
	public String toString() {
	
		StringBuilder barcode = new StringBuilder(digits.length * 5);
		
		barcode.append(CODE[START]);
		for(int num : digits) {
			barcode.append(CODE[num]);
		}
		barcode.append(CODE[STOP]);
		
		return barcode.toString();
		
	}
	
	//ingest a string containing a bit sequence and produce an account number.
	public static Barcode fromString(String bits) {
	
		String sub_bc;
		int[] digits = new int[11];
		int 	pos = 0,			//position in digits array
				startIndex = 5,		//start index of substring
				endIndex = 10;		//end index of substring
		
		if(bits.length() == 65) {
			while(endIndex < 65) {
				sub_bc = bits.substring(startIndex, endIndex);
		
				for(int i = 0; i < CODE.length - 2; i++) {
					if(sub_bc.equals(CODE[i])) {
						digits[pos] = i;
						pos++;
					}
				}
				
				startIndex += 5;
				endIndex += 5;
			}
					
			Barcode barcode = new Barcode(digits);
			return barcode;
				
		} else {
			return null;
		}
				
	}
	
	public int[] getDigits() {
	
		return Arrays.copyOf(digits, digits.length);
	
	}
	
}
