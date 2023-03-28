package com.imooc.Io;

import java.io.File;
import java.io.IOException;

/**
 * 用来测试java IO类创建文件、目录的操作
 */
public class IoSample {
    public static void main(String[] args) {
        File file = new File("d:/b.txt");
        try {
            //在D盘创建b.text  createResult表示创建文件的结果
            boolean createResult = file.createNewFile();
            System.out.println("是否创建成功" + createResult);
            //该文件是否存在
            System.out.println("该文件是否存在" + file.exists());
            //该文件是否为目录
            System.out.println("该文件是否是目录" + file.isDirectory());
            //该文件是否为文件
            System.out.println("该文件是否是文件" + file.isFile());
            //该文件的文件名
            System.out.println("获取该文件的文件名" + file.getName());
            //该文件的内容长度
            System.out.println("该文件的内容长度" + file.length());
            //是否删除成功
            System.out.println("该文件是否删除成功" + file.delete());
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
