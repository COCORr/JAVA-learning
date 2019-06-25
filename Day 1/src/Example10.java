import java.util.Scanner;

public class Example10 {
   public static void main(String args[]) {
       Scanner reader = new Scanner(System.in);
       System.out.println("输入一个0~9的数字：");
       int a = reader.nextInt();
       System.out.println("输入前多少项：");
       int n = reader.nextInt();
       sum(a,n);
   }
   
   public static void sum(int a,int n){
     
     	long x=a;
     	long s=a;
      
     	for(int i=0;i<n-1;i++){
        	x=x*10+a;
          	s+=x;
        }
              
       System.out.println("求和：" + s/* TODO：计算的和 */);
   }
}

