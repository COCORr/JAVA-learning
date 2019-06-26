import java.util.Scanner;

public class Example4 {

    public static void main(String args[]) {
        
       Scanner reader = new Scanner(System.in);
       Computer com = new Computer();
       System.out.println("输入两个整数：");
       int m = reader.nextInt();
       int n = reader.nextInt();
       // 基本数据类型参数的传值
       int result = com.add(m,n);
       System.out.println("两数之和："+result); 
    }
}

/*
* 定义一个计算器类，
* 从键盘输入两个整数，
* 每个整数按回车确认，
* 调用计算器类的add()方法计算两个整数之和，
* 并输出结果。
*/
class Computer {
    
    // 基本数据类型参数的传值
    int add(int a,int b){
     return a+b;
       
    }
}