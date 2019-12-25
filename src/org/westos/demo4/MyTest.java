package org.westos.demo4;

import java.net.SocketTimeoutException;

/**
 * @Author: ShenMouMou
 * @CreateTime: 2019-11-30 16:10
 * @Company:西部开源教育科技有限公司
 * @Description:爱生活，爱Java!
 */
public class MyTest {
    public static void main(String[] args) {
      /*  需求：请输出一个4行5列的星星( *)图案。
        如图：
		*****
		*****
		*****
		*****
    }*/

      // 快速生成循环语句 10.fori 回车 数字自己写，要几次输几次

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("*"); //打印不换行
            }
            System.out.println();//只是为了换行
        }

        //两层循环的嵌套特点：1.外层循环控制的是行数 2.内层循环控制列数





    }
}
