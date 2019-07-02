import java.util.Scanner;

interface SpeakHello {
     void speak();
}
class  HelloMachine {
   public void turnOn(SpeakHello hello) {
       hello.speak();
   }
}
public class Example5 {
   public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      HelloMachine machine = new HelloMachine();
      machine.turnOn(
                new SpeakHello() {
                    @Override
                    public void speak() {
                       // System.out.println("fuckyou caonima ma rui xin");
                        //逻辑
                        /* TODO: 利用匿名类，重写接口中的方法 */
                        // 方法体内容
                        System.out.println("请输入你说的话：");
                        System.out.println(sc.nextLine());
                    }}
                    );
        machine.turnOn(
                new SpeakHello() {
                    @Override
                    public void speak() {
                       // System.out.println("cao ni ma sha bi gong cheng shi");


                        //逻辑
                        /* TODO: 利用匿名类，重写接口中的方法 */
                        // 方法体内容
                        System.out.println("请输入你说的话：");
                        System.out.println(sc.nextLine());
                    }}
                    );
   } 
}

