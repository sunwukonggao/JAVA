package test.java.cn.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by gaojc19 on 2017/2/8.
 */
public class TryCatchTest {
    public static void main(String[] args) throws IOException {
        try (OutputStream outputStream = new FileOutputStream("e:\\test.txt")) {
            outputStream.write("test".getBytes());
            outputStream.flush();
        }
    }
}
