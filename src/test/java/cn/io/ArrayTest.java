package test.java.cn.io;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by gaojc19 on 2016/12/28.
 */
public class ArrayTest {
    public static void main(String[] args) throws IOException {
       /* byte [] bytes=new byte[1024];
        for(int i=0;i<1024;i++)
        {
         bytes[i]=(byte)i;
        }
        InputStream inputStream=new ByteArrayInputStream(bytes);
        int data =inputStream.read();
        while(data!=-1)
        {
            System.out.println((char)data);
            data=inputStream.read();
        }
        inputStream.close();*/
        OutputStream outputStream = new ByteArrayOutputStream();
        outputStream.write("test".getBytes());
        byte[] bytes1 = outputStream.toString().getBytes();
        for (byte b : bytes1
                ) {
            System.out.println((char) b);
        }
        outputStream.close();
    }
}
