import java.util.Scanner;

public class Example8 {
  			static String []str=new String[3];
	public static void main(String args[ ]) {
		   System.out.println("声明一个字符串数组，并赋值");

		   Scanner scanner = new Scanner(System.in);
		  for(int i=0;i<3;i++){
          	str[i]=scanner.nextLine();
          }
		   System.out.println("数组的内容是：");
		   for (String string : str) {
			System.out.print(string+" ");
			
		}
		   
	}
}

