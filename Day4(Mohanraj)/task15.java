package Day4;

import java.util.Scanner;

public class task15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num");
        int a=sc.nextInt();
        int originalNumber, remainder, result = 0;

        originalNumber = a;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == a)
            System.out.println(a + " is an Armstrong number.");
        else
            System.out.println(a + " is not an Armstrong number.");
        sc.close();
    }
}
