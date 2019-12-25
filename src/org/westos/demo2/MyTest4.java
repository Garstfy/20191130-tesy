package org.westos.demo2;

import com.sun.media.sound.SoftTuning;

/**
 * @Author: ShenMouMou
 * @CreateTime: 2019-11-30 15:56
 * @Company:西部开源教育科技有限公司
 * @Description:爱生活，爱Java!
 */
public class MyTest4 {
    public static void main(String[] args) {
        //求1--100之间的奇数和偶数和
        int ou = 0;
        int ji = 0;
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 1) {
                ji += i;
            } else {
                ou += i;
            }

            i++;
        }

        System.out.println("奇数和"+ji);
        System.out.println("偶数和" + ji);

    }
}
