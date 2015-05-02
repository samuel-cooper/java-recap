/*		TriAlias.java

**		This program takes two integers (a base and a height) and prints a
**		right angle triangle pattern.	

**		When using two identical values, this program seems overly simple,
**		however, the real challenge comes when using different values.
**		Note the use of casting to track the correct increment for values 
**		that don't divide evenly.
*/

public class TriAlias{
	public static void main(String[] args) {
		
		//	Set all needed variables
		//	int h 		height of triangle
		//	int b		base length of triangle
		//	int inc 	extra characters needed per line
		//	int count	characters to print each line
	
		int b 	= Integer.parseInt(args[0]);
		int h 	= Integer.parseInt(args[1]);	
		double inc = (double) b/h;
		double d_count = inc;
		int count = (int) d_count;				

		System.out.println("Increment = " + inc);

		for(int i = 1; i <= h; i++) {
			for(int j = 0; j < count; j++) {
				System.out.print("0");
			}
			d_count += inc;
			count = (int) d_count;
			System.out.println();
		
		}
	}
}