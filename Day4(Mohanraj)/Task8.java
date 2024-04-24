package Day4;

public class Task8 {
    public static void main(String[] args) {
        try{
            
            int a=Integer.parseInt("hi");
            System.out.println(a);
        }catch(NumberFormatException e){
            System.out.println("Number format exception");
        }
    }
}
