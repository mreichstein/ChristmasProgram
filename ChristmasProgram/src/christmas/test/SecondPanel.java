package christmas.test;

import java.awt.*;

import javax.swing.*;

public class SecondPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	
	public JLabel label1;
	
	public SecondPanel() {
		JPanel secondPanel = new JPanel();
		secondPanel.setLayout(new BorderLayout());
		label1 = new JLabel("In this window you can create your own 12 Days of Christmas Song!");
		secondPanel.add(label1, BorderLayout.NORTH);
		this.add(secondPanel);
		
	}
	
}
