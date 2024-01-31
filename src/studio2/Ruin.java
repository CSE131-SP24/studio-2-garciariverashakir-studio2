package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in); 
		
		System.out.println("Start Amount: ");
		int startAmount = in.nextInt();  
		
		System.out.println("Win Limit: ");
		int winLimit = in.nextInt();  
		
		System.out.println("Your win Chance:  ");
		double winChance = in.nextDouble(); 
		
		double CurrentAmount= startAmount;
		
		for (int totalSimulations = 5; totalSimulations <= 5; totalSimulations++);
				{
		while (CurrentAmount < winLimit && CurrentAmount>0) {
			double bet= Math.random(); 
		 
			if (bet< winChance) {
				//System.out.print("Success"); 
				CurrentAmount++;
			}
			else {
				//System.out.print("Ruin"); 
				CurrentAmount--;
			} 
			
		} 
		System.out.print("Current Amount:"+ CurrentAmount);

		}
		
		
		

	}

}
