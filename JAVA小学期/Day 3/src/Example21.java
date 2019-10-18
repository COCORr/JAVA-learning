import java.util.Scanner;

class Studentaa {
   int number;
   String name;
   Studentaa() {
   }
   Studentaa(int number,String name) {
    //构造方法
  
    this.number=number;
     this.name=name;
    
    System.out.println("我的名字是:"+name+ "学号是:"+number);
   }
 }
class UniverStudent extends Studentaa {
   String marital ;
   UniverStudent(int number,String name,String marital) {

    super(number,name);
    this.marital=marital;
    System.out.println("婚否="+marital );
   }
}
public class Example21 {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("请输入姓名:");
       String next = scanner.next();
       System.out.println("请输入年龄:");
       int nextInt =scanner.nextInt();
       System.out.println("请输入婚否：");
       String next1 = scanner.next();
      UniverStudent zhang=new UniverStudent(nextInt,next,next1);
   }
}

