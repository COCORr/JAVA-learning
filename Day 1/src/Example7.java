import java.util.Scanner;

public class Example7 {
       public static void main(String args[]) {
            Scanner reader=new Scanner(System.in);
            System.out.println("请输入四个正整数(回车为确认)：");
            int[] arr=new int[4];
            for(int i = 0;i<4;i++){
                 arr[i]= reader.nextInt();
            }
            tArray(arr);
   		}
   //遍历数组的方法
   public static void tArray(int a[]){  
    System.out.print("请输出数组内容：");
    //输出格式：数组元素1 数组元素2 数组元素3 数组元素4
    //例如：80 90 100 101
    /** TODO：遍历输出数组a **/  
    for(int j=0;j<4;j++){
      System.out.print(a[j]+" ");
    }
    
   }
}

