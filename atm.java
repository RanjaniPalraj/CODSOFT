import java.util.Scanner;  
public class atm
{  
    public static void main(String args[] )  
    {  
        int balance = 50000, withdraw, deposit;  
           
        Scanner sc = new Scanner(System.in);  
          
        while(true)  
        {  
            System.out.println("Automated Teller Machine");  
            System.out.println("Select 1 for Withdraw the Money");  
            System.out.println("Select 2 for Deposit the Money");  
            System.out.println("Select 3 for Check Balance of your Account");  
            System.out.println("Select 4 for EXIT");  
            System.out.print("Choose the above operation you want to perform:");  
            int choice = sc.nextInt();  
            switch(choice)  
            {  
                case 1:  
        System.out.print("Enter money to be withdrawn:");  
        withdraw = sc.nextInt();           
       
	if(balance >= withdraw)  
        {    
            balance = balance - withdraw;  
            System.out.println("Please collect your money");  
        }  
        else  
        {  
            System.out.println("Insufficient Balance");  
        }  
        System.out.println("");  
        break;  
   
                case 2:  
                      
        System.out.print("Enter money to be deposited:");  
        deposit = sc.nextInt();                     
        balance = balance + deposit;  
        System.out.println("Your Money has been successfully depsited");  
        System.out.println("");  
        break;  
   
                case 3:  
        System.out.println("Balance : "+balance);  
        System.out.println("");  
        break;  
   
                case 4:  
        System.exit(0);  
            }  
        }  
    }  
}
