package org.westos.demo5;

import java.net.SocketTimeoutException;

/**
 * @Author: ShenMouMou
 * @CreateTime: 2019-11-30 16:37
 * @Company:西部开源教育科技有限公司
 * @Description:爱生活，爱Java!
 */
public class MyTest {
    public static void main(String[] args) {
        //break; 使用场景 他是用在switch语句或循环语句中，离开这个场景没有意义
        //用在用在switch语句 用来结束switch语句
        //用在循环语句是结束循环的
        for (int i = 0; i <10; i++) {
            System.out.println("我爱你");
            if(i==4){
               break; //结束这个循环语句
            }

        }

        System.out.println("-------------------------------");
        int j=1;
        while (true){
            if(j>10){
               break;
            }
            System.out.println("哈哈");
            j++;
        }

        System.out.println("下面的代码");
		 System.out.println("下面的代码");
		  System.out.println("下面的代码");
		   System.out.println("下面的代码");
		    System.out.println("下面的代码");
			 System.out.println("下面的代码");

 System.out.println("下面的代码");

    }
}
