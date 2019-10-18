import java.util.Scanner;

public class Example14 {
  public static void main(String args[]) {
      Scanner reader = new Scanner(System.in);
      System.out.println("请输入圆的半径：");
      Circle1 circle = new Circle1();
      circle.setRadius(reader.nextDouble());
      System.out.println("请输入梯形的上底、下底、高：");
      Tixing lader = new Tixing(reader.nextDouble(),reader.nextDouble(),reader.nextDouble());
      Studenta zhang = new Studenta();
      System.out.println("zhang计算圆的面积：");
      double result=zhang.computerArea(circle);
      System.out.println(result);
      System.out.println("zhang计算梯形的面积：");
      result=zhang.computerArea(lader);
      System.out.println(result);
   }
}

 class Circle1 {
     
    double radius,area;
    
    void setRadius(double r) {
        radius=r;
    } 
    double getArea() {
        
        area=3.14*radius*radius;
        return area;
    }
}

 class Tixing {
 
   double above,bottom,height,area;
   
   Tixing(double a,double b,double h) {
      above = a;
      bottom = b;
      height = h; 
   }
   
   double getArea() {
    
      	area=(above+bottom)*height/2;
        return area;
   }
}

 class Studenta { 
    
           
   double computerArea(Tixing t){
   		return t.getArea();
   }
   double computerArea(Circle1 c){
   		return c.getArea();
   }
    
}
