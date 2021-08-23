package Examples;

import java.util.concurrent.TimeUnit;

public class Wait {
    public static void main(String[] args) {
        waitMin(3);
    }

    static void waitMin(int a) {
        for (int i = a - 1; i >= 0; i--) {
            for (int j = 59; j >= 0; j--) {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                } finally {
                    System.out.println(i + " min " + j + " sec left");
                }
            }
        }
        System.out.println("Time is up ....");
    }
}
