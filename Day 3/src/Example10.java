import java.util.Scanner;

public class Example10 { 
   public static void main(String args[ ]) { 
      char a[]={'a','b','c','D','E','F'};
      System.out.println("请输入三个小写字母和三个大写字母：");
      Scanner sc = new Scanner(System.in);
      for(int i=0;i<a.length;i++){
    	  a[i]=sc.next().charAt(0);
      }

      for(int i=0;i<a.length;i++){
      	if('a'<=a[i]&&a[i]<='z'){
        	a[i]-=32;
        }else if('A'<=a[i]&&a[i]<='Z'){
        	a[i]+=32;
        }
      }
      for(int i=0;i<a.length;i++)   
         System.out.print(" "+a[i]);
 
   } 
}




