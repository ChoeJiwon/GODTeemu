package Quiz;

import javax.swing.JOptionPane;

// Answer about Quiz1,2,3
public class Answer {
	private int answer;

	public int getAnswer() {
		return answer;
	}

	public void setAnswer(int answer, Boolean b) {
		// encapsulation with guardian and show Quiz2 about encapsulation

		if (answer <= 0 || answer > 4) {
			JOptionPane.showMessageDialog(null, "Answer must be more than 0 and smaller than 4");
			if(b==true){
			Quiz2 q2 = new Quiz2();
			q2.go();
			}

		}
		this.answer = answer;

	}

	
}
