package Day4;

public class Task2 {
    public static void main(String[] args) {
        try{
            int a[]=new int[5];
            a[5]=30/5;
        }catch(ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Array out of bound");
        }
    }
}
