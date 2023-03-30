package com.imooc.Io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 用来测试文件输出(复制文件)
 */

public class StreamSample2 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        FileInputStream fis = null;
        int len = 0;
        byte[] bty = new byte[1024];
        try {
            fos = new FileOutputStream("d:/c.txt");
            fis = new FileInputStream("d:/b.txt");
//            while ((len = fis.read())!=-1){  按照一个字节一个字节输出
//                fos.write(len);
//            }
            while ((len = fis.read(bty))!=-1){
                fos.write(bty,0,len); //按长度输出
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
