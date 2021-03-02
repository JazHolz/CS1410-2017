package ImageButton;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;


public class ImageButtonApp {

    public static void main(String[] args) {
        ImageButton myImageButton = new ImageButton();
        myImageButton.setSize(600, 600);
        myImageButton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myImageButton.setVisible(true);
	
    }
}
