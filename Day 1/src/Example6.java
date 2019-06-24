import java.util.*;

public class Example6 {
    
    public static void main (String args[ ]) {
        
        Scanner reader=new Scanner(System.in);
        double sum=0;
        int m=0;
        /*
        * 在键盘依次输入三个数字，每个数字按回车键确认，
        * 最后在键盘输入一个非数字的字符串结束整个操作，
        * 该三个数字求和以及平均值。
        */
        while(m<3){
            double x=reader.nextDouble();
            m=m+1;
            /**  TODO: 编写求和内容 **/
            sum+=x;
            
        }
        System.out.printf("%d个数的和为%f\n",m,sum);
        System.out.printf("%d个数的平均值是%f\n",m,sum/m); 
    }
}

