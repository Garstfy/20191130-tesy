package org.westos.demo5;

/**
 * @Author: ShenMouMou
 * @CreateTime: 2019-11-30 16:48
 * @Company:西部开源教育科技有限公司
 * @Description:爱生活，爱Java!
 */
public class MyTest3 {
    public static void main(String[] args) {
        //break 加在哪层循环，那么结束的就是哪层循环
        // 如果有多层循环嵌套，我们可以给循环加个标记，然后可以根据标去结束某个循环
        wc:for (int i = 0; i < 5; i++) {
            nc:for (int j = 0; j < 5; j++) {
                if(j==2){
                  break wc; //根据标记去结束哪层循环
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
