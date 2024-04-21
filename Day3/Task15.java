package Day3;
import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num: ");
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
            odd(i);
            even(i);
            prime(i);
        }
        sc.close();
    }
    static void odd(int a){
        if(a%2!=0){
            System.out.println("odd = "+a);
        }
    }
    static void even(int a){
        if(a%2==0){
            System.out.println("Even = "+a);
        }
    }
    static void prime(int a){
        boolean flag=false;
        if(a==1){
            flag=true;
        }
        for(int i=2;i<=a/2;i++){
            if(a%i==0){
               flag=true;
               break;
            }
        }
        if(!flag){
            System.out.println("Palindrome= "+a);
        }
    }
}
