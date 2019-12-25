package org.westos.demo;

/**
 * @Author: ShenMouMou
 * @CreateTime: 2019-11-30 15:23
 * @Company:西部开源教育科技有限公司
 * @Description:爱生活，爱Java!
 */
public class MyTest4 {

    public static void main(String[] args) {
        //求1---100之间的奇数和 和 偶数和
        int sum=0; //定义一个变量来接收最后的结果
        int ou=0;
        int ji=0;
        for (int i=1;i<=100;i++){
           // sum+=sum+i;
            sum=sum+i;
            if(i%2==0){//是偶数
                ou=ou+i;
            }else{
                ji=ji+i;
            }
        }
        System.out.println("和是"+sum);
        System.out.println("奇数和是" + ji);
        System.out.println("偶数和是" + ou);
    }
}
