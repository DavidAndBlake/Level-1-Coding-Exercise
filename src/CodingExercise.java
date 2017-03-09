import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CodingExercise implements ActionListener {
	private JFrame frame = new JFrame();
	private JPanel panel = new JPanel();
	private JButton redButton = new JButton();
	private JButton yellowButton = new JButton();
	private JButton greenButton = new JButton();
	private JButton blueButton = new JButton();

	public static void main(String[] args) {
		new CodingExercise();
	}

	public CodingExercise() {
		frame.setVisible(true);
		frame.add(panel);
		frame.setSize(400, 100);
		panel.setVisible(true);
		panel.add(redButton);
		panel.add(yellowButton);
		panel.add(greenButton);
		panel.add(blueButton);
		redButton.setBackground(Color.red);
		redButton.setOpaque(true);
		yellowButton.setBackground(Color.yellow);
		yellowButton.setOpaque(true);
		greenButton.setBackground(Color.green);
		greenButton.setOpaque(true);
		blueButton.setBackground(Color.blue);
		blueButton.setOpaque(true);
		redButton.addActionListener(this);
		yellowButton.addActionListener(this);
		greenButton.addActionListener(this);
		blueButton.addActionListener(this);

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) arg0.getSource();
		System.out.println(buttonPressed);
		if (buttonPressed == redButton) {
			speak("red button");
		}
		if (buttonPressed == yellowButton) {
			speak("yellow button");
		}
		if (buttonPressed == greenButton) {
			speak("this is not a button");
		}
		if (buttonPressed == blueButton) {
			speak("why are you still pressing these?");
		}

	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
