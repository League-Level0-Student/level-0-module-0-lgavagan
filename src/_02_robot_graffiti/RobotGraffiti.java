package _02_robot_graffiti;

import org.jointheleague.graphical.robot.Robot;

public class RobotGraffiti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot liam = new Robot();
		liam.penDown();
		liam.setSpeed(1);
		liam.turn(180);
		liam.move(255);
		liam.turn(-90);
		liam.move(220);
		

	}

}
