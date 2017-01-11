package test.java.cn.Thread;

/**
 * Created by gaojc19 on 2016/12/22.
 */
public class RunableTestB implements Runnable {
    private RunTest t;

    public RunableTestB(RunTest t) {
        this.t = t;
    }

    @Override
    public void run() {
        System.out.println(t.getA());
    }

}
