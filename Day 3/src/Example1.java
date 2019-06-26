import java.util.Scanner;

class Lader{
	int sum = 0;
     	
	int getSum(int n){
      	int sum=0;
		for(int i=1;i<=n;i++){
        	sum+=i;
        }
		return sum;
}	
	
}
public class Example1 {
	public static void main(String[] args) {
		System.out.println("输入一个整数：");
		Scanner sc = new Scanner(System.in);
		Lader lader = new Lader();
		System.out.println(lader.getSum(sc.nextInt()));
	}
}
