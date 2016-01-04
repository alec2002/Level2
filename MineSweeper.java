import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MineSweeper implements ActionListener {

	JFrame frame;

	JPanel panel;

	JButton b1;

	JButton b2;

	JButton b3;

	JButton b4;

	JButton b5;

	JButton b6;

	JButton b7;

	JButton b8;

	JButton b9;

	JButton b10;

	JButton b11;

	JButton b12;

	JButton b13;

	JButton b14;

	JButton b15;

	JButton b16;

	JButton b17;

	JButton b18;

	JButton b19;

	JButton b20;

	JButton submitbutton;

	public static void main(String[] args) {

		MineSweeper x = new MineSweeper();

	}

	MineSweeper() {
		String stuff = "Try to navigate the minefield withought tapping the mine, if you tap on a mine the program will exit you out displaying (you lose), try to remember where the mines \n are becuase they do not change positions, if you correctly click a button where there is no mine the button will become black, once you succesfully \n click all the correct buttons except the mine click submit";
		JOptionPane.showMessageDialog(null, stuff);

		frame = new JFrame("MineField Operator/ level 1");

		frame.setVisible(true);

		frame.setSize(400, 400);

		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);

		panel = new JPanel();

		b1 = new JButton();

		b2 = new JButton();

		b3 = new JButton();

		b4 = new JButton();

		b5 = new JButton();

		b6 = new JButton();

		b7 = new JButton();

		b8 = new JButton();

		b9 = new JButton();

		b10 = new JButton();

		b11 = new JButton();

		b12 = new JButton();

		b13 = new JButton();

		b14 = new JButton();

		b15 = new JButton();

		b16 = new JButton();

		b17 = new JButton();

		b18 = new JButton();

		b19 = new JButton();

		b20 = new JButton();

		submitbutton = new JButton("Submit");

		frame.add(panel);

		panel.add(b1);

		panel.add(b2);

		panel.add(b3);

		panel.add(b4);

		panel.add(b5);

		panel.add(b6);

		panel.add(b7);

		panel.add(b8);

		panel.add(b9);

		panel.add(b9);

		panel.add(b10);

		panel.add(b11);

		panel.add(b12);

		panel.add(b13);

		panel.add(b14);

		panel.add(b15);

		panel.add(b16);

		panel.add(b17);

		panel.add(b18);

		panel.add(b19);

		panel.add(b20);

		panel.add(submitbutton);

		submitbutton.addActionListener(this);

		b1.addActionListener(this);

		b2.addActionListener(this);

		b3.addActionListener(this);

		b4.addActionListener(this);

		b5.addActionListener(this);

		b6.addActionListener(this);

		b7.addActionListener(this);

		b8.addActionListener(this);

		b9.addActionListener(this);

		b9.addActionListener(this);

		b9.addActionListener(this);

		b10.addActionListener(this);

		b11.addActionListener(this);

		b12.addActionListener(this);

		b13.addActionListener(this);

		b14.addActionListener(this);

		b15.addActionListener(this);

		b16.addActionListener(this);

		b17.addActionListener(this);

		b18.addActionListener(this);

		b19.addActionListener(this);

		b20.addActionListener(this);

	}

	public void actionPerformed(ActionEvent e) {

		String q1 = b1.getText();

		String q2 = b2.getText();

		String q3 = b3.getText();

		String q4 = b4.getText();

		String q5 = b5.getText();

		String q6 = b6.getText();

		String q7 = b7.getText();

		String q8 = b8.getText();

		String q9 = b9.getText();

		if (e.getSource() == b6) {

			b6.setBackground(Color.BLACK);

			b6.setOpaque(true);

		}

		if (e.getSource() == b7) {

			b7.setBackground(Color.BLACK);

			b7.setOpaque(true);

		}

		if (e.getSource() == b8) {

			b8.setBackground(Color.BLACK);

			b8.setOpaque(true);

		}

		if (e.getSource() == b9) {

			b9.setBackground(Color.BLACK);

			b9.setOpaque(true);

		}

		if (e.getSource() == b1) {

			b1.setBackground(Color.RED);

			b1.setOpaque(true);

			for (int i = 0; i < 10; i++) {

				System.out.println("YOU LOSE");

			}

			System.exit(0);

		}

		if (e.getSource() == b2) {

			b2.setBackground(Color.BLACK);

			b2.setOpaque(true);

		}

		if (e.getSource() == b3) {

			b3.setBackground(Color.RED);

			b3.setOpaque(true);

			for (int i = 0; i < 10; i++) {

				System.out.println("YOU LOSE");

			}

			System.exit(0);

		}

		if (e.getSource() == b4) {

			b4.setBackground(Color.BLACK);

			b4.setOpaque(true);

		}

		if (e.getSource() == b5) {

			b5.setBackground(Color.BLACK);

			b5.setOpaque(true);

		}

		if (e.getSource() == b10) {

			b10.setBackground(Color.RED);

			b10.setOpaque(true);

			for (int i = 0; i < 10; i++) {

				System.out.println("YOU LOSE");

			}

			System.exit(0);

		}

		if (e.getSource() == b11) {

			b11.setBackground(Color.RED);

			b11.setOpaque(true);

			for (int i = 0; i < 10; i++) {

				System.out.println("YOU LOSE");

			}

			System.exit(0);

		}

		if (e.getSource() == b12) {

			b12.setBackground(Color.BLACK);

			b12.setOpaque(true);

		}

		if (e.getSource() == b13) {

			b13.setBackground(Color.RED);

			b13.setOpaque(true);

			for (int i = 0; i < 10; i++) {

				System.out.println("YOU LOSE");

			}

			System.exit(0);

		}

		if (e.getSource() == b14) {

			b14.setBackground(Color.BLACK);

			b14.setOpaque(true);

		}

		if (e.getSource() == b15) {

			b15.setBackground(Color.BLACK);

			b15.setOpaque(true);

		}

		if (e.getSource() == b16) {

			b16.setBackground(Color.BLACK);

			b16.setOpaque(true);

		}

		if (e.getSource() == b17) {

			b17.setBackground(Color.BLACK);

			b17.setOpaque(true);

		}

		if (e.getSource() == b18) {

			b18.setBackground(Color.BLACK);

			b18.setOpaque(true);

		}

		if (e.getSource() == b19) {

			b19.setBackground(Color.RED);

			b19.setOpaque(true);

			for (int i = 0; i < 10; i++) {

				System.out.println("YOU LOSE");

			}

			System.exit(0);

		}

		if (e.getSource() == b20) {

			b20.setBackground(Color.BLACK);

			b20.setOpaque(true);

		}

		if (e.getSource() == submitbutton) {

			if (b2.getBackground() == Color.BLACK && b4.getBackground() == Color.BLACK

			&& b5.getBackground() == Color.BLACK && b6.getBackground() == Color.BLACK

			&& b7.getBackground() == Color.BLACK && b8.getBackground() == Color.BLACK

			&& b9.getBackground() == Color.BLACK && b12.getBackground() == Color.BLACK

			&& b14.getBackground() == Color.BLACK && b15.getBackground() == Color.BLACK

			&& b16.getBackground() == Color.BLACK && b17.getBackground() == Color.BLACK

			&& b18.getBackground() == Color.BLACK && b20.getBackground() == Color.BLACK) {

				MineSweeper2 x = new MineSweeper2();
				x.speak("You win");
				System.out.println("YOU WIN");

			} else {

				System.exit(0);

				System.out.println("You Lose");

			}

		}

	}

}
