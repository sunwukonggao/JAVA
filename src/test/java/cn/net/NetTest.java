package test.java.cn.net;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.net.InetAddress;
import java.net.Socket;

/**
 * Created by gaojc19 on 2016/12/27.
 */
public class NetTest {
    public static void main(String args[]) throws IOException {
        Socket socketout = new Socket();
        OutputStream outputStream = socketout.getOutputStream();
        outputStream.write("aaaaa".getBytes());
        outputStream.flush();
        outputStream.close();
        socketout.close();

        Socket socketin = new Socket();
        InputStream inputStream = socketin.getInputStream();
        int data = inputStream.read();
        inputStream.close();
        socketin.close();
        InetAddress inetAddress = InetAddress.getLocalHost();
        System.out.println(inetAddress);
    }
}
