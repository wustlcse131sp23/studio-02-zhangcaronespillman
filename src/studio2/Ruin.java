package studio2;

import java.util.Scanner;

public class Ruin {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		//Scanners for variables
		System.out.println("Enter your start amount: ");
		double startAmount = in.nextDouble();
		System.out.println("Enter your win chance: ");
		double winChance = in.nextDouble();
		System.out.println("Enter your win limit: ");
		double winLimit = in.nextDouble();
		double wallet = startAmount;
		//Algorithm for expected ruin rate
		double expectedRuin;
		double alpha = (1-winChance)/winChance;
		if (winChance == 0.5)
		{
			expectedRuin = 1 - (startAmount/winLimit);
		}
		else
		{
			expectedRuin = (Math.pow(alpha, startAmount);
		}
		
		//Code logic for running gambling system
		for (int totalSimulations = 1; totalSimulations <= 6; totalSimulations++)
		{
			System.out.println("Start of day: " + totalSimulations);
			while (wallet < winLimit && wallet > 0) 
			{
				double calculator = Math.random();
				if (calculator <= winChance)
				{
					System.out.println("Win");
					wallet++;
					System.out.println("Your balance is: $" + wallet);
				}
				else
				{
					System.out.println("Loss");
					wallet--;
					System.out.println("Your balance is: $" + wallet);
				}
			}

			if (wallet == winLimit)
			{
				System.out.println("Your day was a success!");
			}
			else
			{
				System.out.println("Your day was a ruin...");
			}
			System.out.println("End of day  " + totalSimulations);
			wallet = startAmount;
			System.out.println("----------------------------");
		}
		

	}
}
