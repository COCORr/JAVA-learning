import java.util.Scanner;

 /* TODO: 完成自定义异常类，实现捕获异常 */
 class DangerException extends Exception{
   final String message = "超载";
   public String warnMess() {
       return message;
   }
} 

 class CargoBoat {
     int realContent;  //装载的重量
     int maxContent;   //最大装载量
     public void setMaxContent(int c) {
         maxContent = c;
     }
     public void loading(int m) throws DangerException {
      /* TODO: 判断是否大于最大装载量1000,大于最大装载量抛出异常 */
       if(realContent+m>maxContent)
           throw new DangerException();
        else   { realContent+=m;
       System.out.println("目前装载了"+realContent+"吨货物");
               }
     }
}

public class Example1 {
   public static void main(String args[]) {
      CargoBoat ship = new CargoBoat();
      ship.setMaxContent(1000);
      int m =0;
      try{  
          Scanner scanner = new Scanner(System.in);
          System.out.println("请输入装载量（最大量1000）");
          /* TODO: 把输入的值赋值给m
                   调用方法loading */
          m=scanner.nextInt();
          ship.loading(m);
         
           System.out.println("请输入装载量（最大量1000）");
          /* TODO: 把输入的值赋值给m
                   调用方法loading */
m=scanner.nextInt();
          ship.loading(m);
           System.out.println("请输入装载量（最大量1000）");
          /* TODO: 把输入的值赋值给m
                   调用方法loading */
          m=scanner.nextInt();
          ship.loading(m);
           System.out.println("请输入装载量（最大量1000）");
          /* TODO: 把输入的值赋值给m
                   调用方法loading */
          m=scanner.nextInt();
          ship.loading(m);
      }
      catch(DangerException e) {
           System.out.println(e.warnMess()); 
           System.out.println("无法再装载重量是"+m+"吨的集装箱");       
      }
      finally {
          System.out.printf("货船将正点启航");
      }
  }
}

