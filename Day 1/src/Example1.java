import java.util.Scanner;

public class Example1 {
    public static void main (String args[ ]){
        System.out.println("请输入若干个数，每输入一个数回车确认");
        System.out.println("最后输入数字0结束输入操作");
        Scanner reader=new Scanner(System.in);
        double sum=0;
        double x = reader.nextDouble();
       //填写逻辑
       // 输入0结束整个的输入操作
	   /* TODO:循环判断，如果x不等于0的时候，计算输入数据的和 */
      	while(x!=0){
       		sum+=x;
        	x=reader.nextDouble();  
        }
       
        System.out.println("sum="+sum);
    }
}