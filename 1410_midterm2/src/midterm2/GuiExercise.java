package midterm2;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GuiExercise extends JFrame {


	public GuiExercise() {
		setSize(450, 400);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel mainPane = new JPanel();
		setContentPane(mainPane);

		// This is image background
		mainPane.setBackground(new Color(112, 128, 144));
		mainPane.setVisible(true);

		JPanel topPane = new JPanel();
		topPane.setBackground(new Color(112, 128, 144));

		JLabel titleLabel = new JLabel("New York");
		titleLabel.setFont(new Font("Tahoma", Font.ITALIC, 28));
		titleLabel.setForeground(new Color(240, 248, 255));
		topPane.add(titleLabel);
		mainPane.add(topPane);

		JPanel midPane = new JPanel();
		midPane.setBackground(new Color(220, 238, 245));

		JLabel mainImageLabel = new JLabel();
		mainImageLabel.setIcon(new ImageIcon("src/img/liberty.png"));
		midPane.add(mainImageLabel);
		mainPane.add(midPane);

		JButton showButton = new JButton();
		showButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		showButton.setText("Show New York At Night");
		showButton.setForeground(new Color(240, 248, 255));
		showButton.setBorderPainted(false);
		showButton.setBackground(new Color(112, 128, 144));
		mainPane.add(showButton);

		showButton.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (showButton.getText().equals("Show New York At Night")) {
					midPane.setBackground(new Color(72, 88, 104));
					showButton.setText("Show New York At Day");
				} else {
					midPane.setBackground(new Color(220, 238, 245));
					showButton.setText("Show New York At Night");
				}

			}
		});

		// Weird issues won't draw initially without this
		validate();
	}

	public static void main(String[] args) {
		new GuiExercise();
	}
}
