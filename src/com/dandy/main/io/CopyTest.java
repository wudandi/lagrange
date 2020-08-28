package com.dandy.main.io;

import java.io.*;

/*
* 拷贝目录（复制粘贴）
* 将 D:\kinggsoft\kduu_ba\sp7 拷贝到E盘的根目录下
* */

//有个bug，如果拷贝方法copyUtil中循环到的第一个File是文件的话，并不会创建路径，就会报错，FileOutPutStream只能在已存在的路径中创建文件
public class CopyTest {
    public static void main(String[] args) {
        //拷贝源
        File srcfile =new File("D:\\kinggsoft\\kduu_ba\\sp7");
        //拷贝目标
        File destfile = new File("E:\\");
        //生成拷贝目标（bug临时方法，不健壮）
        String rootDir = destfile.getAbsolutePath() + srcfile.getAbsolutePath().substring(3);
        File file = new File(rootDir);
        if (!file.exists()){
            file.mkdirs();
        }
        //调用拷贝方法
        copyUtil(srcfile,destfile);
    }

    /**
     * 拷贝方法
     * @param srcfile 拷贝源
     * @param destfile 拷贝目标
     */
    private static void copyUtil(File srcfile, File destfile) {
        if (srcfile.isFile()){
            //srcfile是一个文件的话，递归结束
            //将文件进行拷贝（一边读一边写）
            FileInputStream fileInputStream = null;
            FileOutputStream fileOutputStream = null;
            try {
                //读文件
                //D:\kinggsoft\kduu_ba\sp7\kcdpt\wh_ut.dat(读文件)
                fileInputStream=new FileInputStream(srcfile);
                //写文件
                //E:\kinggsoft\kduu_ba\sp7\kcdpt\wh_ut.dat(创建的是一个wh_ut.dat文件)
                String path = (destfile.getAbsolutePath().endsWith("\\")? destfile.getAbsolutePath() :destfile.getAbsolutePath()+"\\") + srcfile.getAbsolutePath().substring(3);
                //（bug临时方法，不健壮）
             /*   String rootDir = path.substring(0,24);
                File file1 = new File(rootDir);
                if (!file1.exists()){
                    file1.mkdirs();
                }*/
                //文件不存在会自动新建(但是FileOutputStream不会创建路径)
                fileOutputStream = new FileOutputStream(path);
                //一边读一边写(读到多少写多少)
                byte[] bytes = new byte[1024 * 1024];//1MB
                int readCount;
                while ((readCount = fileInputStream.read(bytes)) != -1){
                    fileOutputStream.write(bytes,0,readCount);
                }
                //刷新
                fileOutputStream.flush();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }finally {
                if (fileInputStream != null){
                    try {
                        fileInputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                if (fileOutputStream != null){
                    try {
                        fileOutputStream.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            return;
        }
        //获取源的子目录
        File[] files=srcfile.listFiles();
        //（并创建新目标目录）
        for (File file:files) {
            //file是目录的话，新建对应的目标目录
            if (file.isDirectory()){
                //D:\kinggsoft\kduu_ba\sp7\kcdpt 源目录
                //E:\kinggsoft\kduu_ba\sp7\kcdpt 目标目录
                String srcDir = file.getAbsolutePath();
                //拼接生成目标目录
                String destDir = (destfile.getAbsolutePath().endsWith("\\")? destfile.getAbsolutePath() :destfile.getAbsolutePath()+"\\") + srcDir.substring(3);
                    //System.out.println(destDir);  //测试
                //如果路径不存在，生成多重目录(创建的是一个路径（文件夹）)
                File fileE = new File(destDir);
                if (!fileE.exists()){
                    fileE.mkdirs();
                }
            }
            //将子目录进行拷贝（递归调用）
            copyUtil(file,destfile);
        }
    }
}


