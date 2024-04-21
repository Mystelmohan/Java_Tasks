package Day2;

import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        b=c+b;
        c=b-c;
        b=b-c;
        System.out.println("a="+a+"\nb="+b+"\nc="+c);
        sc.close();
    }
}
