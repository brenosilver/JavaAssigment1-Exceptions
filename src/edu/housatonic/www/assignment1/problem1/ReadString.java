//****************************************************************************************
//	Author: Breno Silva		Last Modified: 02/20/14		Problem 1
//
//	CSC*E224				Programming Assignment I	Project 11.1
//****************************************************************************************

package edu.housatonic.www.assignment1.problem1;

import java.util.Scanner;

public class ReadString {


	public static void main(String[] args) throws StringTooLongException {
		final int MAX = 20;
		String input = "";
		
		Scanner scan = new Scanner(System.in);
		
		do{
			System.out.println("Enter Strings, enter DONE when finished: ");
			input = scan.nextLine();
			
			if(input.length() > MAX)
				throw new StringTooLongException("The string is too long!");
			else
				System.out.println(input);
			
		}while(!input.equals("DONE"));
		

	}

}
