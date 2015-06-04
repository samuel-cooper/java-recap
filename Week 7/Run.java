import java.awt.*;
import javax.swing.*;

public class Run {

	public static void main(String args[]) {
		AccountNumber ac 	= new AccountNumber(true);
		Barcode barcode 	= ac.toBarcode();
	

		JFrame frame = new JFrame("Barcode");
		frame.setSize(150, 100);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(new BarcodeComponent(barcode));
		frame.setVisible(true);
	}
}
