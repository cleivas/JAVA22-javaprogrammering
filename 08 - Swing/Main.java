import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {

	public static void main(String[] args) {
//		GUI.createAndDisplay();
		
		JFrame frame = new JFrame();
		frame.setSize(220, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel container = new JPanel();
		
		GroupOfCOmponents firstGroupListener = new GroupOfCOmponents("Knapp 1", "Knapp 1 har klickats!");
		GroupOfCOmponents secondGroupListener = new GroupOfCOmponents("Knapp 2", "Knapp 2 har klickats!");
		
		container.add(firstGroupListener.panel);
		container.add(secondGroupListener.panel);

		frame.add(container);
		frame.setVisible(true);
	}

}
