
import java.util.Scanner;

public class Example8 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("输入1个正整数:");
		long s1 = input.nextLong(); 
		ThreadTest test = new ThreadTest(s1);
		ThreadTest2 test2 = new ThreadTest2(s1);
		/*
		TODO ：设置这2个线程的优先级，然后启动线程.
		要求：线程test2的的优先级高于线程test
		*/
		test.setPriority(2);
		test2.setPriority(1);
		test.run();
		test2.run();
	}
	
	
}

class ThreadTest extends  Thread{
	private Long num;
	public ThreadTest(long i){
		num = i;
	}
	public void run(){
		long i = num;
		long result = 1;
		while(i>0){
			result = result * i;
			i = i-1;
		}
		System.out.println("阶乘:"+result);
	}
}

class ThreadTest2 extends  Thread{
	private long num;
	public ThreadTest2(long i){
		num = i;
	}
	public void run(){
		long i = num;
		long result = 0;
		while(i>0){
			result = result + i;
			i = i-1;
		}
		System.out.println("求和:"+result);
	}
}
