package Day4;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num");
        int a=sc.nextInt();
        int fact=1;
        for(int i=1;i<=a;i++){
           fact*=i;
        }
        System.out.println("facttorial is "+fact);
        sc.close();
    }
}
