package test.java.cn.io;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by gaojc19 on 2017/2/8.
 */
public class RandomTest {
    public static void main(String[] args) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile("e:\\test.txt", "rw");
        randomAccessFile.seek(20);
        randomAccessFile.write("aaaaaa".getBytes());
        randomAccessFile.seek(20);
        int data = randomAccessFile.read();
        while (data != -1) {
            System.out.print((char) data);
            data = randomAccessFile.read();
        }
        randomAccessFile.close();

    }
}
