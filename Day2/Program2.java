package Day2;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first num: ");
        int a=sc.nextInt();
        System.out.println("Enter second num: ");
        int b=sc.nextInt();
        System.out.println("Enter third num: ");
        int c=sc.nextInt();
        if(a>=b&&a>=c){
            System.out.println(a+" is largest");
        }else if(b>=a&&b>=c){
            System.out.println(b+" is largest");
        }else{
            System.out.println(c+" is largest");
        }
        sc.close();
    }
}
