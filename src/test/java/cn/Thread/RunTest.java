package test.java.cn.Thread;

import java.io.IOException;

/**
 * Created by gaojc19 on 2016/12/19.
 */
public class RunTest {
    private String a;

    public static void main(String args[]) throws IOException {
        RunTest t = new RunTest();
        Thread A = new Thread(new RunableTestA(t));
        Thread B = new Thread(new RunableTestB(t));
        A.start();
        B.start();
    }

    public synchronized String getA() {
        return a;
    }

    public synchronized void setA(String a) throws InterruptedException {
        System.out.println("sleep");
        Thread.sleep(10000);
        this.a = a;
    }
}
