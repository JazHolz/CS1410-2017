package LayoutManager;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Dimension;
import java.awt.Button;
import javax.swing.JToggleButton;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.MatteBorder;

public class LayoutMana extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LayoutMana frame = new LayoutMana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public LayoutMana() {
		setSize(new Dimension(300, 300));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(4, 1, 0, 0));

		JLabel lblNewLabel = new JLabel("Label1");
		lblNewLabel.setOpaque(true);
		lblNewLabel.setBackground(Color.RED);
		lblNewLabel.setForeground(Color.BLACK);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel);

		JButton btnNewButton = new JButton("Click Me");
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setFont(new Font("Nanum Brush Script", Font.BOLD | Font.ITALIC, 77));
		btnNewButton.setOpaque(true);
		btnNewButton.setBackground(Color.BLUE);
		contentPane.add(btnNewButton);

		JLabel lblHi = new JLabel("HI");
		lblHi.setHorizontalAlignment(SwingConstants.CENTER);
		lblHi.setBackground(Color.RED);
		lblHi.setOpaque(true);
		contentPane.add(lblHi);

		JButton btnNewButton_1 = new JButton("Button");
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Nanum Brush Script", Font.ITALIC, 77));
		btnNewButton_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		btnNewButton_1.setBackground(Color.BLUE);
		btnNewButton_1.setOpaque(true);
		contentPane.add(btnNewButton_1);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (btnNewButton.getBackground() == Color.BLUE) {
					btnNewButton.setBackground(Color.GREEN);
				} else {
					btnNewButton.setBackground(Color.BLUE);
					lblHi.setBackground(Color.YELLOW);
				}

			}
		});
	}

}
