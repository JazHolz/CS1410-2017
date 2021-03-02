package rpsAssignment;

import java.awt.BorderLayout;
    import java.awt.EventQueue;

    import javax.swing.JFrame;
    import javax.swing.JPanel;
    import javax.swing.border.EmptyBorder;
    import javax.swing.JLabel;
    import javax.swing.JButton;
    import javax.swing.SwingConstants;

    import java.awt.event.ActionListener;
    import java.awt.event.ActionEvent;
    import java.awt.FlowLayout;
    import java.awt.GridLayout;

    public class rpsGUI extends JFrame {

        private JPanel contentPane;
        private JPanel humanDisplay = new JPanel();
        private JPanel computerDisplay = new JPanel();
        private JLabel winner = new JLabel("Winner Shown Here");
        private JPanel choicePanel = new JPanel();

        private rpsCODE rock = rpsCODE.ROCK;
        private rpsCODE paper = rpsCODE.PAPER;
        private rpsCODE scissors = rpsCODE.SCISSORS;

        private rpsCODE randChoice;

        private final JPanel humOrCompPanel = new JPanel();
        private final JLabel lblHuman = new JLabel("Human");
        private final JLabel lblComputer = new JLabel("Computer");
        private JButton btnScissors = new JButton("Scissors");
        private JButton btnPaper = new JButton("Paper");
        private JButton btnRock = new JButton("Rock");

        /**
         * Launch the application.
         */
        public static void main(String[] args) {
            EventQueue.invokeLater(new Runnable() {
                public void run() {
                    try {
                        rpsGUI frame = new rpsGUI();
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
        public rpsGUI() {
            setTitle("Rock, Paper, Scissors");
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setBounds(100, 100, 544, 366);
            contentPane = new JPanel();
            contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
            contentPane.setLayout(new BorderLayout(0, 0));
            setContentPane(contentPane);

            JPanel choicePanel = addPanels();

            addButtons(choicePanel, rock, btnRock);
            addButtons(choicePanel, paper, btnPaper);
            addButtons(choicePanel, scissors, btnScissors);
        }

        private JPanel addPanels() {
            contentPane.add(humanDisplay, BorderLayout.WEST);
            humanDisplay.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

            contentPane.add(computerDisplay, BorderLayout.EAST);

            winner.setHorizontalAlignment(SwingConstants.CENTER);
            contentPane.add(winner, BorderLayout.CENTER);

            contentPane.add(choicePanel, BorderLayout.NORTH);

            contentPane.add(humOrCompPanel, BorderLayout.SOUTH);
            humOrCompPanel.setLayout(new GridLayout(1, 0, 0, 0));
            lblHuman.setHorizontalAlignment(SwingConstants.CENTER);

            humOrCompPanel.add(lblHuman);
            lblComputer.setHorizontalAlignment(SwingConstants.CENTER);

            humOrCompPanel.add(lblComputer);

            return choicePanel;
        }

        private void addButtons(JPanel choicePanel, rpsCODE choice, JButton button ){
            button.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg0) {
                    humanDisplay.removeAll();
                    humanDisplay.add(new JLabel(choice.getImageIcon()));

                    computerDisplay.removeAll();
                    randChoice = rpsCODE.randomChoice();
                    computerDisplay.add(new JLabel(randChoice.getImageIcon()));

                    choicePanel.repaint();
                    choicePanel.revalidate();

                }
            });
            choicePanel.add(button);
        }
    }