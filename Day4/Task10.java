package Day4;

public class Task10 {
    public static void main(String[] args) {
        String str="hello";
        try{
            char a= str.charAt(5);
            System.out.println(a);
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("String out of bound");
        }
    }
}
