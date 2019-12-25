package org.westos.demo5;

/**
 * @Author: ShenMouMou
 * @CreateTime: 2019-11-30 16:44
 * @Company:西部开源教育科技有限公司
 * @Description:爱生活，爱Java!
 */
public class MyTest2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if(i==5){
                continue; //用在循环语句中，用来跳出一次循环，继续下次循环 用在循环场景中，离开循环场景没有意义
            }
           System.out.println(i);
        }

        System.out.println("------------------------");

        for (int i = 1; i <= 10; i++) {
            if (i%2==1) {
                continue; //用在循环语句中，用来跳出一次循环，继续下次循环 用在循环场景中，离开循环场景没有意义
            }
            System.out.println(i);
        }
    }
}
