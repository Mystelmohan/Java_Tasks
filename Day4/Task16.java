package Day4;

public class Task16 {
    public static void main(String[] args) {
        int arr[]={1,5,6,7,4,8};
        int search=4;
        int a=linear(arr,search);
        if(a!=-1){
            System.out.println(search+" in the position of "+(a+1));
        }else{
            System.out.println("not found");
        }
    }
    static int linear(int arr[],int search){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==search){
                return i;
            }
        }
        return -1;
    }
}
