package arvauspeli1;

import java.util.Scanner;

public class arvauspeli {

	public static void main(String[] args) {

		
		Scanner in = new Scanner(System.in);

		String nimi;
		int guess = 0;
		String stop = "End";

		System.out.println("What is my name");

		do
		{
		nimi = in.nextLine();
//		if (stop.equals(nimi)) {
//			System.out.println("You guessed " + guess + " times.");
//			guess--;
//			}
		
		guess++;
		if(nimi.equals("Mani"))
		{
		System.out.println("You guessed right.");

		break;
		}

		if (!nimi.equals(stop))
		{
		System.out.println("You can guess again or write End to end the game)");
		
		}
		}
		while(!nimi.equals("End"));

	}

}
