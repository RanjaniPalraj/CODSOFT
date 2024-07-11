import java.util.Scanner;
import java.io.*; 
public class per { 
	public static void main(String[] args) 
	{ 
		int total = 0; 
		float percentage; 
		System.out.print("Enter the number of subjects: ");
		Scanner num = new Scanner(System.in);
		int N=num.nextInt();
		for (int i = 0; i < N; i++) 
		{
		System.out.print("Enter Marks: ");
		Scanner scan = new Scanner(System.in);
		int marks=scan.nextInt();	
		total += marks; 
		} 
		System.out.println("Total Marks : " + total); 
		percentage = (total / (float)N); 
		System.out.println( "Total Percentage : " + percentage + "%"); 
	} 
}
