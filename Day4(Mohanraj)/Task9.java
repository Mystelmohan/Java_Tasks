package Day4;

public class Task9 {
    public static void main(String[] args) {
        int arr[]=new int[4];
        try{
            arr[4]=6;
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array out of bound");
        }
    }
}
