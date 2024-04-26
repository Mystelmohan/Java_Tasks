package Day5;

public class Task18 {
    public static void main(String[] args) {
        String str="hello guy\nshow are you?\nI am fine";
        String arr[]=str.split("\n");
        for (String i: arr) {
            System.out.println(i);
        }
        System.out.println(arr.length);
    }
}
