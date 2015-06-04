import java.awt.*;
import javax.swing.*;

public class BarcodeComponent extends JComponent {

	public Barcode barcode;

	public BarcodeComponent(Barcode bc) {
		barcode = bc;
	}
	
	public void paintComponent(Graphics g) {
		
		char[] bitArray = barcode.toString().toCharArray();
		
		int x = 10;
		
		for(int i = 0; i < 65; i++) {
			
			Graphics2D graphic = (Graphics2D) g.create();
			
			if(bitArray[i] == '0') {
				graphic.setColor(Color.BLACK);
			} else { 
				graphic.setColor(Color.WHITE);
			}
		
			graphic.fillRect(x, 10, 2, 50);
			
			x += 2;
		}
		
	
	}
}
