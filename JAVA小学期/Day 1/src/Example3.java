import java.util.Scanner;

public class Example3 { 
   public static void main (String args[]) {
      byte b = 22; 
      int  n = 129;  
      float f =123456.6789f ;
      double d=123456789.123456789;
      System.out.println("请输入byte(-128到127) int(大于127) float double四种类型数据：");
      Scanner scanner = new Scanner(System.in);
      //填写逻辑
	  try{
	  
	  	b=scanner.nextByte();
        n=scanner.nextInt();
        f=scanner.nextFloat();
        d=scanner.nextDouble();
        
	  }catch (Exception e) {
    	  System.out.println("输入有误！");
      }
      
      System.out.println("---------输出------------");
      System.out.println("byte=  "+b);   
      System.out.println("int=  "+n);
      System.out.println("float=  "+f);   
      System.out.println("double=  "+d); 
      //填写逻辑
	  // double转化float
	  
      
      System.out.println("将int转化为byte导致精度缺失        int=  "+ (byte)n);   
   }
}
