import java.util.Scanner;

public class ATM {
	public static void main(String args[]) {
		int balance=100000,withdraw , diposit;
		Scanner sc =new Scanner(System.in);
		while (true){
			System.out.println("Automated Teller Machin");
			System.out.println("Choose 1 for Withdraw");
			System.out.println("Choose 2 for Doposit");
			System.out.println("Choose 3 for Check Balance");
			System.out.println("Choose 4 for Exit");
			System.out.println("Choose the operation you want to perform");
			
			int choice=sc.nextInt();
			switch(choice) {
			case 1:System.out.println("Enter money to be Withdrawn");
			withdraw =sc.nextInt();
			if(balance>=withdraw) {
				balance= balance-withdraw;
				System.out.println("Please collect your money");
			}
			else {
				System.out.println("Insufficient Balance");
			}
			System.out.println();
			break;
			
			case 2:System.out.println("Enter money to deposited");
			diposit=sc.nextInt();
			diposit=balance+diposit;
			System.out.println("Your money has been successfully depsited");
			System.out.println();
			break;
			
			case 3:System.out.println("Balance :"+balance);
			System.out.println();
			break;
			
			case 4:System.out.println(0);
			break;
			default:System.out.println("Choose Correct Option");
			
			}
		}
		
	}
}
