import java.util.Scanner;

class Student {
   private int age;
   public void setAge(int age) {
          this.age=age;
   }
   /*
	TODO:
	功能描述：访问本地私有变量age,供外部调用此方法
	参数：无
	返回值：本地私有变量age int型
   */
   public int getAge() {
      return age;
   }
}



public class Example11 {
   public static void main(String args[]) {
      Student zhang=new Student(); 
      Student geng=new Student(); 
      Scanner sc = new Scanner(System.in);
      System.out.println("请输入zhang、geng的年龄：");
      zhang.setAge(sc.nextInt()); 
      geng.setAge(sc.nextInt());
     
     System.out.println("zhang的年龄："+zhang.getAge());
	 System.out.println("geng的年龄："+geng.getAge());

    }
}




