import java.io.*;
public class Example1 {
    public static void main(String[] args)
            throws IOException {
	/*TODO:
	功能描述：以System.in为参数创建一个InputStreamReader流对象，使用BufferedReader in
	对InputStreamReader处理后的信息进行缓冲。
	参数说明：System in 程序启动时由Java系统自动创建的流对象
	*/	
    	InputStreamReader iin=new InputStreamReader(System.in);
    	BufferedReader in=new BufferedReader(iin);
        String s;
        while ((s = in.readLine()).length() != 0) { /* TODO:编写从键盘输入和判断条件 */
            System.out.print(s);
        }
    }
}
