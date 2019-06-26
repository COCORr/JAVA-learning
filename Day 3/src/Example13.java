import java.util.Scanner;
class Circle{
	double r=10;

	public double reduce(double r){
		double sum=0;
      sum=r-this.r;
      return sum;
	}
	
}
public class Example13 {
public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      System.out.println("输入一个数：");
      Circle circle = new Circle();
      System.out.println("俩个数的差为："+circle.reduce(sc.nextDouble()));
   }
}
