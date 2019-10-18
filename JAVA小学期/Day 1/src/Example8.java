import java.util.Scanner;

public class Example8 {
    
    public static void main(String args[]) {
       Scanner reader = new Scanner(System.in);
       System.out.println("输入n：");
       int n = reader.nextInt();
       prime(n);
    }
   
    public static void prime(int n){
       int i,j;
      boolean is;
       // 编写程序计算出2~n以内的所有素数，并输出。
       // 质数又称素数：在大于1的自然数中，除了1和它本身以外不再有其他因数
       for(j=2;j<=n;j++) {
        
         is=false;
          for(i=2;i<j;i++){
          	if(j%i==0){
            	is=true;
              	break;
            }
          }
         if(is==false){
             System.out.println(""+j+"是素数");
         }
    }
}
}

