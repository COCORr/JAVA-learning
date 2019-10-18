import java.util.Scanner;


 abstract class SIM {
    public abstract void setNumber(String n);
    public abstract String giveNumber();
    public abstract String giveCorpName();
}

 /* TODO：实现移动sim继承父类 */ 
 class SIMOfChinaMobile extends SIM {
    String number;
    public void setNumber(String n) {
        number = n;
    }
    public String giveNumber() {
        return number;
    }
     public String giveCorpName() {
        return "中国移动";
    }
}

 /* TODO：实现联通sim继承父类 */ 
 class SIMOfChinaUnicom extends SIM {
    String number;
    public void setNumber(String n) {
        number = n;
    }
    public String giveNumber() {
        return number;
    }
    public String giveCorpName() {
        return "联通";
    }
}

 class MobileTelephone {
	   SIM card;
	   public void useSIM(SIM card) {
	      this.card=card;
	   }
	   public void showMess() {
	      System.out.println("使用的卡是:"+card.giveCorpName()+"提供的");
	      System.out.println("手机号码是:"+card.giveNumber());
	   }
	}

/*
* 利用多态性质，父类调用子类方法，定义一个移动卡、联通卡，
* 手机类继承父类。实现动态调用，对输入手机号打印输出结果。
*/
public class Example23 {
   public static void main(String args[]) {
      MobileTelephone telephone = new MobileTelephone ();
      Scanner scanner = new Scanner(System.in);
      /* TODO：定义变量SIM sim，利用SIMOfChinaMobile对象给变量SIM sim设定值 */
      SIM sim=new SIMOfChinaMobile();
      System.out.println("请输入移动卡手机号：");
      sim.setNumber(scanner.next());
	  // 调用移动卡
      /* TODO：编写代码，实现输出移动卡的信息 */
	 telephone.useSIM(sim);
      System.out.println("-------输出结果--------");
      telephone.showMess();
      System.out.println("--------------------");
      /* TODO：利用SIMOfChinaUnicom对象给变量sim设定值 */
      sim=new SIMOfChinaUnicom();
      System.out.println("请输入联通手机号：");
      sim.setNumber(scanner.next());
	  // 调用联通卡
      /* TODO：编写代码，实现输出联通卡的信息 */
      telephone.useSIM(sim);
      System.out.println("-------输出结果--------");
      telephone.showMess();
   }
}
