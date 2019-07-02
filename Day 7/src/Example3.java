import java.util.Scanner;
class Bank {
    private int money;
    public void income(int in,int out) throws BankException {
       if(in<=0||out>=0||in+out<=0) {
          /* TODO：方法抛出异常，导致方法结束 */
         throw  new BankException(in,out);
          
       }
       /* TODO：根据收入、支出计算本次纯收入 */
       int netIncome=in+out;
       System.out.printf("本次计算出的纯收入是:%d元\n",netIncome);
       /* TODO：最终存款 */
       money+=netIncome;
    } 
    public int getMoney() {
       return money;
    } 
}
// 自定义异常类捕获收入、支出异常
/* TODO：自定义异常类捕获异常 */
class BankException extends Exception{
       String message;
       public BankException(int m,int n) {
           message="入账资金"+m+"是负数或支出"+n+"是正数，不符合系统要求.";
       }
       public String warnMess() {
           return message;
       }
    } 
/*
* 银行收入为正数，支出为负数。定义银行类计算收入、支出情况，根据收入、支出计算本次纯收入
* 、最终存款。自定义异常类捕获收入、支出异常情况输出原因还有最终存款。
*/
public class Example3 {
   public static void main(String args[]) {
      Bank bank=new Bank();
      try{  
          System.out.println("请输入银行收入、支出（收入正数 支出负数）:");
          Scanner scanner = new Scanner(System.in);
          bank.income(scanner.nextInt(),scanner.nextInt());
          
          System.out.printf("银行目前有%d元\n",bank.getMoney());
          System.out.println("请输入银行收入、支出（收入负数或支出正数）:");
            
          bank.income(scanner.nextInt(),scanner.nextInt());
          bank.income(99999,-100);
          
           
      }
      catch(BankException e) {
            System.out.println("计算收益的过程出现如下问题:");
            /* TODO：打印自定义的异常信息 */
                      System.out.println(e.warnMess());

      }
      System.out.printf("银行目前有%d元\n",bank.getMoney());
   }
}