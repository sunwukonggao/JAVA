package test.java.cn.nio;


import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Created by gaojc19 on 2017/2/9.
 */
public class FileChinannelTest {
    public static void main(String[] args) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile("e:\\test.txt", "rw");
        FileChannel fileChannel = randomAccessFile.getChannel();
        ByteBuffer byteBuffer = ByteBuffer.allocate(48);
        int data = fileChannel.read(byteBuffer);
        while (data != -1) {
            System.out.println(data);
            byteBuffer.flip();
            while (byteBuffer.hasRemaining()) {
                System.out.print((char) byteBuffer.get());
            }
            byteBuffer.clear();
            data = fileChannel.read(byteBuffer);
        }
        randomAccessFile.close();
    }

}
