/* 	TriArea.java

**	While the calculation part of this program can be done in a single
**	line, it is much easier to separate different elements of the
**	equation into different variables.

*/

public class TriArea{
	public static double getArea(double a, double b, double c) {
		double part1;
		double part2;
		double area;

		part1 	= Math.pow((Math.pow(a, 2) + Math.pow(b, 2) + Math.pow(c, 2)), 2);
			  //System.out.println("part1 = " + part1);

		part2 	= Math.pow(a, 4) + Math.pow(b, 4) + Math.pow(c, 4);
			  //System.out.println("part2 = " + part2);
		
		area 	= 0.25 * (Math.sqrt(part1 - 2*part2));

		return area;
	}
}
