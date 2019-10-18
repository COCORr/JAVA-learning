import java.util.Scanner;

class Sum { 
    int n;
    float f() {
     //逻辑
	 /* TODO：求和 */
     	float sum=0;
      for(int i=1;i<=n;i++){
      	sum+=i;
      }
      return sum;
    }
}
class Average extends Sum {
    int n;  
    float f() { 
    	super.n=n;
      return super.f()/n;
     
    }
   float g() {
      //逻辑

	   return super.f()/2;
     
   }
}
/*
* 子类使用super访问和调用被子类隐藏的成员变量和方法，输入一个数，对输入的数字计算平均数和1/2倍数。
*/
public class Example20 {
  public static void main(String args[]) {
       Average aver=new Average();
       System.out.println("请输入一个数n计算1..n和的平均数、1/2的倍数");
       Scanner scanner = new Scanner(System.in);
       aver.n = scanner.nextInt();
       float resultOne=aver.f();
       float resultTwo=aver.g(); 
       System.out.println("resultOne="+resultOne);
       System.out.println("resultTwo="+resultTwo);
   }
}
