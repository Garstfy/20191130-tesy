package org.westos.demo3;

/**
 * @Author: ShenMouMou
 * @CreateTime: 2019-11-30 16:00
 * @Company:西部开源教育科技有限公司
 * @Description:爱生活，爱Java!
 */
public class MyTest {
    public static void main(String[] args) {
        //do{循环体} while(条件)
        //先执行do里面的代码一次，然后去判断条件是否成立，如果成立就继续循环，如果不成立，循环结束
        int i = 1;
        do {
            System.out.println("进来执行了");
            i++;
        } while (i < 10);


        //for while
        //如何选
        // 你知道循环次数一般选for
        // 你不知道循环次数选while循环，但是你要知道循环的结束条件

    }
}
