package org.westos.demo2;

/**
 * @Author: ShenMouMou
 * @CreateTime: 2019-11-30 15:59
 * @Company:西部开源教育科技有限公司
 * @Description:爱生活，爱Java!
 */
public class MyTest5 {
    public static void main(String[] args) {

        int i=100;
        int count=0;
        while (i<1000){
            int ge = i / 1 % 10;
            int shi = i / 10 % 10;
            int bai = i / 100 % 10;
            int flowerNum = ge * ge * ge + shi * shi * shi + bai * bai * bai;
            if (i == flowerNum) {
                System.out.println("水仙花数是" + i);
                count++;
            }

            i++;
        }

        System.out.println("水仙花数有" + count + "个");
    }
}
