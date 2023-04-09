package test;
import java.io.File;
import java.io.IOException;
/*练习file类使用*/
public class test008_File {
    public static void main(String[] args) throws IOException {
        File f1 = new File("b.txt");
        File f2 = new File("a","b\\c"); //创建多级文件夹a/b/c
        File f3 = new File("c.txt");
        //创建和删除
        //System.out.println(f1.createNewFile());   //创建文件
        System.out.println(f1.mkdir());    //创建文件夹
        //System.out.println(f2.mkdirs());    //创建多级文件夹
        //System.out.println(f2.delete());    //删除文件/文件夹（多级文件需一个一个删除）
        //判断功能
        System.out.println(f1.exists());    //判断文件/文件夹是否存在
        System.out.println(f1.isAbsolute());    //判断是否为绝对路径
        System.out.println(f1.isDirectory());   //判断是否为文件夹
        System.out.println(f1.isFile());    //判断是否为文件
        System.out.println(f1.isHidden());  //判断是否为隐藏文件
        //获取和修改功能
        System.out.println(f1.getAbsoluteFile());   //获取文件（完整路径，file对象）
        System.out.println(f1.getAbsolutePath());   //获取文件路径（完整路径，字符串）
        System.out.println(f1.getParent()); //获取父文件夹（字符串）
        System.out.println(f1.getParentFile()); //获取父文件夹（file对象）
        System.out.println(f1.getName());   //获取文件/文件夹的名称
        System.out.println(f1.getPath());   //获取创建file对象时的路径
        System.out.println(f1.length());    //获取文件的字节
        System.out.println(f1.lastModified());  //获取文件的创建时间
        System.out.println(f1.renameTo(f3));    //修改f1名字为f3
        //重要获取功能
        //获取指定文件夹下的文件和文件夹（文件名字，字符串）
        File files = new File("D:\\test");
        String[] files1 = files.list();
        for (String file: files1) {
            System.out.println(file);
        }
        //获取指定文件夹下的文件和文件夹（绝对路径，file对象）
        File[] files2 = files.listFiles();
        for (File file2: files2){
            System.out.println(file2);
        }
        //返回所有盘符（了解）
        File[] files3 = files.listRoots();
        for (File file3: files3){
            System.out.println(file3);
        }
    }
}
