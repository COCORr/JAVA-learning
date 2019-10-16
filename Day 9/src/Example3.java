import java.io.*;
import java.util.Scanner;
public class Example3 {

public static void main(String args[]) {
	  Scanner reader = new Scanner(System.in);
      String command = reader.nextLine();
      EncryptAndDecrypt person = new EncryptAndDecrypt();
      String password = "Tiger";
      String secret = person.encrypt(command,password); 
      File file=new File("secret.txt");
      try{
    	  FileOutputStream aFileInputStream=new FileOutputStream(file);
    	  DataOutputStream dsDataOutputStream=new DataOutputStream(aFileInputStream);
    	  dsDataOutputStream.writeBytes(secret);
          //将加密字符串以数据流写入secret.txt文件
          System.out.println("加密命令:"+secret);
       } 
       catch(IOException e){}
       try{
    	  FileInputStream bFileInputStream=new FileInputStream(file);
    	  DataInputStream dInputStream=new DataInputStream(bFileInputStream);
    	  //以数据流读取secret.txt文件内容
    	 // secret=dInputStream.readUTF();
    	  
          String mingwen = person.decrypt( secret   ,password);//解密字符串
          System.out.println("解密命令:"+mingwen);       
       }
       catch(IOException e){}
   }
}

class EncryptAndDecrypt{
	String encrypt(String sourceString,String password){
		char [] p = password.toCharArray();
		int n = p.length;
		char [] c = sourceString.toCharArray();
		int m = c.length;
		for(int k = 0;k<m;k++){
			int mima = c[k]+p[k%n];
			c[k] = (char)mima;
		}
		return new String(c);
	}
	
	String decrypt(String sourceString,String password){
		char [] p = password.toCharArray();
		int n = p.length;
		char [] c = sourceString.toCharArray();
		int m = c.length;
		for(int k = 0;k<m;k++){
			int mima = c[k]-p[k%n];
			c[k] = (char)mima;
		}
		return new String(c);
	}
	
}