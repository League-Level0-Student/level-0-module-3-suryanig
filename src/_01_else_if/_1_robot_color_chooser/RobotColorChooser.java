
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {
		for (i = 0; i > 10; i++) {

			// 1. Create a new Robot
			Robot rob = new Robot();
			// 2. Make the robot draw a shape (this will take more than one line of code)
			// 3. Set the pen width to 10
			rob.setPenWidth(10);
			// 4. Ask the user what color pen they would like the robot to draw with
	String x=JOptionPane.showInputDialog("Would you like red, blue, green, or black");
			if (x.equals("red")) {
				rob.setPenColor(red);
			}
			// 5. Use an if/else statement to set the pen color that the user requested
			// 6. If the user doesn't enter anything, choose a random color
			// 7. Put a loop around your code so that you keep asking the user for more
			// colors & drawing them

		}

	}
}
