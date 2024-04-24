package Day4;

public class Task6 {
    public static void main(String[] args) {
        try{
            int a=5;
            int div=a/0;
            System.out.println(div);
        }catch(ArithmeticException e){
            System.out.println("Divide by 0 Exception");
        }
    }
}
