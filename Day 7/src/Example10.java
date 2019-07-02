import java.util.Scanner;

interface ShowMessage {
    void showLogo(String s);
}
/* TODO：实现接口 */
class TV implements ShowMessage{
    public void showLogo(String s) {
        System.out.println(s);
    }
}
/* TODO：实现接口 */
class PC  implements ShowMessage{
    public void showLogo(String s) {
        System.out.println(s);
    }
}
public class Example10 {
   public static void main(String args[]) {
     ShowMessage sm;                  //声明接口变量
        sm=new TV();
        /* TODO：接口变量sm中存放TV对象的引用 */
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入TV的商标");
        //接口回调。
        /* TODO：接口变量sm调用showLogo参数是scanner.next() */
        sm.showLogo(scanner.next());
        /* TODO：接口变量sm中存放PC对象的引用 */
        sm=new PC();
        System.out.println("请输入PC的商标");
        //接口回调
        /* TODO：接口变量sm调用showLogo参数是scanner.next() */
        sm.showLogo(scanner.next());
   } 
}