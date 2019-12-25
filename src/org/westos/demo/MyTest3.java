package org.westos.demo;

/**
 * @Author: ShenMouMou
 * @CreateTime: 2019-11-30 15:11
 * @Company:西部开源教育科技有限公司
 * @Description:爱生活，爱Java!
 */
public class MyTest3 {
    public static void main(String[] args) {
        /*A:
        案例演示:
        需求：求出1 - 10 之间数据之和*/
        // int sum=1+2+3+4+5+6+7+8+9+10;
        int sum = 0; //定义一个变量，用来接收结果
        for (int i = 1; i <= 10; i++) {
            // sum+=i;
            sum = sum + i;
        }

        System.out.println("和是" + sum);

        //求1---100之间的奇数和 和 偶数和



    }
}
