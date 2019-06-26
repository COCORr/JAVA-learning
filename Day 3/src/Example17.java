import java.util.Scanner;

class  Animal {
   void cry(String call) {
   }  
}
class Dog extends Animal {
   void cry(String call) {
      System.out.println(call); 
   }  
}
class Cat extends Animal  {
   void cry(String call) {
      System.out.println(call); 
   }  
}
public class Example17 { 
   public static void main(String args[]) {
      Animal animal;

	  /* TODO: 多态实现,创建Dog类的对象赋值给animal */
      animal=new Dog();
      System.out.println("请输入狗叫：");
      Scanner scanner = new Scanner(System.in);
	  //调用Dog类的cry
     
      animal.cry(scanner.next()); 

	  /* TODO: 多态实现,创建Cat类的对象赋值给animal */
      animal=new Cat();
      System.out.println("请输入猫叫：");
	  //调用Cat类的cry
      animal.cry(scanner.next());
  }
}
