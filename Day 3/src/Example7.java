import java.util.Scanner;

class Pointaa {
    int x,y;
    void setXY(int m,int n){
         x = m;
         y = n;
    }
}
public class Example7 {
public static void main(String args[]) {
      Pointaa p1,p2;                
      /*TODO:创建俩个Point对象p1,p2*/
      p1=new Pointaa();
      p2=new Pointaa();
      Scanner sc = new Scanner(System.in);
      System.out.println("输入点的坐标(x,y):");
      /*TODO:调用Point对象setXY方法赋值*/
      p1.setXY(sc.nextInt(),sc.nextInt());	
      p2.setXY(sc.nextInt(),sc.nextInt());
      System.out.println("p1的x,y坐标:"+p1.x+","+p1.y);
      System.out.println("p2的x,y坐标:"+p2.x+","+p2.y);
      /*TODO:将p2的引用赋给p1*/
      p1=p2;
      System.out.println("将p2的引用赋给p1后：");
      System.out.println("p1的x,y坐标:"+p1.x+","+p1.y);
      System.out.println("p2的x,y坐标:"+p2.x+","+p2.y);
   }
}
