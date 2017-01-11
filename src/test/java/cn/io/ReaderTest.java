package test.java.cn.io;

import java.io.*;

/**
 * Created by gaojc19 on 2016/12/29.
 */
public class ReaderTest {

    public static void main(String args[]) throws IOException {
        Writer writer=new FileWriter("e:\\test.txt");
        writer.write("test write");
        writer.flush();
        writer.close();
        InputStream inputStream=new FileInputStream("e:\\test.txt");
       // Reader reader=new FileReader("D:\\test.txt");
        try (Reader reader=new InputStreamReader(inputStream,"UTF-8")) {
            int data = reader.read();
            while (data != -1) {
                System.out.print((char) data);
                data = reader.read();
            }
        }
    }

}
