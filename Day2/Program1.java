package Day2;

public class Program1 {
    public static void main(String[] args) {
        int a=65;
        for(int i=0;i<5;i++){
            for(int j=0;j<=i;j++){
                System.out.printf("%c",a);
            }
            a++;
            System.out.println();
        }
    }
}
