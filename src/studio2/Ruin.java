package studio2;

import java.util.Scanner;

public class Ruin {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		System.out.println("Enter your start amount: ");
		double startAmount = in.nextDouble();
		System.out.println("Enter your win chance: ");
		double winChance = in.nextDouble();
		System.out.println("Enter your win limit: ");
		double winLimit = in.nextDouble();
		double wallet = startAmount;
		for (int x = 1; x <= 6; x++)
		{
		
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
			System.out.println("End of day  " + x);
			wallet = startAmount;
		}
		}
	}
