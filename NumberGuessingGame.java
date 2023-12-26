import java.util.*;
public class NumberGuessingGame
{
	public static void main(String[] args)
	{
		Random random=new Random();
		
		int minNum=1;
		int maxNum=100;
		int maxAttempts=5;
		int totalRounds=2;
		boolean guessedNum=false;
		
		System.out.println("Heyyyy Welcome to the Number Guessing Game!!!");
		System.out.println("I will generate a number between"+" "+minNum+" "+"and"+" "+maxNum+"."+"You have"+" "+maxAttempts+" "+"attempts to guess the number.\nLETS GET STARTED...");
		
		for(int round=1;round<=totalRounds;round++)
		{
			int numGenerated=random.nextInt(maxNum-minNum+1)+minNum;
			
			int attempt=0;
			System.out.println("ROUND"+" "+round+" BEGINS...");
			while(attempt<maxAttempts)
			{
				Scanner sc =new Scanner(System.in);
				System.out.println("Guess the number between"+" "+minNum+" "+maxNum+":");
				int num=sc.nextInt();
				attempt++;
				if(num == numGenerated) 
				{
					guessedNum=true;
					break;
				}
				else if(num<numGenerated) {
					 System.out.println("Too low! Try again.");
				}
				else {
					System.out.println("Too high! Try again.");
				}
			}
			if(guessedNum==true) {
				System.out.println("Congratulations!! You've guessed the number correctly in "+attempt+" attempts.");
			}
			  System.out.println("Ooops! Better luck next time:)\nThe number was: " +numGenerated);
			  guessedNum=false;
			  
		}
		
		
	}
}