package org.westos.demo2;

/**
 * @Author: ShenMouMou
 * @CreateTime: 2019-11-30 15:31
 * @Company:西部开源教育科技有限公司
 * @Description:爱生活，爱Java!
 */
public class MyTest {
    public static void main(String[] args) {
      /*  A:
        案例演示
        需求：在控制台输出所有的”水仙花数”
        所谓的水仙花数是指一个三位数，其各位数字的立方和等于该数本身。
	举例：153就是一个水仙花数。
	        153 = 1*1*1 + 5*5*5 + 3*3*3 = 1 + 125 + 27 = 153
	        //循环范围：100----999
	        //难点在哪里：你怎么把每个位上的数字拿出来
	        //153
	        //个位：153/1%10    3
	        //十位: 153/10%10   5
	        //百位: 153/100%10  1
        */

     /*   System.out.println(153 / 1 % 10);
        System.out.println(153 / 10 % 10);
        System.out.println(153 / 100 % 10);*/
        //定义一个统计变量
        int count=0;
        for(int i=100;i<=999;i++){
            int ge=i/1%10;
            int shi=i/10%10;
            int bai=i/100%10;
            int flowerNum=ge*ge*ge+shi*shi*shi+bai*bai*bai;
            if(i==flowerNum){
                System.out.println("水仙花数是"+i);
                count++;
            }
        }
        System.out.println("水仙花数有"+count+"个");
    }
}
