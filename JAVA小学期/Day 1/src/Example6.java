import java.util.*;

public class Example6 {
    
    public static void main (String args[ ]) {
        
        Scanner reader=new Scanner(System.in);
        double sum=0;
        int m=0;
        
        while(m<3){
            double x=reader.nextDouble();
            m=m+1;
            
            sum+=x;
            
        }
        System.out.printf("%d个数的和为%f\n",m,sum);
        System.out.printf("%d个数的平均值是%f\n",m,sum/m); 
    }
}

