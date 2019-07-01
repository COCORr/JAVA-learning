
import java.util.Scanner;
/*
 TODO:随机输入3个字符串，利用增强for循环将字符串按照录入的顺序输出。
 如：输入1，2，3，用字符串数组接收后，再通过增强for循环按顺序输出，输出内容是：1，2，3.
 */
class Test {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("输入3个字符串:");
		String[] s = new String[3];
		s[0] = input.next(); 
		s[1] = input.next();
		s[2] = input.next();
		/*
		 * TODO：用增强for循环按照顺序输出录入的每个字符串
		 */
		for( String ss : s ){
			System.out.println(ss);
		}
		
		
	}
}
