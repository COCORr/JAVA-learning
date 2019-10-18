import java.util.*;
public class Example9 {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);// 创建一个键盘扫描类对象
		System.out.println("输入3个字符串:");
		List list = new ArrayList();
		list.add(input.next());
		list.add(input.next());
		list.add(input.next());
		/*
		 * TODO：获取集合的迭代对象Iterator，然后进行循环判断，并输出。
		 */

		Iterator<String> it=list.iterator();
		while( it.hasNext()  ){
			System.out.println(it.next().toString());
		}
		
	}
}
