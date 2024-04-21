package Day3;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num");
        int a =sc.nextInt();
        for(int i=1;i<=a;i++){
            for(int k=a;k>=i;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(a+" ");
            }
            
            System.out.println();
        }
        sc.close();
    }
}
