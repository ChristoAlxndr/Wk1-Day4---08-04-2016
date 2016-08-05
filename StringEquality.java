package com.methods.review;

import java.util.Scanner;

public class StringEquality {

	public static void main(String[] args) {

		Scanner alien = new Scanner (System.in);
		
		System.out.println("How is your day?");
		System.out.println("You can choose Great, Bad, or So-so.");
		
		String theDayIs = alien.nextLine();
		
		switch (theDayIs.toLowerCase()) {
		case "great":
			System.out.println("Great to hear!");
			break;
			
		case "bad":
			System.out.println("Sorry to hear!");
			break;
			
		case "so-so":
			System.out.println("I hope it gets better.");
			break;

		default:
			break;
		}

	}

}
