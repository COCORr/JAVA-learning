import java.util.Scanner;

class XiyoujiRenwu{
	float height,weight;
	String head,ear;
	 void speak(String s) {
        System.out.println(s);
    }
}
public class Example8 {
	public static void main(String[] args) {
		System.out.println("输入你要讲的话：");
		Scanner sc = new Scanner(System.in);
		
		
      	XiyoujiRenwu a=new XiyoujiRenwu();
      	a.speak(sc.next());
		
	}
}
