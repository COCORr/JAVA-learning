import java.util.Scanner;
class B {
	B(int i){}

  int hello(int a,int b){
  	return a+b;
  }
  double hello(double a,double b){
  	return a*b;
  }
	}
public class Example15 {
    
    public static void main(String args[]) {
        
        Scanner reader = new Scanner(System.in);
        System.out.println("请输入两个整数：");
        int b = reader.nextInt();
        int a = reader.nextInt();
        System.out.println("输入两个小数：");
        double c = reader.nextDouble();
        double d = reader.nextDouble();
      B tom = new B(1);
      System.out.println("两个整数调用hello方法的结果：");
      System.out.println(tom.hello(a,b));
      System.out.println("两个小数调用hello方法的结果：");
      System.out.println(tom.hello(c,d));
   }
   

}