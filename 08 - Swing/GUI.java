import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

class GUI {
	
	static void createAndDisplay() {
		//Creates the window
		JFrame frame = new JFrame("First example");
		frame.setSize(400, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Creates the JPanel that will contain all other JPanels
		JPanel groupContainer = new JPanel();
		
		//Creates three groups, each with one JPanel containing 3 components
		addGroupOfComponents("Group1", groupContainer);
		addGroupOfComponents("Group2", groupContainer);
		addGroupOfComponents("VAD SOM HELST", groupContainer);
		
		//Add the JPanel container to the window
		frame.add(groupContainer);
		frame.setVisible(true);
	}
	
	private static void addGroupOfComponents(String text, JPanel container) {
		//Creates components
		JLabel label = new JLabel(text +" Label");
		JButton button = new JButton(text +" Button");
		JTextField textField = new JTextField(text +" TextField", 25);
		
		//Adds an eventlistener to the button
		//Passes the label and TextField as arguments to in order to be able to use them in the response method
		addButtonListener(button, label, textField);
		
		//Adds the components to the JPanel container
		container.add(textField);
		container.add(button);
		container.add(label);
	}
	
	//This method takes three different Swing components as parameters
	private static void addButtonListener(JButton b, JLabel l, JTextField tf) {
		ActionListener bListener = new ActionListener() {
			
			//The response method
			//Is called every time an event is detected 
			//There will exist three different action listeners, one for each button
			//Each action listener will be able to use the label and textfield in the same container as the button
			//This is because they are passed as arguments when addButtonListener is called
			@Override
			public void actionPerformed(ActionEvent e) {
				l.setText(tf.getText());
				tf.setText("");
			}
				
		};
		
		b.addActionListener(bListener);
	}
	
	
}
