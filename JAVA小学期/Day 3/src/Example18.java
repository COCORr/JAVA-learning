import java.util.Scanner;

class  Apes {
   void crySpeak(String s) {
       System.out.println(s); 
   }  
}
class People extends Apes {
   void computer(int a,int b) { 
      int c=a*b;
      System.out.println(c); 
   }
   void crySpeak(String s) {
      System.out.println("***"+s+"***"); 
   }  
}
public class Example18 {
   public static void main(String args[]) {
      Apes monkey;
      People geng = new People();
      
      System.out.println("请输入字符串 ");
      Scanner scanner = new Scanner(System.in);
     
     monkey=new People();
      monkey.crySpeak(scanner.next());
      
      System.out.println("请输入俩个数字：");
      //调用
 
     People people=new People();
      people.computer(scanner.nextInt(),scanner.nextInt());
      
      
   }
}