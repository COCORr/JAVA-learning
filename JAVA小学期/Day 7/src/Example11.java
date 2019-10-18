import java.util.Scanner;

interface Computable {

    int MAX = 46;
    int f(int x);
}
/* TODO: China类实现Computable接口 */
class China  implements Computable{  //China类实现Computable接口
    int number;
    public int f(int x) { //不要忘记public关键字
        //逻辑
        /* TODO: 计算数字1..n的和并返回 */
        return x*(x+1)/2;
    }
}

/* TODO: Japan类实现Computable接口 */
class Japan  implements Computable{ //Japan类实现Computable接口
    int number;
    public int f(int x) {
        //逻辑
        /* TODO: 返回数字x+MAX */
        return x+MAX;
    }
}



public class Example11 {
   public static void main(String args[]) {
      China zhang;
        Japan henlu;
        zhang=new China();
        henlu=new Japan();
        System.out.println("输入zhang的学号、数字n（计算1..n的和）：");
        System.out.println("输入henlu的学号、数字n（计算n+MAX的和）：");
        Scanner scanner = new Scanner(System.in);
        int a,b;
        a=scanner.nextInt();
        b=scanner.nextInt();
        int c,d;
        d = scanner.nextInt();
        c = scanner.nextInt();
        // 对输入学号+MAX
        // zhang的输入学号a
        // henlu的输入学号c
      /* TODO: zhang.number=zhang的输入学号+MAX
               henlu.number=henlu的输入学号+MAX */
        zhang.number=a+Computable.MAX;
        henlu.number=c+Computable.MAX;
        // zhang求和结果用输入的b进行计算
        // henlu求和结果用输入的d进行计算
        System.out.println("----------输出-----------");
        System.out.println("zhang的学号"+zhang.number+",zhang求和结果"+ zhang.f(b)/* TODO: zhang求和结果 */  );
        System.out.println("henlu的学号"+henlu.number+",henlu求和结果"+ henlu.f(d)/* TODO: henlu求和结果 */  );
   }
}

