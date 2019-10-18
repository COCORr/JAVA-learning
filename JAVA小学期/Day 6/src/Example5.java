import java.util.*;
public class Example5 {
   public static void main(String args[]) {
      ArrayList<Integer> list=new ArrayList<Integer>();
      System.out.println("输入10个整数：");
      Scanner scanner = new Scanner(System.in);
      /*
	  TODO:
	  功能描述：调用add方法，获取数据自动装箱。提示：实际添加到list中的是new Integer(i)
	  */
	  for(int i=0;i<10;i++) {
		 
    	list.add(scanner.nextInt());     
      }
	  /*
	  TODO:
	  功能描述：自动拆箱,依次获取Integer对象中的int型数据并打印,每个数据之间用两个空格隔开，提示：调用get方法
	  */
      for(int k=list.size()-1;k>=0;k--) {
		  
          System.out.print(list.get(k)+"  ");
       
      }
   }
}