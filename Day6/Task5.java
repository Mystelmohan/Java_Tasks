package Day6;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
                int rows = 5;
                Scanner s=new Scanner(System.in);
                int n=s.nextInt();
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < rows - i-1; j++) {
                        System.out.print(" ");
                    }
                    for (int k = 0; k <= i; k++) {
                        System.out.print(n);
                    }
                    System.out.println();
                }
            }
        }
