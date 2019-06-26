import java.util.Scanner;


public class Example5 {
		/*
		TODO:
		功能说明：交换输入的两个数
		参数说明：a、b为输入的两个int型数
		*/
	 public static void swap(int a, int b) {
            int c;
       		c=a;
      		a=b;
 			b=c;
           System.out.println("a:" + a + " b:" + b);
		     }
public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("输入俩个整数");
      int a,b;
      a = sc.nextInt();
      b = sc.nextInt();
      swap(a,b);
   }
}
