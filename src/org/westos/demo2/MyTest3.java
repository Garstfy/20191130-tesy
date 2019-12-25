package org.westos.demo2;

/**
 * @Author: ShenMouMou
 * @CreateTime: 2019-11-30 15:52
 * @Company:西部开源教育科技有限公司
 * @Description:爱生活，爱Java!
 */
public class MyTest3 {
    public static void main(String[] args) {
        //while
        //输出1---10
        int i = 1;
        while (i <= 10) { //条件为true 执行循环体里面的语句，为false循环结束
            System.out.println(i);
            i++;//不要忘了 控制循环的语句
        }

        System.out.println("-------------------");
        int j = 10;
        while (j >= 1) {
            System.out.println(j);
            j--;//不要忘了 控制循环的语句
        }

    }
}
