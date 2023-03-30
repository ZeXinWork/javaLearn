package com.imooc.Io;

import java.io.*;

public class WriterReaderSample {

    public static void main(String[] args) {
        FileWriter fw = null;
        File file = new File("d:/d.txt");
        if(file==null){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            fw = new FileWriter(file);
            fw.write("这是一个测试");
            fw.append("hhhh");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        FileReader fr = null;
        int len = 0;
        try {
            fr = new FileReader(file);
            while ((len = fr.read())!=-1 ) {
                System.out.println((char)len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
