package com.methods.review;

public class FizzBuzzWithMethods {
	
	public static void main(String[] args) {

		for (int i = 1; i <= 110; i++) {

			if (divisibleByAllThree(i)) {
				System.out.println("FIZZ BUZZ BANG");
			}

			else if (divisableByThreeAndFive(i)) {
				System.out.println("FIZZ BUZZ");
			}

			else if (divisibleByThreeAndSeven(i)) {
				System.out.println("FIZZ BANG");
			}

			else if (divisibleByFiveAndSeven(i)) {
				System.out.println("BUZZ BANG");
			}

			else if (divisibleByOnlyThree(i)) {
				System.out.println("FIZZ");
			}

			else if (divisibleByOnlyFive(i)) {
				System.out.println("BUZZ");
			}

			else if (divisibleByOnlySeven(i)) {
				System.out.println("BANG");
			}

			else {
				System.out.println(i);
			}
		}
	}

	public static boolean divisibleByAllThree(int fromTheForLoop) {
		boolean howsIsThis = false;

		if (((fromTheForLoop % 3) == 0) && ((fromTheForLoop % 5) == 0) && (fromTheForLoop % 7) == 0) {
			howsIsThis = true;
		}

		return howsIsThis;
	}

	public static boolean divisableByThreeAndFive(int fromTheForLoop) {
		boolean howIsThisForThreeAndFive = false;

		if (((fromTheForLoop % 3) == 0) && ((fromTheForLoop % 5) == 0)) {
			howIsThisForThreeAndFive = true;
		}
		return howIsThisForThreeAndFive;
	}

	public static boolean divisibleByThreeAndSeven(int fromTheForLoop) {
		boolean howIsThisForThreeAndSeven = false;

		if (((fromTheForLoop % 3) == 0) && ((fromTheForLoop % 7) == 0)) {
			howIsThisForThreeAndSeven = true;
		}
		return howIsThisForThreeAndSeven;
	}

	public static boolean divisibleByFiveAndSeven(int fromTheForLoop) {
		boolean howIsThisForFiveAndSeven = false;

		if (((fromTheForLoop % 5) == 0) && ((fromTheForLoop % 7) == 0)) {
			howIsThisForFiveAndSeven = true;
		}
		return howIsThisForFiveAndSeven;
	}

	public static boolean divisibleByOnlyThree(int fromTheForLoop) {
		boolean howIsThisForThree = false;

		if ((fromTheForLoop % 3) == 0) {
			howIsThisForThree = true;
		}
		return howIsThisForThree;
	}

	public static boolean divisibleByOnlyFive(int fromTheForLoop) {
		boolean howIsThisForFive = false;

		if ((fromTheForLoop % 5) == 0) {
			howIsThisForFive = true;
		}
		return howIsThisForFive;
	}

	public static boolean divisibleByOnlySeven(int fromTheForLoop) {
		boolean howIsThisForSeven = false;

		if ((fromTheForLoop % 7) == 0) {
			howIsThisForSeven = true;
		}
		return howIsThisForSeven;
	}
}
