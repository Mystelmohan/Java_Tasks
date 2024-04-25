package Day4;

public class Task11 {
    public static void main(String[] args) {
        int a=5;
        System.out.println("Fibonacci without recursion");
        fibo(a);
        System.out.println("Fibonacci recursion");
        for(int i=0;i<a;i++){
            System.out.println(fiboRec(i));
        }
        
    }
    static void fibo(int a){
        int a1=0,a2=1;
        System.out.println(a1);
        System.out.println(a2);
        int a3;
        for(int i=3;i<=a;i++){
            a3=a1+a2;
            System.out.println(a3);
            a1=a2;
            a2=a3;
        }
    }
    static int fiboRec(int a){
        if(a==0){
            return 0;
        }
        if(a==1||a==2){
            return 1;

        }
        return fiboRec(a-1)+fiboRec(a-2);
    }
}
