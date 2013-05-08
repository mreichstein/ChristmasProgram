package christmas.test;

import java.awt.*;
import javax.swing.*;

public class HomePanel extends JPanel {
	public JLabel label1;
	
	public HomePanel() {
		
		JPanel secondPanel = new JPanel();
		secondPanel.setLayout(new BorderLayout());
		label1 = new JLabel();
		secondPanel.add(label1, BorderLayout.NORTH);
		this.add(secondPanel);
	}
	
}
