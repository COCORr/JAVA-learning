import java.util.Scanner;

//声明一个泛型类计算体积
 class Cone<E> { 
   double height;
   E bottom;           //用泛型类E声明对象bottom
   public Cone (E b) {
      bottom=b;   
   }
   public void setHeight(double h) {
      height=h;
   }
   public double computerVolume() {
      String s=bottom.toString();//泛型变量只能调用从Object类继承的或重写的方法
     //逻辑
     // 锥体体积=1/3 * 底面积 * 高

     return Double.parseDouble(bottom.toString())*this.height/3;
   } 
}


 class Circle {
   double area,radius; 
   Circle(double r) {
      radius=r;
   } 
   public String toString() { //重写Object类的toString()方法
      //逻辑
      // 圆面积=半径 * 半径 * Math.PI

     return  ""+radius*radius*Math.PI;
      
   }
}

 class Rect {
       double sideA,sideB,area; 
       Rect(double a,double b) {
         sideA=a;
         sideB=b;
       } 
       public String toString() {
           //逻辑
     // 矩形面积=长 * 宽
     
     	return ""+sideA*sideB;
       }
    }



public class Example3 {
   public static void main(String args[]) {
      System.out.println("请输入圆锥的半径、高：");
      Scanner scanner = new Scanner(System.in);
      Circle circle=new Circle(scanner.nextDouble());
  
      Cone<Circle> coneOne=new Cone<Circle>(circle);//创建一个（圆）锥对象  
      coneOne.setHeight(scanner.nextDouble());
      System.out.println("圆的体积："+coneOne.computerVolume());
      System.out.println("请输入方锥的长、宽、高：");
      Rect rect=new Rect(scanner.nextDouble(),scanner.nextDouble());

      Cone<Rect> coneTwo=new Cone<Rect>(rect);//创建一个（方）锥对象
      coneTwo.setHeight(scanner.nextDouble()); 
      System.out.println("方锥的体积："+coneTwo.computerVolume());
  }
}