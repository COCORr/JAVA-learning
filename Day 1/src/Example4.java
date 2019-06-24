import java.util.Scanner;

public class Example4 {
	public static void main(String args[ ]) {
		   System.out.println("输入俩个浮点型数据，分别计算加、减、乘、除");
		   double a ,b;
		   Scanner scanner = new Scanner(System.in);
		   a = scanner.nextDouble();
		   b = scanner.nextDouble();		  
		   /*TODO
		   功能说明：对a,b进行加减乘除运算，分别赋给变量c d e f
		   参数说明：a,b,c,d,e,f为double型数据；
		   a,b求和赋值给c
		   a,b的差赋值给d
		   a,b相乘赋值给e
		   a,b相除赋值给f
		   */
     		double c=a+b;
   		  	double d=a-b;
      		double e=a*b;
      		double f=a/b;
           System.out.println("结果分别为：\n"+c+"\n"+d+"\n"+e+"\n"+f);
	}
}

