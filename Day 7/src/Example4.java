import java.util.Scanner;
import java.io.*;

/*
* 已定义好三个数字，输入三个数给他们赋值，
* 利用try-catch捕获异常输出,测试异常语句下面是否执行，
* 然后自己手动抛出一个异常，输出结果。
*/
public class Example4 {
   public static void main(String args[ ]) {
      int n = 0,m = 0,t = 1000;
      
     /* TODO: 利用try-catch捕获异常输出 */
          System.out.println("初始化n=0 m=0 t=1000");
          System.out.println("请输入三个数给n,m,t赋值（其中输入m非法数字）");
          Scanner scanner = new Scanner(System.in);
          try{
        n = Integer.parseInt(scanner.next()); //发生异常,转向catch
        m = Integer.parseInt(scanner.next());
        t = Integer.parseInt(scanner.next());  //没有机会被赋值
             }
        /* TODO: 利用try-catch捕获异常输出 */
        catch (Exception e) {
            System.out.println("发生异常:" +e.getMessage()/* TODO: 异常信息 */);
        }
        System.out.println("n="+n+",m="+m+",t="+t);
        /* TODO: 利用try-catch捕获异常输出 */
        try {
            System.out.println("故意抛出I/O异常！");

            /* TODO: 抛出IOException，参数："我是故意的" */
            throw  new IOException("我是故意的");
        }

        /* TODO: 捕获抛出的异常 */
        catch (Exception e) {
            System.out.println("发生异常:" +e.getMessage()/* TODO: 异常信息 */);
        }
      
   }  
}