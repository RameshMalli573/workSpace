package assignment_package;
//0.5 * at^2 + vit + xi

public class GravityCalculator {
	public static void main(String[] args) {
		double gravity = -9.81;
		double fallingTime = 10.0;
		double initialVelocity = 0.0;
		double initialPosition = 0.0;
		double finalPosition = 0.5 * gravity * (fallingTime * fallingTime) + (initialVelocity * fallingTime)
				+ initialPosition;

		System.out.println("The objects position after " + fallingTime + " Seconds is " + finalPosition + "m");
	}
}

// UnModified Output - The objects position after 10.0 Seconds is 0.0m
//Modified Output - The objects position after 10.0 Seconds is -490.5m