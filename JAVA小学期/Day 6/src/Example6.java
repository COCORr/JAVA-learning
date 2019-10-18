import java.util.*;

class Student implements Comparable { 
   int height=0;
   String name;
   Student(String n,int h) {
      name=n;
      height = h;
     
   }
   public int compareTo(Object b) {
     //逻辑

     Student a=(Student)b;
     return this.height-a.height;
     
   }
}

public class Example6 {
    public static void main(String args[ ]) { 
       List<Student> list = new LinkedList<Student>();
       System.out.println("请输入3个学生姓名和身高：");
       Scanner scanner = new Scanner(System.in);
       list.add(new Student(scanner.next(),scanner.nextInt()));
       list.add(new Student(scanner.next(),scanner.nextInt()));
       list.add(new Student(scanner.next(),scanner.nextInt())); 
       Iterator<Student> iter=list.iterator();
       System.out.println("排序前,链表中的数据");
       //逻辑
       // 打印链表中的元素

      Student stu;
      while(iter.hasNext()){
          
         stu=iter.next();
        System.out.println(stu.name+ "身高:"+stu.height);
       }
       Collections.sort(list);
       System.out.println("排序后,链表中的数据");
       iter=list.iterator();

      while(iter.hasNext()){
         stu=iter.next();
         
         System.out.println(stu.name+ "身高:"+stu.height);
       }
       System.out.println("请输入要比较身高同学的姓名和身高：");
       
       Student zhaoLin = new Student(scanner.next(),scanner.nextInt());
       int index = Collections.binarySearch(list,zhaoLin,null);

       if(index>=0) {
            
            System.out.println(zhaoLin.name+"和链表中"+list.get(index).name+"身高相同");
       }
    }
}

