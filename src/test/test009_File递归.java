package test;

import java.io.File;

/*
递归+file综合使用:
1、获取指定目录下的所有Java文件
2、删除指定目录下所有文件
 */
public class test009_File递归 {
    public static void main(String[] args) {
        File f = new File("1.txt");
        //file(f);
        delete(f);

    }
    public static void file(File files){
        if (files.isDirectory()){
            File[] filess = files.listFiles();
            for (File file: filess){
                if(file.isFile()){
                    if(file.getName().endsWith(".java")){
                        System.out.println(file);
                    }
                }
                else if (file.isDirectory()){
                    file(file);
                }
            }
        }
    }

    public static void delete(File file) {
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File file1 : files) {
                if (file1.isFile()) {
                    file1.delete();
                }
                else if (file1.isDirectory()) {
                    delete(file1);
                }
            }
            file.delete();
        }
        file.delete();
    }
}
