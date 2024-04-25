package Day4;

public class Task3 {
    public static void main(String[] args) {
        String s="Hello";
        int count=0;
        try{
            for (int i = 0; i <s.length() ; i++) {
                if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
                {
                    count++;
                    System.out.println("The String contains vowels");
                    break;
                }
            }
            if(count==0)
            {
                throw new Exception();
            }
        }catch (Exception e){
            System.out.println("The string not contains any vowels");
        }
    }
}
