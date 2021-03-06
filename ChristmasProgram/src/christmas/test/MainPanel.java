package christmas.test;

import java.awt.*;
import javax.swing.*;

public class MainPanel extends JApplet {
	private static final long serialVersionUID = 1L;
	
	// sets window size
	private int APPLET_WIDTH = 1000, APPLET_HEIGHT = 1000;
	private JTabbedPane tPane;
	private HomePanel homePanel;
	private TwelveDaysOfChristmas firstPanel;
	private SecondPanel secondPanel;
	
	// initializes the Applet pane with 2 tabs
	public void init() {
		
		// register panels
		homePanel = new HomePanel();
		firstPanel = new TwelveDaysOfChristmas();
		secondPanel = new SecondPanel();
		
		// create a tabbed pane with two tabs
		tPane = new JTabbedPane();
		tPane.addTab("Home", homePanel);
		tPane.addTab("Classic 12 Days of Christmas", firstPanel);
		tPane.addTab("Make Your Own 12 Days of Christmas", secondPanel);
		getContentPane().add(tPane);
		
		// makes the tab pane green
		tPane.setBackground(Color.green);
		
		// Set the applet's size
		setSize(APPLET_WIDTH, APPLET_HEIGHT);
		
	}
	
}
