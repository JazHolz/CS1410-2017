package rpsAssignment;

import javax.swing.ImageIcon;

public enum rpsCODE {
    ROCK(new ImageIcon(rpsCODE.class.getResource("rock.jpg"))), 
    PAPER(new ImageIcon(rpsCODE.class.getResource("paper.jpg"))), 
    SCISSORS(new ImageIcon(rpsCODE.class.getResource("scissors.gif")));

        private ImageIcon imgChoice;

        private rpsCODE(ImageIcon imgChoice) {
            this.imgChoice = imgChoice;
        }

        public ImageIcon getImageIcon(){
            return imgChoice;
        }

    public static rpsCODE randomChoice(){
        return values()[(int) (Math.random() * values().length)];
    }
}


