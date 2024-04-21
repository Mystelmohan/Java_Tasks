import java.util.Scanner;

public class Bank {
	static double balance;
	public static void main(String args[]) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter balance: ");
		  balance=sc.nextDouble();
		  while(true) {
		 System.out.println("1.Deposit\n2.Withdraw\n3.Current Balance\n4.exit");
		 int ch=sc.nextInt();
		 if(ch==4) {
			 break;
		 }
		 switch(ch) {
		 case 1:
			 System.out.println("Enter amount to deposit: ");
			 double dep=sc.nextDouble();
			 balance=deposit(dep);
			 break;
		 case 2:
			 System.out.println("Enter amount to withdraw: ");
			 double withdr=sc.nextDouble();
			 balance=withdraw(withdr);
			 break;
		 case 3:
			 System.out.println("Balance is: "+balance);
			 break;
		 default:{
			 System.out.println("Invalid");
			 break;
		 }
			 
		 }
		  }
		  sc.close();
		 
	}
	static double deposit(double amount) {
		return balance+amount;
	}
	static double withdraw(double amount) {
		if(amount>balance) {
			System.out.println("amount exceeded from balance");
			return balance;
		}else {
			return balance-amount;
		}
	}
}
