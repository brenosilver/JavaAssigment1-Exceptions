//****************************************************************************************
//	Author: Breno Silva		Last Modified: 02/20/14		Problem 3
//
//	CSC*E224				Programming Assignment I	Project 11.3
//****************************************************************************************

package edu.housatonic.www.assignment1.problem3;

import java.util.Scanner;

public class CheckDocument {

	public static void main(String[] args) throws InvalidDocumentCodeException {
		String input = "";

		Scanner scan = new Scanner(System.in);

		System.out.println("Enter Document Name: ");
		input = scan.nextLine();
		
		char foo = input.charAt(0);
		if(!(foo == 'U' || foo == 'C' || foo == 'P'))
			throw new InvalidDocumentCodeException("Improper Document Designation Encoutered");
		else
			System.out.println(input);

	}

}
