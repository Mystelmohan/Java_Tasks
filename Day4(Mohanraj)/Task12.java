package Day4;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int flag=0;
        System.out.println("Enter num");
        int a=sc.nextInt();
        if(a==0||a==1){
            flag=1;
        }
        for(int i=2;i<a;i++){
            if(a%i==0){
                flag=1;
                break;
            }
        }
        if(flag==0){
            System.out.println("Prime number");
        }else{
            System.out.println("Not a prime number");
        }
        sc.close();
    }
}
