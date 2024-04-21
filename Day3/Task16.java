package Day3;

import java.util.Scanner;

public class Task16 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num");
        int a=sc.nextInt();
        if(isplaindrome(a)){
            System.out.println(a+" is palindrome");
        }else{
            System.out.println(a+" is not a palindrome");
        }
        sc.close();
    }
    static boolean isplaindrome(int n){
        int sum=0;
        int a=n;
        while(a!=0){
         sum*=10;
         sum+=a%10;
         a/=10;
        }
        if(sum==n){
         return true;
        }else{
         return false;
        }
 }

}
