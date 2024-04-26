package Day5;

public class Task17 {
    public static void main(String[] args) {
        String str="<div>Hello<div>";
        str = str.replaceAll("\\<.*?\\>", "");
        System.out.println(str);
    }
}
