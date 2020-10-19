
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;

public class RobotColorChooser {
	public static void main(String[] args) {

		// 1. Create a new Robot
		Robot rob = new Robot();
		// 2. Make the robot draw a shape (this will take more than one line of code)
		rob.penDown();
		rob.setSpeed(30);
		for (int i = 0; i < 3; i++) {

			// 3. Set the pen width to 10
			rob.setPenWidth(10);
			// 4. Ask the user what color pen they would like the robot to draw with
			String color = JOptionPane.showInputDialog("Would you like red, blue, green, or black");
			if (color.equals("red")) {
				rob.setPenColor(Color.RED);
			}
			else if (color.equals("blue")) {
				rob.setPenColor(Color.CYAN);
			}
			else if (color.equals("green")) {
				rob.setPenColor(Color.green);

			} else {
				rob.setPenColor(Color.black);
			}
			// 5. Use an if/else statement to set the pen color that the user requested
			// 6. If the user doesn't enter anything, choose a random color
			// 7. Put a loop around your code so that you keep asking the user for more
			// colors & drawing them
			rob.move(100);
			rob.turn(120);

		}

	}
}
