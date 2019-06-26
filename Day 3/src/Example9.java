import java.util.Scanner;

class Pointa{
	int x,y;
    	Pointa(){
		x=1;
		y=1;
    }


	Pointa(int a,int b){
    	this.x=a;
      	this.y=b;
    }
	
}
public class Example9 {
	public static void main(String[] args) {
		System.out.println("输入俩个整数：");
		Scanner sc = new Scanner(System.in);
		Pointa p = new Pointa(sc.nextInt(),sc.nextInt());
		System.out.println("坐标为：("+p.x+","+p.y+")");
		
	}
}
