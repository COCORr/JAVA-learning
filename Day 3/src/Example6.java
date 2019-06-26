import java.util.Scanner;

class Point {
    int x;
	/*
		TODO:
		功能描述：将参数m赋给本地变量x
		参数说明:m为int类型
		返回值:	无
	*/
    void setXY(int m){
      this.x=m;
	System.out.println("输入的参数为："+"m="+m);
    	
    }
}
public class Example6 {
public static void main(String args[]) {
      Point p1;                
      p1=new Point();  
      Scanner sc = new Scanner(System.in);
      System.out.println("输入一个整数");
      p1.setXY(sc.nextInt());
      System.out.println("本地变量为："+"x="+p1.x);
   }
}
