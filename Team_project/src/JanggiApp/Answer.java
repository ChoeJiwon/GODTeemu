package JanggiApp;

import javax.swing.JOptionPane;

public class Answer {
	private int answer;

	public int getAnswer() {
		return answer;
	}

	public void setAnswer(int answer) {

		if (answer <= 0||answer>4) {
			JOptionPane.showMessageDialog(null, "Answer must be more than 0 and smaller than 4");
			Quiz2 q2 = new Quiz2();
			q2.go();
		}
		this.answer = answer;

	}
}
