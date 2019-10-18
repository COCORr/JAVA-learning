import java.util.Scanner;

 class RedCowForm {
   static String formName;
   RedCow cow;  //内部类声明对象
   RedCowForm() {
   }
   RedCowForm(String s,int h,int w,int p) {
	 System.out.println("请输入红牛身高、体重、价格");
		  cow=new RedCow(h,w,p);
        formName=s;
     /* TODO: 内部类RedCow的引用
              通过方法的参数给变量formName赋值 */
     
   }
   public void showCowMess() {
      cow.speak();
   }
   class RedCow {  //内部类的声明
      String cowName = "红牛";
      int height,weight,price;
      RedCow(int h,int w,int p){
          height = h;
          weight = w;
          price = p;
      }
      void speak() {
         System.out.println("偶是"+cowName+",身高:"+height+"cm 体重:"+weight+"kg 价格："+price+",生活在"+formName);
      }
   }    //内部类结束
} 

public class Example6 {
   public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.println("请输入红牛生活场子：");
      RedCowForm form = new RedCowForm(sc.next(),sc.nextInt(),sc.nextInt(),sc.nextInt());
      //外部类RedCowForm的方法调用speak
      /* TODO: 利用form调用方法实现speak()的调用 */
  form.showCowMess();
      //内部类RedCow的调用speak
      /* TODO: 实现内部类RedCow的方法speak()的调用 */
       form.cow.speak();
   }
}