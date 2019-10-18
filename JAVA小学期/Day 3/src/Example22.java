import java.util.Scanner;

public class Example22 {
   public static void main(String args[]) {
	   Scanner reader = new Scanner(System.in);
      Studenttt zhang = new Studenttt();
      zhang.age=reader.nextInt();
      zhang.number=reader.nextInt();
      UniverStudenttt geng = new UniverStudenttt();
     geng.age=reader.nextInt();
      geng.number=reader.nextInt();
      zhang.showPeopleaaMess();  //调用继承的方法
      zhang.tellNumber();        
      int x=9,y=29;
      System.out.print("会做加法:");
      int result=zhang.add(x,y);
      System.out.printf("%d+%d=%d\n",x,y,result);
      geng.showPeopleaaMess();  //调用继承的方法
      geng.tellNumber();        //调用继承的方法
      System.out.print("会做加法:");
      result=geng.add(x,y);      //调用继承的方法
      System.out.printf("%d+%d=%d ",x,y,result);
      System.out.print("会做乘法:");
      result=geng.multi(x,y);
      System.out.printf("%d×%d=%d",x,y,result); 
   }
} 

 class Peopleaa { 
    int age,leg = 2,hand = 2;
    protected void showPeopleaaMess() {
       System.out.printf("%d岁，%d只脚,%d只手 ",age,leg,hand);
    }    
}

 class UniverStudenttt extends Studenttt{

   int multi(int a,int b){
   		return a*b;
   }
}

 class Studenttt extends Peopleaa{
   int number;
   void tellNumber() {
       System.out.printf("学号:%d ",number); 
   }
   
 
   int add(int a,int b){
   		return a+b;
   }
   
} 