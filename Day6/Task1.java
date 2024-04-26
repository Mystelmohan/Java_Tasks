package Day6;
class thread implements Runnable{
    @Override
    public void run() {
        System.out.println("Student");
    }
}
public class Task1 {
    public static void main(String[] args) {
        thread obj=new thread();
        Thread t1=new Thread(obj);
        t1.start();
    }
}
