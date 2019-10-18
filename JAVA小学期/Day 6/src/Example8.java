import java.util.*;
public class Example8 {

    public static void main(String args[]){
        LinkedList mylist=new LinkedList();
        System.out.println("请输入链表2个节点中的数据：");
        Scanner scanner = new Scanner(System.in);
        mylist.add(scanner.next());                 //链表中的第一个节点
        mylist.add(scanner.next());                 //链表中的第二个节点
        // 集合中get方法遍历

        int number=mylist.size();         //获取链表的长度
      	
      	String temp;
        for(int i=0;i<mylist.size();i++){
           //必须强制转换取出的数据
           //逻辑

           temp=(String)mylist.get(i);
         
           System.out.println("get:第"+i+"节点中的数据:"+temp);
        } 
        
        
        // iterator遍历

        Iterator<String> iter=mylist.iterator(); 
        String te;
        while(iter.hasNext()) {
           //必须强制转换取出的数据
           //逻辑

            te=(String)iter.next();
     
           System.out.println("iterator:"+te);
        }
   }


}
