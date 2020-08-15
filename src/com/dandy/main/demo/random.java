package com.dandy.main.demo;

import com.sun.org.apache.xpath.internal.objects.XBoolean;

import javax.swing.plaf.BorderUIResource;
import java.util.Arrays;
import java.util.Random;

//生成5个不重复的随机数，重复的话重新生成，并存放到数组中
public class random {
    public static void main(String[] args) {
        //创建Random对象
        Random random = new Random();
        //准备数组
        int arr[] = new int[5];

        //方法一：生成一个随机数后就判断是否重复：不重复就写入数组，重复就重新随机
        //第一种
//        //循环，生成随机数
//        for(int i=0;i<arr.length;i++){
//            //定义一个标记
//            boolean nb = false;
//            int ran = random.nextInt();
//            //判断当前生成的随机数是否和数组前面已赋值的重复
//            for (int j=0;j < i;j++ ) {
//                //重复就推出当前循环
//                if (arr[j] == ran) {
//                    nb = true;
//                    break;
//                }
//            }
//            //不重复就存入数组
//            if (!nb) {
//                arr[i] =ran;
//            }
//            //重复则此次循环不作数，再进行本次循环
//            else{
//                i--;
//            }
//
//        }
//        //第二种
//        //是否再次执行本次循环取决于内层循环判断是否与数组有重复
//        //循环，生成随机数
//        for (int i = 0;i<arr.length; ) {
//            boolean nb = false;
//            int ran = random.nextInt();
//            for (int j=0;j < i;j++ ) {
//                if (arr[j] == ran) {
//                    nb = true;
//                    break;
//                }
//            }
//            //如果此随机数不重复就进行下一次循环
//            if (!nb) {
//                arr[i] =ran;
//                i++;
//            }
//        }


        //方法二：

        //
        for(int i=0;i<arr.length;i++){
            arr[i]=-1;
        }
        //循环，生成随机数
        int index = 0;
        while(index < arr.length){
            //生成随机数
            int num=random.nextInt();
            // 判断数组中有没有包含生成的随机数
            if(contains(arr,num)){
                arr[index]=num;
                index++;
            }
        }


        System.out.println(Arrays.toString(arr));
    }

    //构造判断数组中是否包含某个元素
    public static boolean contains(int[] array,int key) {
        for (int i =0;i < array.length;i++){
            if (array[i]==key){
                return false;
            }
        }
        return true;
    }

}
