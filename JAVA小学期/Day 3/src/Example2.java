import java.util.Scanner;

class Lader1{
	float above,bottom,height,area;
	Lader1(float a,float b,float c){
		this.above = a;
		this.bottom = b;
		this.height = c;
	}
	float computerArea(){
		return (this.above+this.bottom)*this.height/2;	
	}
	
}
public class Example2 {
	public static void main(String[] args) {
		System.out.println("输入梯形的上底、下底、高：");
		Scanner sc = new Scanner(System.in);
		Lader1 lader = new Lader1(sc.nextFloat(),sc.nextFloat(),sc.nextFloat());
		System.out.println("梯形面积是："+lader.computerArea());
	}
}
