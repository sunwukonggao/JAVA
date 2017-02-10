package test.java.cn.net;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by gaojc19 on 2016/12/27.
 */
public class UrlTest {
    public static void main(String args[]) throws IOException {
        URL url = new URL("http://10.0.210.73:8080/ms/login");
        URLConnection urlConnection = url.openConnection();
        InputStream inputStream = urlConnection.getInputStream();
        int data = inputStream.read();
        while (data != -1) {
            System.out.println((char) data);
        }
        inputStream.close();

    }
}
