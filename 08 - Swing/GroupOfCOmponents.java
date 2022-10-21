import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GroupOfCOmponents implements ActionListener{
	
	JButton button;
	JLabel label;
	JPanel panel;
	String buttonLabel;
	String messageToPrint;
	int counter = 0;
	
	GroupOfCOmponents(String buttonLabel, String messageToPrint){
		
		this.buttonLabel = buttonLabel;
		this.messageToPrint = messageToPrint;
		
		this.button = new JButton(this.buttonLabel);
		label = new JLabel(this.buttonLabel + ": 0");
		panel = new JPanel();
		panel.add(button);
		panel.add(label);

		this.button.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(messageToPrint);
		
		counter++;
		label.setText(buttonLabel + ": "+ counter);
	}
	
}
