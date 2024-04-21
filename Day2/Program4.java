package Day2;

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Name");
        String name=sc.nextLine();
        System.out.println("Enter Dept");
        String dept=sc.nextLine();
        System.out.println("Enter Mobile");
        long mobile=sc.nextLong();
        sc.nextLine();
        System.out.println("Enter college");
        String college=sc.nextLine();
        System.out.println("Enter Address");
        String addr=sc.nextLine();
        System.out.println("-----------------------\nur Details");
        System.out.println(name+"\n"+dept+"\n"+mobile+"\n"+college+"\n"+addr);
        sc.close();
    }
}
