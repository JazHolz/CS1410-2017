package labCoin;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Panel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.border.LineBorder;
import java.awt.Label;
import java.awt.Font;

public class CoinGUI extends JFrame {

	private JPanel contentPane;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CoinGUI frame = new CoinGUI();
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
	public CoinGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.GRAY);
		contentPane.add(panel, BorderLayout.NORTH);
		
		Label lblNewLabel = new Label("");
		lblNewLabel.setAlignment(Label.CENTER);
		lblNewLabel.setFont(new Font("Zapfino", Font.PLAIN, 27));
		contentPane.add(lblNewLabel, BorderLayout.CENTER);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText(Coin.CENT.toString());
			}
		});
		btnNewButton_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnNewButton_2.setForeground(Color.GRAY);
		btnNewButton_2.setOpaque(true);
		btnNewButton_2.setBackground(Color.GRAY);
		btnNewButton_2.setIcon(new ImageIcon(CoinGUI.class.getResource("/imgs/UsCent.png")));
		panel.add(btnNewButton_2);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText(Coin.DIME.toString());
			}
		});
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnNewButton.setIcon(new ImageIcon(CoinGUI.class.getResource("/imgs/UsDime.png")));
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText(Coin.NICKEL.toString());
			}
		});
		btnNewButton_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnNewButton_1.setIcon(new ImageIcon(CoinGUI.class.getResource("/imgs/UsNickel.png")));
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText(Coin.QUARTER.toString());
			}
		});
		btnNewButton_3.setBorder(new LineBorder((Color) new Color(0, 0, 0)));
		btnNewButton_3.setIcon(new ImageIcon(CoinGUI.class.getResource("/imgs/UsQuarter.png")));
		panel.add(btnNewButton_3);
		
		
	}
	
	}

