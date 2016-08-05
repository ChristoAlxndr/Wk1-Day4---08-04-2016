package com.methods.review;

import java.util.Scanner;

public class PigLatinExplorerMode {

	public static void main(String[] args) {

		System.out.println("Xander's Elementary English to 'Latin' Translator. \n" + 
				"Please enter a word or phrase. \n");

		Scanner sc = new Scanner(System.in);
		String userInput = sc.nextLine();

//		boolean isVowel = true;
				
		StringBuilder modUserInput = new StringBuilder(userInput.toLowerCase());
		char firstLetter = modUserInput.charAt(0);
		
			switch (firstLetter) { 
				case 'a':
				appendVowelMthd(modUserInput);
				System.out.println(modUserInput);
				break;
				
				case 'e':
				appendVowelMthd(modUserInput);
				System.out.println(modUserInput);
				break;

				case 'i':
				appendVowelMthd(modUserInput);
				System.out.println(modUserInput);
				break;

				case 'o':
				appendVowelMthd(modUserInput);
				System.out.println(modUserInput);
				break;

				case 'u':
				appendVowelMthd(modUserInput);
				System.out.println(modUserInput);
				break;
				
				default:
//				isVowel = false;
				appendConsonantMthd(modUserInput);
				System.out.println(modUserInput);
		}
	}

	public static String appendVowelMthd(StringBuilder modUserInput) 
	{
		String PL = new String("-ay");
		
		modUserInput.append(PL);
		return modUserInput.toString();
	}
	
	public static String appendConsonantMthd(StringBuilder modUserInput) 
	{
		String PL = new String("-ay");
		char firstLetter = modUserInput.charAt(0);
		
		modUserInput.append(PL);
		return modUserInput.toString();
		
	}
}