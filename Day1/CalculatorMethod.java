import java.util.Scanner;

public class CalculatorMethod {
	public static void main(String args[]) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter first num: ");
    	 double a=sc.nextDouble();
    	 System.out.println("Enter second num: ");
    	 double b=sc.nextDouble();
    	 System.out.println("1.add\n2.sub\n3.mul\n4.div\n");
    	 System.out.println("Enter an operator : ");
    	 int c=sc.nextInt(); 
    	 if(c==1) {
    		 System.out.print(sum(a,b));
    	 }else if(c==2) {
    		 System.out.print(sub(a,b));
    	 }
    	 else if(c==3) {
    		 System.out.print(mul(a,b));
    	 }else if(c==4) {
    		 System.out.print(div(a,b));
    	 }else {
    		 System.out.print("Invalid");
    	 }
		 sc.close();
	}
	static double sum(double a,double b) {
		return a+b;
	}
	static double sub(double a,double b) {
		return a-b;
	}
	static double mul(double a,double b) {
		return a*b;
	}
	static double div(double a,double b) {
		return a/b;
	}
	
}
