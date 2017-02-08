package test.java.cn.io;

import java.io.File;

/**
 * Created by gaojc19 on 2017/2/8.
 */
public class FileTest {
    public static void main(String[] args) {
        File file = new File("e:\\test.txt");
        System.out.println(file.exists());
        System.out.println(file.length());
    }
}
