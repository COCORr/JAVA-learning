import java.util.Scanner;

public class Example9 {
		public static void main(String[] args) {
				System.out.println("输入一个整数:");
				int a,sum=0;
				Scanner sc = new Scanner(System.in);
				a = sc.nextInt();
				
				/*
				TOOD:
				功能描述：使用while语句，计算1到n所有整数之和sum。
				*/
          		int i=1;
          		while(i<=a){
                	sum+=i;
                  	i++;
                }
				System.out.println(sum);
	
		}
}	

