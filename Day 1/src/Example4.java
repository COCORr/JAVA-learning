import java.util.Scanner;

public class Example4 {
	public static void main(String args[ ]) {
		   System.out.println("输入俩个浮点型数据，分别计算加、减、乘、除");
		   double a ,b;
		   Scanner scanner = new Scanner(System.in);
		   a = scanner.nextDouble();
		   b = scanner.nextDouble();		  
		  
     		double c=a+b;
   		  	double d=a-b;
      		double e=a*b;
      		double f=a/b;
           System.out.println("结果分别为：\n"+c+"\n"+d+"\n"+e+"\n"+f);
	}
}

