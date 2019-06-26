import java.util.Scanner;

abstract class GirlFriend {
   abstract void speak(Scanner scanner);
   abstract void cooking(Scanner scanner);
}
/* TODO：继承：GirlFriend */
class ChinaGirlFriend  extends GirlFriend{
   void speak(Scanner scanner){
	   System.out.println("请输入中国女孩说的话:");
      System.out.println(scanner.next());
   }
   void cooking(Scanner scanner){
	   System.out.println("请输入中国女孩做的饭:");
      System.out.println(scanner.next()); 
   }
}
/* TODO：继承：GirlFriend */
class AmericanGirlFriend  extends GirlFriend  {
   void speak(Scanner scanner){
	   System.out.println("请输入美国女孩说的话:");
      System.out.println(scanner.next());
   }
   void cooking(Scanner scanner){
	   System.out.println("请输入美国女孩做的饭:");
      System.out.println(scanner.next());
   }
}
class Boy {
   Scanner scanner = new Scanner(System.in);
   GirlFriend friend;
   void setGirlfriend(GirlFriend f){
       friend = f;
   }
   void showGirlFriend() {
      friend.speak(scanner);
      friend.cooking(scanner);
   }
}
public class Example16 {
   public static void main(String args[]) {
      Boy boy = new Boy();
      GirlFriend girl = new ChinaGirlFriend(); //girl是上转型对象

      /* TODO：调用Boy中的setGirlfriend
               调用Boy中的showGirlFriend */
       boy.setGirlfriend(girl);
     	boy.showGirlFriend();
      girl = new AmericanGirlFriend(); //girl是上转型对象
      /* TODO：调用Boy中的setGirlfriend
               调用Boy中的showGirlFriend */
      boy.setGirlfriend(girl);
     	boy.showGirlFriend();
      
   }
}