import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

   /*
  请输入4个数，存入Vector，使用迭代器方式（iterator），输出Vector集合元素。
  例如：输入：3 6 7 8  输出：3 6 7 8
   */
public class Example1 {
	public static void main(String[] args){

		Vector nums=new Vector(4);
      Scanner sc= new Scanner(System.in);
              System.out.println("输入第1个数");
              nums.add(sc.nextInt());
              System.out.println("输入第2个数");
      		  nums.add(sc.nextInt());
              System.out.println("输入第3个数");
     	      nums.add(sc.nextInt());
              System.out.println("输入第4个数");
     	      nums.add(sc.nextInt());
      
			Iterator<Integer> items = nums.iterator();	
			while(items.hasNext()){
					System.out.println(items.next());
	    }	
	}
}

 
