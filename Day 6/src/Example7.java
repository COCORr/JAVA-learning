import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

    /* 
	请输入4个数，存入ArrayList，使用集合排序方法将数字排序输出。请补全SortList类中的排序方法。
    例如：输入：20 40 10 5  输出：[5, 10, 20, 40]
    */
public class Example7 {
	public static void main(String[] args){
		List<Integer> nums = new ArrayList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.println("输入第1个数");
		int num1 = sc.nextInt();
		nums.add(num1);
		System.out.println("输入第2个数");
		int num2 = sc.nextInt();
		nums.add(num2);
		System.out.println("输入第3个数");
		int num3 = sc.nextInt();
		nums.add(num3);
		System.out.println("输入第4个数");
		int num4 = sc.nextInt();
		nums.add(num4);
		 
		nums.sort(new SortList());
		
		
		System.out.println(nums.toString());
	}
}

class SortList implements Comparator<Integer> {

	/*
	TODO:
	功能描述：实现Comparator排序算法
	参数说明：arg0 arg1 被比较的两个数 Interger类型
	返回值：arg0.compareTo(arg1)
	*/
	  public int compare(Integer a, Integer b){
      	return a-b;
      }
}
