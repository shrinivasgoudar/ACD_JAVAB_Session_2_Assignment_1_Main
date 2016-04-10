/**
 * 
 */
package com.acadgild.controlstructure;

/**
 * @author shrinivasa.goudar
 *
 */
public class IfElseStatementProgram {

	/**
	 * @param args
	 */
	public static void main(String args[]) {
		// Declaring a variable "age" and initializing it with a value 18
		int age = 18;
		System.out.println("Enter your age :" + age);
		// Checking if "age" is greater than or equal to 18
		if (age >= 18) {
			// This block will be executed only if "age" is greater than or
			// equal to 18
			System.out.println("You are elgible to Vote");
		} else {
			// This block will be executed only if "age" is less than 18
			System.out.println("You are not elgible to Vote");

		}
	}

}
