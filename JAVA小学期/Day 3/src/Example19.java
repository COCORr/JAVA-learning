import java.util.Scanner;

class A {
    // 常量final
  final double PI=3.1415926;// PI是常量
  public double getArea(final double r) {
   // 圆面积= Π * 半径 * 半径

    return PI*r*r;   
  }
  public final void speak() {
     System.out.print("");
  } 
}
/*
* 使用常量final，输入半径，计算圆面积，输出结果。
*/
public class Example19 {
   public static void main(String args[]) {
      A a=new A();
      System.out.println("请输入圆半径：");
      Scanner scanner = new Scanner(System.in);
      //计算圆面积
      System.out.println("面积："+  a.getArea(scanner.nextDouble())); 
      a.speak();
   }
}
