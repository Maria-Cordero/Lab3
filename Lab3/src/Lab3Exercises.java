import javax.swing.JFrame;
import java.awt.*;

public class Lab3Exercises {
	public static void main(String[] args) {
 
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
		
		int screenWidth = screenSize.height;
		int screenHeight = screenSize.width;
		
		JFrame myFrame = new JFrame("Maria");
		myFrame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		myFrame.setLocation((screenHeight/2)-100, (screenWidth/2)-100);
		myFrame.setSize(200, 200);
		myFrame.setVisible(true);
		
	}
}