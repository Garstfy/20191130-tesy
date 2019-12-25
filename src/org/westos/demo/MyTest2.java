package org.westos.demo;

import java.net.SocketTimeoutException;

/**
 * @Author: ShenMouMou
 * @CreateTime: 2019-11-30 15:08
 * @Company:西部开源教育科技有限公司
 * @Description:爱生活，爱Java!
 */
public class MyTest2 {
    public static void main(String[] args) {
       /* A:
        案例演示
        需求：请在控制台输出数据1 - 10
        需求：请在控制台输出数据10 - 1*/
       for(int i=1;i<=10;i++){
           System.out.println(i);
       }
        System.out.println("-----------------------------");
       for(int i=10;i>=1;i--){
           System.out.println(i);
       }

    }
}
