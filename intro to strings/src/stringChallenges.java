import java.util.Scanner;

public class stringChallenges
	{

		public static void main(String[] args)
			{
				challengeOne();
//				challengeTwo();
//				challengeThree();
			}
		
		
		public static void challengeOne()
		{
			Scanner screamInCaps = new Scanner(System.in);
			System.out.println("You have permisssion to use your outside voice here. Go ahead and scream!");
			String scream = new String (screamInCaps.nextLine());
			String caps = new String (scream.substring(0,1));
			System.out.println(caps.toUpperCase() + scream.substring(1).toLowerCase());
		}
		
		public static void challengeTwo()
		{
			Scanner userText = new Scanner(System.in);
			System.out.println("please say something");
			
			
		}
		

	}
