package org.westos.demo;

/**
 * @Author: ShenMouMou
 * @CreateTime: 2019-11-30 14:59
 * @Company:西部开源教育科技有限公司
 * @Description:爱生活，爱Java!
 */
public class MyTest {
    public static void main(String[] args) {
        //对于重复代码，应该考虑使用循环改进
        //for while
        //循环十次

        // 1. int i=0; 循环的起始值 只执行一次
        // 2. i<10 循环是否继续执行的条件 i<10 是true 循环执行 是 false 循环结束
        // 3. {System.out.println("我爱你们");}  {} 大括号里面的代码就是循环体，需要重复执行的代码，就放到循环体里面
        //4. i++ 控制循环的语句 每循环一次 i自增1

        // 回到 2  继续判断 i<10 如果是true 执行第三补
        //也就是说 2 3 4 步 不断执行，直到 i<10 变成false 循环终止

             //1       //2   //4
        for(int i=0;i<10;i++){
           // 3
            System.out.println("我爱你们");
			 System.out.println("我爱你们");
            System.out.println("我爱你们333");
            System.out.println("我爱你们2222");
        }
    }
}
