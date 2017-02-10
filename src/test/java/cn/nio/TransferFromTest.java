package test.java.cn.nio;

import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

/**
 * Created by gaojc19 on 2017/2/10.
 */
public class TransferFromTest {
    public static void main(String[] args) throws IOException {
        RandomAccessFile to = new RandomAccessFile("e:\\test1.txt", "rw");
        FileChannel toFile = to.getChannel();
        RandomAccessFile from = new RandomAccessFile("e:\\test.txt", "rw");
        FileChannel fromFile = from.getChannel();
        long position = 0;
        long count = fromFile.size();
        toFile.transferFrom(fromFile, position, count);
    }
}
