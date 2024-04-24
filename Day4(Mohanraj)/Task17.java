package Day4;

public class Task17 {
    public static void main(String[] args) {
        int arr[]={3,5,7,3,6,9};
        int search=7;
        int a=binary(arr,0,arr.length-1,search);
        if(a!=-1){
            System.out.println(search+" in the position of "+(a+1));
        }else{
            System.out.println("not found");
        }
    }
    static int binary(int arr[],int st,int end,int search){
        if(st<end){
            int mid=(st+end)/2;
            if(arr[mid]==search){
                return mid;
            }
            if(search<arr[mid]){
                return binary(arr, st,mid-1 , search);
            }else{
                return binary(arr, mid+1, end, search);
            }
        }
        return -1;
    }
}
