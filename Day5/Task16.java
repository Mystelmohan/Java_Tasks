package Day5;

public class Task16 {
    public static void main(String[] args) {
        String str="thi#s is @the M@arv^el";
        str=str.replaceAll("\\W", ""); 
        System.out.println(str);  
    }
}
