import java.util.Scanner;

public class Example5 {
@SuppressWarnings("resource")
public static void main(String args[ ]) {
	   int a=2;

	   int b=3;
	   System.out.println("请输入俩个整数赋值给a,b：");
	   Scanner scanner = new Scanner(System.in);
	   a = scanner.nextInt();
	   b = scanner.nextInt();
	   System.out.println("交换前的值是 a="+a+",b="+b);
	   
	   
	   
	   int temp;
  	   temp=a;
  	   a=b;
       b=temp; 
	   System.out.println("交换后的值是 a="+a+","+"b="+b);
   }
}

