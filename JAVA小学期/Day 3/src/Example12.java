import java.util.Arrays;
import java.util.Scanner;
public class Example12 {
public static void main(String args[]) {
		java.util.
      Scanner sc = new Scanner(System.in);
      System.out.println("输入5个数：");
      int[] a={0,0,0,0,0};
      for(int i=0;i<5;i++){
    	  a[i]=sc.nextInt();
      }
      Arrays.sort(a);
      for(int s:a) {
    	  System.out.print(s+"  ");
      }
  	
   }
}
