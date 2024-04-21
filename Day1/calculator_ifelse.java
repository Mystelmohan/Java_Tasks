import java.util.Scanner;

public class calculator_ifelse {
	 public static void main(String args[]) {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.print("Enter first num: ");
    	 double a=sc.nextDouble();
    	 System.out.print("Enter second num: ");
    	 double b=sc.nextDouble();
    	 System.out.print("Enter an operator (+, -, *, /): ");
    	 char c=sc.next().charAt(0);
    	 if(c=='+') {
    		 System.out.print((a+b));
    	 }else if(c=='-') {
    		 System.out.print((a-b));
    	 }
    	 else if(c=='*') {
    		 System.out.print((a*b));
    	 }else if(c=='/') {
    		 System.out.print((a/b));
    	 }else {
    		 System.out.print("Invalid");
    	 }
    	 sc.close();
	 }
}