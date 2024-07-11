import java.util.Random; 
import java.util.Scanner; 

public class GFG { 
	public static void main(String[] args) 
	{  
		int realnum, guess; 
		final int last = 100;  
		Scanner getnum = new Scanner(System.in);  
		Random rand = new Random(); 
		boolean ans = false;  
		realnum = rand.nextInt(last) + 1;  
		while (!ans) { 
			System.out.print( "Guess a number between 1 and 100: ");  
			guess = getnum.nextInt();  
			if (guess > realnum) { 
				System.out.println("This number is too high, try to guess the small number"); 
			} 
			else if (guess < realnum) { 
				System.out.println("This number is too small, try to guess the large number"); 
			}  
			else { 

				System.out.println( "Yes, you guessed the number."); 
				ans = true; 
			} 
		} 
		System.exit(0); 
	} 
}

