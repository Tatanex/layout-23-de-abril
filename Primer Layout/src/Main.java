
import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Button;




public class Main {

	public static void main(String[] args) {

		
		JFrame frame =  new JFrame ("Layout");
		
		frame.setSize(400,400);
		
		JPanel panel = new JPanel();
		
		JButton btn1 = JButton;
		JButton btn2 = JButton;
		JButton btn3 = JButton;
		JButton btn4 = JButton;
		
		BorderLayout(bl);
		panel.add(btn1,BorderLayout.NORTH);
		panel.add(btn2,BorderLayout.SOUTH);
		panel.add(btn3,BorderLayout.CENTER);
		panel.add(btn4,BorderLayout.WEST);
		panel.add(btn5,BorderLayout.EAST);

		frame.add(panel);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}

}
