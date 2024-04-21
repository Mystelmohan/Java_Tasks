public class rectanglePattern {
    public static void main(String args[]) {
            
            for(int i=1;i<=4;i++) {
                for(int j=0;j<5;j++) {
                    if((j==0||j==4)||i==4||i==1) {
                        System.out.print("*");
                    }else{
                           System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }