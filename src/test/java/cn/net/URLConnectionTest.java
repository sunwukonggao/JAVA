package test.java.cn.net;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by gaojc19 on 2017/2/10.
 */
public class URLConnectionTest {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://www.baidu.com");
        URLConnection urlConnection = url.openConnection();
        InputStream inputStream = urlConnection.getInputStream();
        byte[] bytes = new byte[1024];
        int data = inputStream.read(bytes);
        while (data != -1) {
            System.out.print((char) data);
            data = inputStream.read(bytes);
        }
    }
}
