package Day4;

import java.util.Scanner;

public class Task20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter length ");
        int l=sc.nextInt();
        System.out.println("Enter breadth ");
        int b=sc.nextInt();
        int area=l*b;
        System.out.println("Area= "+area);
        sc.close();
    }
}
