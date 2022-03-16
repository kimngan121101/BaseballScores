/*
 * Author: Ngan Hoang
 * Date : 10/26/19
 * Course: CSC110AB
 * Program name: Baseball Scores
 * Program Purpose : Create a program to calculate the sum of baseball team's score 
 */
package assignment;
import java.util.Scanner;
public class BaseballScores_NganHoang {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner (System.in);
		
		// Declare variables
		
		final int Innings = 9; 
		int [] total = new int [2]; // Score array
		String [] teamName = new String [2]; // Team array
		int score ;
		int i ;
		int i1;
		int finaltotal ;
		
		// Beginning of the program
		
		System.out.println("Please enter done or enter the name of the first team");
		teamName[0]= keyboard.nextLine();
						
		while (!teamName[0].equalsIgnoreCase("done")) {
			
			System.out.println("Please enter the name of the second team");
			teamName [1] = keyboard.nextLine(); 
			
			for (i1 = 0; i1 <2; i1++) {
				finaltotal = 0;
				for (i = 0; i < Innings ; i++) {
				System.out.println("How many runs were scored in inning "+(i+1)+ " by team "+teamName [i1]+" cubs." );
				score = keyboard.nextInt();
				finaltotal += score; 			
			}
				total[i1] = finaltotal;	 
				}
			// Execute team's name and the total score
			
			System.out.println("Team : "+ teamName[0]+ " Total Score: "+ total[0]);
			System.out.println("Team : "+ teamName[1]+ " Total Score: "+ total[1]);
			
		  keyboard.nextLine(); // Forcing the keyboard to new line
		  
		  System.out.println("Please enter done or enter the name of another first team");
			teamName[0]= keyboard.nextLine();
		}
		// If user enter done
		
		System.out.println("Program complete!");

		keyboard.close(); // Prevent source leak
	}

}
