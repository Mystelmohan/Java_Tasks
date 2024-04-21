package Day2;

import java.util.Scanner;

public class Program11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=m;j++) {
                if((j==1||j==m)||i==n||i==1) {
                    System.out.print("* ");
                }else{  
                       System.out.print("  ");
                }
            }
            System.out.println();
    }
    sc.close();
    }
}