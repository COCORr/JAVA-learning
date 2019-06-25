import java.util.Scanner;

public class Example7 {
	public static void main(String args[ ]) {
		   System.out.println("输入6个整数，初始化一个二维数组（俩行三列）");		  
                /*
				TODO:初始化一个俩行三列的整型二维数组，创建scanner类，依次输入数据
				例如：int mytwo = new int[2][3]
				*/
      		int [][]mytwo=new int[2][3];
      		Scanner scanner= new Scanner(System.in);
      		for(int i=0;i<2;i++){
            	for(int j=0;j<3;j++){
                	mytwo[i][j]=scanner.nextInt();
                }
            }
		   
		  
		   System.out.println("整型二维数组的内容是：");
		   for(int i=0;i<2;i++){
			   for(int j=0;j<3;j++){
				   System.out.print(mytwo[i][j]+"  ");
			   }
			   System.out.println();
		   }
		   
	}
}

