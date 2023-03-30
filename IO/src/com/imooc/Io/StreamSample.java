package com.imooc.Io;

import java.io.*;

/**
 * 用来测试读取文件
 */
public class StreamSample {
    public static void main(String[] args) {
        FileInputStream inputStream = null;
        try {
            File f = new File("d:/b.txt");
            f.createNewFile();
            inputStream = new FileInputStream("d:/b.txt");

            byte[] bytArray = new byte[1024];

            int len;

//            while ((len=inputStream.read(bytArray))!=-1){
//   S             System.out.println(len);//文件长度
//            }

            while ((len = inputStream.read()) != -1) {
                System.out.print((char)len); //读取一个字节
            }



        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally{
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
