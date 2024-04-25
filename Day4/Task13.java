package Day4;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num");
        int a=sc.nextInt();
        int c=a;
        int b=0;
        while(c!=0){
            b=b*10+c%10;
            c/=10;
        }
        if(a==b){
            System.out.println("palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
        sc.close();
    }
}
