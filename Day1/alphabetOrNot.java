import java.util.*;
public class alphabetOrNot {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		char a=sc.next().charAt(0);
		if(a>=97&&a<=122 || a>=65&&a<=90) {
			System.out.print("Alphabet");
		}else {
			System.out.print("NOt an Alphabet");
		}
		sc.close();
	}
}