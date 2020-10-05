
package _99_extra;

import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "June 28th";
		String dadsBirthday = "October 16th";
		String myBirthday = "April 23rd";

		// 2. Find out which birthday the user wants and and store their response in a variable
String x=JOptionPane.showInputDialog("Who's birthday do you want to know?");
		// 3. Print out what the user typed
	if (x.equals("mom")) {
		System.out.println(momsBirthday);
	}
	else if (x.equals("dad")) {
		System.out.println(dadsBirthday);
	}
	else if (x.equals("Suryani")) {
		System.out.println(myBirthday);
	}
	else
		System.out.println("Sorry, I don't remember that person's birthday!");
	
	
		// 4. if user asked for "mom"
			//print mom's birthday
		// 5. if user asked for "dad"
			// print dad's birthday
		// 6. if user asked for your name
			// print myBirthday
		//7. otherwise print "Sorry, i don't remember that person's birthday!"

	} 
}
