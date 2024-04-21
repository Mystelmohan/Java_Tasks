import java.util.Scanner;

public class SimpleCalculator {
	public static void main(String args[]) {
		 Scanner sc=new Scanner(System.in);
		 int c;
		 while(true){
		 System.out.println("1.add\n2.sub\n3.mul\n4.div\n5.exit");
    	 System.out.println("Enter an operator : ");
    	 c=sc.nextInt(); 
    	 if(c==5) {
    		 break;
    	 }
    	 System.out.println("Enter first num: ");
    	 double a=sc.nextDouble();
    	 System.out.println("Enter second num: ");
    	 double b=sc.nextDouble();
    	 switch(c) {
    	 case 1:
    		 System.out.print("Addition is :"+(a+b));
    		 break;
    	 case 2:
    		 System.out.print("subtraction is :"+(a-b));
    		 break;
    	 case 3:
    		 System.out.print("Multiplication is :"+(a*b));
    		 break;
    	 case 4:
    		 System.out.print("Division is :"+(a/b));
    		 break;
    	
    	default:
    		System.out.print("Invalid");
    	 }
    	 System.out.println();
    	 
		 }
		 sc.close();
	}
}
