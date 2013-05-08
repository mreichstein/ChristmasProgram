package christmas.test;

import java.util.ArrayList;
import java.util.List;
import java.awt.*;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TwelveDaysOfChristmas extends JPanel {
	public JLabel label1;
	
	// GUI components
	public TwelveDaysOfChristmas() {
		JPanel firstPanel = new JPanel();
		firstPanel.setLayout(new BorderLayout());
		label1 = new JLabel("In this window you can see the lyrics to The 12 Days Of Christmas");
		firstPanel.add(label1, BorderLayout.NORTH);
		this.add(firstPanel);
		
	}
	
	public static void main(String[] args) {
		// instance variables
		int day = 0;
		String allGiftsString = " ";
		String toParse = "";
		String st4 = "";
		String st1;
		
		// creates ArrayList giftList, which stores the 12 days of gifts
		List<String> giftList = new ArrayList<String>();
		
		// adds the 12 gifts to giftList
		giftList.add("a partridge in a pear tree");
		giftList.add("two turtle doves");
		giftList.add("three French hens");
		giftList.add("four calling birds");
		giftList.add("five golden rings");
		giftList.add("six geese a-laying");
		giftList.add("seven swans a-swimming");
		giftList.add("eight maids a-milking");
		giftList.add("nine ladies dancing");
		giftList.add("ten lords a-leaping");
		giftList.add("eleven pipers piping");
		giftList.add("twelve drummers drumming");
		
		// for loop cycles through 12 days
		for (int i = 0; i < giftList.size(); i++) {
			
			day++;
			String str2;
			
			if (day == 1) {
				str2 = day + "st";
			} else if (day == 2) {
				str2 = day + "nd";
			} else if (day == 3) {
				str2 = day + "rd";
			} else {
				str2 = day + "th";
			}
			
			st1 = "On the " + str2 + " day of Christmas, my true love gave to me ";
			
			// print gifts in reverse order followed by comma, except for last
			for (int j = day - 1; j > 0; j--) {
				st1 += giftList.get(j) + ", ";
			}
			
			// if it's not the first day, print the and after the other gifts
			st1 += (day == 1) ? giftList.get(0) : "and " + giftList.get(0);
			
			System.out.println(st1);
			
		}
		
	}
	
}
