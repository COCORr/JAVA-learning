import java.io.*;
import java.util.Scanner;

public class Example4 {
   public static void main(String args[]) {
       Scanner reader = new Scanner(System.in);
       String str = reader.nextLine();
      try {
            // 字节数组流写入内存
            ByteArrayOutputStream outByte = new ByteArrayOutputStream()   ;
            byte [] byteContent = str.getBytes();
            outByte.write(byteContent);
            //读取内存字符串（字节）
            // 字节数组流读取内存
            // TODO：
            ByteArrayInputStream inByte= new ByteArrayInputStream(byteContent);
            byte [] backByte = byteContent ;
            inByte.read(backByte);
            System.out.println(new String(backByte));
            
            // 字符数组流写入内存
            CharArrayWriter outChar = new CharArrayWriter()  ;
            char [] charContent=str.toCharArray();
            outChar.write(charContent);
            //读取内存字符串（字符）
            // 字符数组流读取内存
            // TODO：
            CharArrayReader inChar = new CharArrayReader(charContent)   ;
            char backChar [] =  charContent  ;
            inChar.read(backChar);
            System.out.print(new String(backChar));
      }
      catch(IOException exp){}
  }
}