package org.westos.demo4;

/**
 * @Author: ShenMouMou
 * @CreateTime: 2019-11-30 16:17
 * @Company:西部开源教育科技有限公司
 * @Description:爱生活，爱Java!
 */
public class MyTest2 {
    public static void main(String[] args) {
        /*   需求：请输出下列的形状
         *
         **
         ***
         ****
         ******/

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //作业：打印菱形
    }
}
