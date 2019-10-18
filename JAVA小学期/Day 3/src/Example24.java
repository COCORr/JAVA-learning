import java.util.Scanner;

public class Example24 {
    public static void main(String args[]){
        Scanner reader = new Scanner(System.in);
        Pillar pillar;
        Geometry bottom =null;
        pillar =new Pillar (bottom,reader.nextDouble());  //null底的柱体
        System.out.println("体积"+pillar.getVolume());
        bottom=new Rectangle(11,22);
        pillar =new Pillar (bottom,reader.nextDouble());  //pillar是具有矩形底的柱体
        System.out.println("体积"+pillar.getVolume());
        bottom=new Circle11(10);
        pillar =new Pillar (bottom,reader.nextDouble()); //pillar是具有圆形底的柱体
        System.out.println("体积"+pillar.getVolume());
    }
} 

abstract class Geometry { 
    public abstract double getArea();
}

class Circle11 extends Geometry {
    double r;
    Circle11(double r) {
        this.r=r;
    }
    /** TODO：增加方法，计算圆面积
              圆面积=3.14×半径的平方**/
  	public double getArea(){
    	return 3.14*r*r;
    }
    
}

class Rectangle extends Geometry {
    double a,b;
    Rectangle(double a,double b) {
        this.a=a; 
        this.b=b; 
    }

    /** TODO：增加方法，计算矩形的面积 **/
  	public double getArea(){
    	return a*b;
    }
    
}
class Pillar {
    Geometry  bottom;        //bottom是抽象类Geometry声明的变量
    double height;
    Pillar (Geometry bottom,double height) {
        this.bottom=bottom; 
        this.height=height;
    }
    public double getVolume() {
        if(bottom==null) {
           System.out.println("没有底,无法计算体积");
           return -1;
        }
        // bottom可以调用子类重写的getArea方法
        // 柱体体积=底面积×高
        /** TODO：计算柱体体积，并作为返回值返回 **/
      	return bottom.getArea()*height;
    }
}

