package Day4;

import java.util.Scanner;

public class Task19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter radius");
        double r=sc.nextDouble();
        double peri=2*Math.PI*r;
        System.out.printf("Circle area = %.4f",peri);
        sc.close();
    }
}
