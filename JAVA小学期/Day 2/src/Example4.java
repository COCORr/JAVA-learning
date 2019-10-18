import java.util.Scanner;

public class Example4
{
	public static void main(String args[ ]) {
            /*TODO：声明一个有5个float类型数据的数组*/
      		float []a=new float[5];
            System.out.print("输入5个浮点型数据初始化数组：");
			/*
			TODO:
			功能描述：创建Scanner对象，将输入数据赋值给数组a[i]
			*/
      		Scanner scanner=new Scanner(System.in);
      		for(int i=0;i<5;i++){
            	a[i]=scanner.nextFloat();
            }
			System.out.print("数组中的内容是：");
			for (float f : a) {
				System.out.print(f+" ");
			}
			
	}
}

