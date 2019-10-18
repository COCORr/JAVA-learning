import java.util.Scanner;

public class Example2 {
	/*
	 * 幸运抽奖
	 */
	public static void main(String[] args) {
		int custNo; // 客户会员号（说明：customer---客户）
		
		// 输入会员卡号
		System.out.println("请输入4为会员卡号:");
		Scanner input = new Scanner(System.in);
		custNo = input.nextInt();

		boolean isLuck = false;

      	int a,b,c,d;
      	a=custNo%10;
      	b=(custNo-a)%100/10;
      	c=(custNo-a-b*10)%1000/100;
      	d=(custNo-a-b*10-c*100)/1000;
      if(a+b+c+d>20){
      	isLuck= true;
      }
      
      
      
		System.out.println("是幸运客户吗?" +isLuck);
	}
}

