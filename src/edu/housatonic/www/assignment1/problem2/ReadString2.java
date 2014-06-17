//****************************************************************************************
//	Author: Breno Silva		Last Modified: 02/20/14		Problem 2
//
//	CSC*E224				Programming Assignment I	Project 11.2
//****************************************************************************************

package edu.housatonic.www.assignment1.problem2;

import java.util.Scanner;

import edu.housatonic.www.assignment1.problem3.InvalidDocumentCodeException;

public class ReadString2 {


	public static void main(String[] args) {
		final int MAX = 20;
		String input = "";
		
		Scanner scan = new Scanner(System.in);
		
		do{
			System.out.println("Enter Strings, enter DONE when finished: ");
			input = scan.nextLine();
			
			try{
				if(input.length() > MAX)
					throw new StringTooLongException("The string is too long!");
				else
					System.out.println(input);
				
			}catch(StringTooLongException e){
				System.out.println(e.getMessage());
				System.out.println("Try Again");
			}
			
			
		}while(!input.equals("DONE"));

	}

}
