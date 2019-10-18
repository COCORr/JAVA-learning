import java.util.*;
public class Example4 {
    public static void main(String args[ ]) { 
       List<Integer> list = new LinkedList<Integer>();
       Scanner scanner =  new Scanner(System.in);
       System.out.println("请输入链表中的5个数字：");
       for(int i=0;i<5;i++)
           list.add(new Integer(scanner.nextInt()));
       System.out.println("洗牌前,链表中的数据");
       Iterator<Integer> iter=list.iterator();
	   
      	while(iter.hasNext()){
          Integer n =iter.next();
      	System.out.printf("%d ",n.intValue());
        }
        System.out.printf("\n再向右旋转1次后,链表中的数据\n");
	    iter=list.iterator();
     	Collections.rotate(list,1);
           	while(iter.hasNext()){
          Integer n =iter.next();
      	System.out.printf("%d ",n.intValue());
        }
    }
}

