package Day4;

import java.util.Scanner;

public class Task18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius");
        double r=sc.nextDouble();
        double area=Math.PI*r*r;
        System.out.printf("Circle area = %.4f",area);
        sc.close();
    }
}
