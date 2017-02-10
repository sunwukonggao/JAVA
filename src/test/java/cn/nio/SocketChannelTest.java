package test.java.cn.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;

/**
 * Created by gaojc19 on 2017/2/10.
 */
public class SocketChannelTest {
    public static void main(String[] args) throws IOException {
        SocketChannel socketChannel = SocketChannel.open();
        socketChannel.connect(new InetSocketAddress("http://jenkov.com/", 80));
        ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
        int data = socketChannel.read(byteBuffer);
        while (data != -1) {
            System.out.println(data);
            byteBuffer.flip();
            while (byteBuffer.hasRemaining()) {
                System.out.print((char) byteBuffer.get());
            }
            byteBuffer.clear();
            data = socketChannel.read(byteBuffer);
        }
        socketChannel.read(byteBuffer);
    }
}
