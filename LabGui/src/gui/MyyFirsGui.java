package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Component;
import java.awt.Font;
import java.awt.Color;
import java.awt.Point;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JTextField;

public class MyyFirsGui extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MyyFirsGui frame = new MyyFirsGui();
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
	public MyyFirsGui() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblMyFirstGui = new JLabel("My First GUI");
		lblMyFirstGui.setHorizontalAlignment(SwingConstants.CENTER);
		lblMyFirstGui.setAlignmentX(Component.RIGHT_ALIGNMENT);
		lblMyFirstGui.setOpaque(true);
		lblMyFirstGui.setBackground(Color.BLUE);
		lblMyFirstGui.setFont(new Font("Marker Felt", Font.PLAIN, 33));
		lblMyFirstGui.setAlignmentY(Component.TOP_ALIGNMENT);
		contentPane.add(lblMyFirstGui, BorderLayout.NORTH);
		
		JButton btnWest = new JButton("WEST");
		contentPane.add(btnWest, BorderLayout.WEST);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.GRAY);
		contentPane.add(panel_1, BorderLayout.SOUTH);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setVerticalAlignment(SwingConstants.BOTTOM);
		lblName.setHorizontalAlignment(SwingConstants.LEFT);
		panel_1.add(lblName);
		
		textField = new JTextField();
		textField.setFont(new Font("Marker Felt", Font.PLAIN, 16));
		textField.setHorizontalAlignment(SwingConstants.LEFT);
		textField.setBackground(Color.WHITE);
		panel_1.add(textField);
		textField.setColumns(25);
		
		JLabel lblHi = new JLabel("HI");
		lblHi.setHorizontalAlignment(SwingConstants.CENTER);
		lblHi.setForeground(Color.ORANGE);
		lblHi.setFont(new Font("Marker Felt", Font.PLAIN, 77));
		lblHi.setBackground(Color.RED);
		lblHi.setOpaque(true);
		contentPane.add(lblHi, BorderLayout.CENTER);
	}

}
