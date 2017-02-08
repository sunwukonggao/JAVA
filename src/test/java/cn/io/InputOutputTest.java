package test.java.cn.io;

import java.io.*;

/**
 * Created by gaojc19 on 2016/12/28.
 */
public class InputOutputTest {
    public static void main(String[] args) throws IOException {
        OutputStream outputStream = new FileOutputStream("e:\\test.txt");
        outputStream.write("test".getBytes());
        outputStream.flush();
        outputStream.close();
        InputStream inputStream = new BufferedInputStream(new FileInputStream("e:\\test.txt"));
        int data = inputStream.read();
        while (data != -1) {
            System.out.print((char) data);
            data = inputStream.read();
        }
        inputStream.close();

    }
}
