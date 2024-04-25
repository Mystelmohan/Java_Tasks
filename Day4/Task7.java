package Day4;

public class Task7 {
    @SuppressWarnings("null")
    public static void main(String[] args) {
        String st=null;
        try{   
            if(st.equals("hi")){
                System.out.println("Equal");
            }else{
                System.out.println("Not equal");
            }
        }catch(NullPointerException e){
            System.out.println("Null pointer Exception");
        }
    }
}
