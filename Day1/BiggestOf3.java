import java.util.*;
public class BiggestOf3 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>=b&&a>=c) {
			System.out.print(a+" is biggest ");
		}else if(b>=a&&b>=c) {
			System.out.print(b+" is biggest ");
		}else {
			System.out.print(c+" is biggest ");
		}
		sc.close();
	}
}
