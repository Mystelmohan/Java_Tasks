package Day2;

import java.util.Scanner;

public class program10 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=5;i++){
            for(int j=n;j>=i;j--){
                System.out.print(j);
            }
            System.out.println();
        }
        sc.close();
    }
}
