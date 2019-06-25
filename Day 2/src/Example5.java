import java.util.Scanner;

public class Example5 {
	public static void main(String args[ ]) {
			int[] a= new int[10];
		   System.out.print("输入10个以内整数型数据(0结束)：");
		   Scanner scanner = new Scanner(System.in);
		   int b = scanner.nextInt();
		  for(int i = 0;i<10&&(b!=0);i++){
			  a[i]=b;
			  b = scanner.nextInt();
		  }
		  /*
		  TODO:
		  功能描述：for语句判断数组的长度 
		  例如：判断a[i]是0，输出:"数组的长度是："+i,如果i=9，输出:"数组的长度是："+a.length		  
		  */
		
    	for(int i =0;i<10;i++){
        	if(a[i]==0){
        System.out.print("数组的长度是："+i);
              break;
       	 	}
        
      
		if(i==9){
     	System.out.print("数组的长度是："+a.length);
      }
        }
    }
}
