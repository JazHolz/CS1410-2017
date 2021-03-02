package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JRadioButton;
import javax.swing.JSplitPane;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.FlowLayout;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;

public class ExpGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ExpGUI frame = new ExpGUI();
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
	public ExpGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JLabel lblNewLabel = new JLabel("Example GUI");
		lblNewLabel.setFont(new Font("Nanum Pen Script", Font.PLAIN, 30));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(lblNewLabel, BorderLayout.NORTH);

		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.SOUTH);

		JRadioButton leftChoice = new JRadioButton("Left");
		
		

		JRadioButton rightChoice = new JRadioButton("Right");
		
		
		ButtonGroup radioButtons = new ButtonGroup();
		radioButtons.add(leftChoice);
		radioButtons.add(rightChoice);

		JPanel mainContentPanelHolder = new JPanel();
		mainContentPanelHolder.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.LIGHT_GRAY));
		contentPane.add(mainContentPanelHolder, BorderLayout.CENTER);
		
		JPanel leftImagePanel = new JPanel();
		leftImagePanel.setPreferredSize(new Dimension(190,190));
		leftImagePanel.setBackground(Color.black);
		FlowLayout flowLayout_1 = (FlowLayout) leftImagePanel.getLayout();
		flowLayout_1.setAlignment(FlowLayout.LEFT);

		JLabel leftImage = new JLabel(new ImageIcon(new ImageIcon("src/img/schlange.gif").getImage().getScaledInstance(190, 190, 0)));
		leftImage.setPreferredSize(new Dimension(190,190));
		leftImagePanel.add(leftImage);
		mainContentPanelHolder.add(leftImagePanel);
		
		
		JPanel rightImagePanel = new JPanel();
		rightImagePanel.setPreferredSize(new Dimension(190,190));
		rightImagePanel.setBackground(Color.black);
		FlowLayout flowLayout = (FlowLayout) rightImagePanel.getLayout();
		flowLayout.setAlignment(FlowLayout.RIGHT);
		
		JLabel rightImage = new JLabel(new ImageIcon(new ImageIcon("src/img/schlange.gif").getImage().getScaledInstance(190, 190, 0)));
		rightImage.setPreferredSize(new Dimension(190,190));
		rightImagePanel.add(rightImage);
		mainContentPanelHolder.add(rightImagePanel);
		
		leftChoice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(leftChoice.isSelected()){
					leftImage.setVisible(true);
					rightImage.setVisible(false);
				}
			}
		});
		panel.add(leftChoice);
		
		rightChoice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(rightChoice.isSelected()){
					rightImage.setVisible(true);
					leftImage.setVisible(false);
				}
			}
		});
		panel.add(rightChoice);
		
		
		//SETUP FIRST CHOICE
		
		leftChoice.setSelected(true);
		rightImage.setVisible(false);
	}

	protected String ImageIcon(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}