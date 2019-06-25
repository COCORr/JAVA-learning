import java.util.Scanner;

public class Example3 {
	public static void main(String args[ ]) {
			/*
			TODO:
			功能描述：定义boolean类型为true,并分别声明byte/short/int/long/float/double/char类型数据
            */
      		boolean a =true;
      		short sh;
      		int in;
      		byte by;
      		long lo;
      		float f;
      		double d;
      		char c;
			System.out.println("分别输入byte/short/int/long/float/double/char类型数据：");
			Scanner sc = new Scanner(System.in);
			by = sc.nextByte();
			sh = sc.nextShort();
			in = sc.nextInt();
			lo = sc.nextLong();
			f = sc.nextFloat();
			d = sc.nextDouble();
			c = sc.next().charAt(0);
			System.out.println("8大基本类型数据分别是："+"boolean="+a+",byte="+by+",short="+sh+",int="+in+",long="+lo+",float="+f+",double="+d+",char="+c);
	}
}

