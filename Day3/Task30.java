package Day3;

import java.util.Scanner;

public class Task30 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num (1 to 3):");
        int a=sc.nextInt();
        switch (a) {
            case 1:
                System.out.println("hi");
                break;
            case 2:
                System.out.println("hello");
                break;
            case 3:
                System.out.println("welcome");
                break;
            default:
                System.out.println("invalid");
                break;
        }
        sc.close();
    }
}
