import java.util.*;
public class Example1 {

	   public static void main(String args[]) {
		      int start=0,end,middle;
		      int a[] = {12,45,67,89,123,-45,67};
		      int N = a.length;
		      for(int i=0; i<N; i++) {     //选择法排序数组
		     for(int j = i+1; j < N;j++){
		           if(a[j] < a[i]){
		             int t = a[j];
		             a[j] = a[i];
		             a[i] = t;
		           }
		         }  
		      }
		      System.out.println(Arrays. toString(a));
		      Scanner scanner = new Scanner(System.in);
		      System.out.println("输入整数，程序判断该整数是否在数组中:"); 
		      int number = scanner.nextInt();
		      //填写逻辑
		      // 定义好已知数组，输入数据，判断该数据是否在指定数组中（二分查找）
			  /*
				TODO:使用二分法循环判断输入的数是否与数组的数相等，即：寻找start和end的中间位置，找到判断number与middle大小，
				     如number>middle，将start=middle 如number<middle,将end=middle,循环次操作，找到或count>N/2为止。
			  */
		     int count =0;
		     end=a.length-1;
		     while(start<=end){
		     	middle=(start+end)/2;
		       if(a[middle]==number){
		       	break;
		       }else if(number<a[middle]){
		       	end=middle;
		         count++;
		       }else {
		       	start=middle;
		         count++;
		       }
		       if (count>N/2) {
				break;
			}
		     }
		      if(count>N/2)
		         System.out.println(number+"不在数组中");
		      else
		         System.out.println(number+"在数组中");
		   }
		}