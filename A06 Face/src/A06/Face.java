package A06;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;

public class Face extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Face frame = new Face();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private JPanel createPanel() {
		JPanel panel = new JPanel();
		panel.setFont(new Font("Noteworthy", Font.PLAIN, 13));
		panel.setAlignmentY(Component.BOTTOM_ALIGNMENT);
		panel.setAlignmentX(Component.RIGHT_ALIGNMENT);
		panel.setBorder(new MatteBorder(5, 5, 5, 5, (Color) null));
		panel.setBackground(Color.LIGHT_GRAY);
		contentPane.add(panel, BorderLayout.WEST);
		panel.setLayout(new GridLayout(0, 1, 0, 0));

		return panel;
	}

	/**
	 * Create the frame.
	 * 
	 * @throws IOException
	 */
	public Face() throws IOException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(5, 5));
		setContentPane(contentPane);

		Panel panel_1 = new Panel();
		JPanel panel = createPanel();

		JSeparator separator = new JSeparator();
		panel.add(separator);

		JLabel lblYouChoose = new JLabel("You Choose...");
		lblYouChoose.setFont(new Font("Noteworthy", Font.PLAIN, 15));
		lblYouChoose.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblYouChoose);

		JCheckBox chckbxEyes = new JCheckBox("Eyes");
		chckbxEyes.setFont(new Font("Noteworthy", Font.PLAIN, 15));
		panel.add(chckbxEyes);

		JCheckBox chckbxNose = new JCheckBox("Nose");
		chckbxNose.setFont(new Font("Noteworthy", Font.PLAIN, 15));
		panel.add(chckbxNose);

		JCheckBox chckbxMouth = new JCheckBox("Mouth");
		chckbxMouth.setFont(new Font("Noteworthy", Font.PLAIN, 15));
		panel.add(chckbxMouth);

		// TODO
		// Need to refactor this...
		Image image = ImageIO.read(new File("imgs/blank-smiley.png"));
		
		JLabel defaultFace = new JLabel(new ImageIcon(image));
		defaultFace.setLayout(new FlowLayout());

		JButton btnNewButton = new JButton("Update");
		btnNewButton.setFont(new Font("Noteworthy", Font.PLAIN, 17));
		btnNewButton.setBackground(Color.WHITE);
		panel.add(btnNewButton);

		JSeparator separator_2 = new JSeparator();
		panel.add(separator_2);
		
		panel_1.setLayout(new FlowLayout(FlowLayout.LEADING, 5, 5));
		panel_1.add(defaultFace);
		contentPane.add(panel_1, BorderLayout.CENTER);
		setLocationRelativeTo(null);
		pack();

		
		defaultFace.add(eyeLabel);
		defaultFace.add(noseLabel);
		defaultFace.add(mouthLabel);
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	
				if(chckbxEyes.isSelected()){
					try {
						updateEyes();
						
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				if(chckbxNose.isSelected()){
					try {
						updateNose();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				if(chckbxMouth.isSelected()){
					try {
						updateMouth();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				panel_1.repaint();
				validate();
			}

		});
		updateEyes();
		updateNose();
		updateMouth();
	}

	private JLabel eyeLabel = new JLabel();
	private int currentEye = 0;
	private String[] eyeSelections = { "imgs/angryeyes.png", "imgs/angryeyes2.png", "imgs/angryeyes3.png" };

	
	private void updateEyes() throws IOException{
		currentEye++;
		if (currentEye >= eyeSelections.length) {
			currentEye = 0;
		}
		Image image = ImageIO.read(new File(eyeSelections[currentEye]));
		
		eyeLabel.setIcon(new ImageIcon(image));
	
	}

	private JLabel noseLabel = new JLabel();
	private int currentNose = 0;
	private String[] noseSelections = { "imgs/nose.png", "imgs/nose2.png", "imgs/nose3.png" };

	private void updateNose() throws IOException{
		currentNose++;
		if (currentNose >= noseSelections.length) {
			currentNose = 0;
		}
		Image image = ImageIO.read(new File(noseSelections[currentNose]));

		noseLabel.setIcon(new ImageIcon(image));
	
	}
	
	
	private JLabel mouthLabel = new JLabel();
	private int currentMouth = 0;
	private String[] mouthSelections = { "imgs/mouth.png", "imgs/mouth2.png" , "imgs/mouth3.png" };

	
	private void updateMouth() throws IOException{
		currentMouth++;
		if (currentMouth >= mouthSelections.length) {
			currentMouth = 0;
		}
		Image image = ImageIO.read(new File(mouthSelections[currentMouth]));

		mouthLabel.setIcon(new ImageIcon(image));
		
	}
}
