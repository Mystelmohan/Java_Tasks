package Day4;
public class Task4 {
    public static void main(String[] args) {
        try{
            int a=5;
            int sum=a/2;
            System.out.println(sum);
        }catch(Exception e){
            System.out.println("Exception occurs");
        }finally{
            System.out.println("This is finally block");
        }
    }
}
