import java.util.Scanner;

interface CompurerAverage {
   public double average(double a,double b);
}

/* TODO：实现接口 */
class Arithmetic implements CompurerAverage{

   public double average(double a,double b) {
     /* TODO：计算算数平均数 */
	 
      return (a+b)/2;
   }
}

/* TODO：实现接口 */
class Geometric implements CompurerAverage{
   public double average(double a,double b) {
      /* TODO：利用Math.sqrt计算几何平均数 */
     double t=a*b;
     double aver=Math.sqrt(t);
       return aver;
   }
}
public class Example9 {
   public static void main(String args[]) {
      CompurerAverage computer;
      double a,b;
      System.out.println("请输入俩个数：");
      Scanner scanner = new Scanner(System.in);
      a = scanner.nextDouble();
      b = scanner.nextDouble(); 
      /* TODO：给computer赋值
               用computer调用方法计算算数平均数*/
	 computer=new Arithmetic();
        System.out.printf("%5.2f和%5.2f的算术平均值:%5.2f\n",a,b,computer.average(a,b)/* TODO：算数平均数 */);
      /* TODO：给computer赋值
               用computer调用方法计算几何平均数*/
	 computer=new Geometric();
        System.out.printf("%5.2f和%5.2f的几何平均值:%5.2f",a,b,computer.average(a,b)/* TODO：几何平均数 */);
   } 
}