import java.util.Scanner;

public class RectangleTool2 {

	public static void main(String[] args) {


		Scanner scan= new Scanner(System.in);

		//declare all variables
		String input = " ";
		String[] inputs = new String[5];
		double arg0, arg1, arg2, arg3;

		do {

			System.out.print("? ");
			input = scan.nextLine();
			inputs = input.split(" ");

			//ignore any numbers if quit command is issued
			if(inputs[0].equalsIgnoreCase("quit")) {
				
				//do nothing
			
			} else {
				
				//assign doubles to variables
				arg0 = Double.parseDouble(inputs[1]);
				arg1 = Double.parseDouble(inputs[2]);
				arg2 = Double.parseDouble(inputs[3]);
				arg3 = Double.parseDouble(inputs[4]);

				switch(inputs[0]) {

					case "area":		//construct new Rectangle object 
										Rectangle areaBox = new Rectangle(arg0, arg1, arg2, arg3);
							
										//print Rectangle.getArea();		
										System.out.println("Area of " + areaBox.toString() + " = "  + areaBox.getArea());
										break;

					case "perimeter":	//construct new Rectangle object 
										Rectangle perimeterBox = new Rectangle(arg0, arg1, arg2, arg3);
							
										//print Rectangle.getPerimeter();		
										System.out.println("Perimeter of " + perimeterBox.toString() + " = "  + perimeterBox.getPerimeter());
										break;

				}
			
			}

		} while(!inputs[0].equalsIgnoreCase("quit"));
	
	}

}