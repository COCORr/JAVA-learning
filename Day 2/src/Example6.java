import java.util.Scanner;

public class Example6 {
	public static void main(String args[ ]) {
			int a[]={10 ,12, 59, 48 ,78 ,89 ,66 ,77};
			System.out.print("数组中的内容为：");
			/*TODO:
			遍历数组a，print找到的数组元素的值，每个值中间用一个空格隔开
			*/
			for(int f : a){
            	System.out.print(f+" ");
            }
			Scanner sc = new Scanner(System.in);
			System.out.println("\n输入下标从0开始（0-7）:");
			int in = sc.nextInt();
			System.out.println("数组中下标为"+in+"的元素是:"+a[in]);
			
			
	}

}


