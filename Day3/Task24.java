package Day3;

public class Task24 {
    public static void main(String[] args) {
        int a=10,b=5;
        System.out.println("add ="+(a+b));
        System.out.println("sub ="+(a-b));
        System.out.println("Mul ="+(a*b));
        System.out.println("div ="+(a/b));
        System.out.println("Mod ="+(a%b));
        System.out.println("Relation operator ="+(a>b));
        System.out.println("Logical && ="+((a>b)&&(b<a)));
        System.out.println("Logical || ="+((a>b)||(b>a)));
        System.out.println("Logical ! ="+(!(a>b)));
    }
}
