package artphi.bblu.GUI;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class BbluStatusBar extends JPanel {
	private JLabel message;
	
	public BbluStatusBar() {
		// TODO Auto-generated constructor stub
		add(message = new JLabel());
		setBackground(Color.lightGray);
		setLayout(new GridLayout(1, 1));
	}/**
	 * Define the message
	 * 
	 * @param message
	 *            The message to show
	 */
	public void setMessage(String message) {
		this.message.setText(message);
	}
}
