import java.util.*;
public class Example2 {

	   public static void main(String args[]) {
	       // 定义数组长度分别4、3
	      int a[]=new int[4];
	      int b[]=new int[3];
	      System.out.println("请输入数组a中4个数(以回车键间隔)");
	      Scanner scanner = new Scanner(System.in);
	      //填写逻辑
	      // 数组赋值
	      /*
			TODO:循环输入a中的4个数，b数组中3个数 使用for、sacnner
		  */
	     for(int i=0;i<4;i++){
	     	a[i]=scanner.nextInt();
	     }
	     for(int i=0;i<3;i++){
	     	b[i]=scanner.nextInt();
	     }
	      System.out.println("请输入数组b中3个数(以回车键间隔)");
	      System.out.println("数组a的元素个数="+a.length);
	      System.out.println("数组b的元素个数="+b.length);
	      System.out.println("把b的引用赋给a");
	      //填写逻辑
	      /*
			TODO:将b引用赋值给a
		  */
	     a=b;
	      
	      System.out.println("数组a的元素个数="+a.length);
	      System.out.println("数组b的元素个数="+b.length);
	      System.out.println("a[0]="+a[0]+",a[1]="+a[1]+",a[2]="+a[2]);
	      System.out.print("b[0]="+b[0]+",b[1]="+b[1]+",b[2]="+b[2]);
	   }
	}