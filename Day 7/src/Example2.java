import java.util.Scanner;

/*
* 利用断言性质，规定计算和的时候不允许出现负数，在关闭断言情况下，计算输入数的和。
*/

public class Example2 {
    
    public static void main (String args[ ]) {
        int [] score ={0,0,0,0};
        System.out.println("请输入3个正数,1个负数");
        Scanner scanner = new Scanner(System.in);
        /*TODO: 将scanner接受的数字赋值给数组score */
        for(int i=0;i<4;i++)
            score[i]=scanner.nextInt();
        int sum=0;
        for(int number:score) {
            /*TODO: 利用断言, 规定计算和的时候不允许出现负数 
                 
            /*TODO: 计算输入数的和 */
          sum+=number;
          try {
            	
                assert sum>=0:"负数不能是成绩";
            }catch (AssertionError err){
                System.out.println(err.getMessage());
            break;
            }

            
        } 
        System.out.println("总成绩:"+sum);    
    }
}