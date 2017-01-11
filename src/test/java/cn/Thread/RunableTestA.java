package test.java.cn.Thread;

/**
 * Created by gaojc19 on 2016/12/23.
 */
public class RunableTestA implements Runnable {
    private RunTest t;

    public RunableTestA(RunTest t) {
        this.t = t;
    }

    @Override
    public void run() {
        try {
            System.out.println("setA()");
            t.setA("qqqqqq");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
