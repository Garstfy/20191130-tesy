package org.westos.demo4;

/**
 * @Author: ShenMouMou
 * @CreateTime: 2019-11-30 16:22
 * @Company:西部开源教育科技有限公司
 * @Description:爱生活，爱Java!
 */
public class MyTest3 {
    public static void main(String[] args) {
        //打印 九九乘法表
        /*
        *  1*1=1
        *  1*2=2 2*2=4
        *  1*3=3 2*3=6 3*3=9
        *  1*4=4 2*4=8 3*4=12 4*4=16
        *
        *
        *
        *
        * */
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(j+"*"+i+"="+(j * i)+"\t"); // \t 转义字符 空一格 table位
            }
            //System.out.println();
            System.out.print("\n"); // \n 转义字符 \n 也可换行
        }

    }
}
