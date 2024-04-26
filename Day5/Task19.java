package Day5;

import java.util.Random;

class NumberGenerator extends Thread {
    public void run() {
        Random rand = new Random();
        try {
            while (true) {
                int num = rand.nextInt(100);
                System.out.println("Generated number: " + num);
                if (num % 2 == 0) {
                    SquareThread squareThread = new SquareThread(num);
                    squareThread.start();
                } else {
                    CubeThread cubeThread = new CubeThread(num);
                    cubeThread.start();
                }
                Thread.sleep(1000); 
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class SquareThread extends Thread {
    private int num;

    public SquareThread(int num) {
        this.num = num;
    }

    public void run() {
        System.out.println("Square of " + num + ": " + (num * num));
    }
}

class CubeThread extends Thread {
    private int num;

    public CubeThread(int num) {
        this.num = num;
    }

    public void run() {
        System.out.println("Cube of " + num + ": " + (num * num * num));
    }
}

public class Task19 {
    public static void main(String[] args) {
        NumberGenerator numberGenerator = new NumberGenerator();
        numberGenerator.start();
    }
}

