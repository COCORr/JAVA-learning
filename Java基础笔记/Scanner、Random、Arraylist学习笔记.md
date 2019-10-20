# 1. 包的导入

import xxx

java.lang不需要导入

# 2. Scanner

~~~java
import java.util.Scanner

Scanner sc=new Scanner(xxx); #构造函数必需有内容
Scanner sc=new Scanner(System.in); #从键盘输入
~~~



# 3. 匿名对象

匿名对象只能使用唯一的一次

~~~Java
new People().showName() #一次使用后第二次使用需要再次重新创建一个对象
~~~

## 3.1 使用实例

~~~java
#正常使用
Scanner sc=new Scanner(System.in);
int num = sc.nextInt();
#匿名对象使用
int num=new Scanner(System.in).nextInt();
~~~



# 4. Random类

Random类用来生成随机数字。使用起来也是三个步骤：

1. 导包
import java.util.Random;

2. 创建
Random r = new Random(); // 小括号当中留空即可

3. 使用
获取一个随机的int数字（范围是int所有范围，有正负两种）：int num = r.nextInt()
获取一个随机的int数字（参数代表了范围，左闭右开区间）：int num = r.nextInt(3)
实际上代表的含义是：[0,3)，也就是0~2



# 5. ArrayList（类似于Python中的列表）

数组的长度不可以发生改变。
但是ArrayList集合的长度是可以随意变化的。

对于ArrayList来说，有一个尖括号<E>代表泛型。
泛型：也就是装在集合当中的所有元素，全都是统一的什么类型。
注意：泛型只能是引用类型，不能是基本类型。

注意事项：
对于ArrayList集合来说，直接打印得到的不是地址值，而是内容。
如果内容是空，得到的是空的中括号：[]



~~~java
ArrayList<String> ls=new ArrayList<String>();
~~~

## 5.1 常用方法

ArrayList当中的常用方法有：

public boolean add(E e)：向集合当中添加元素，参数的类型和泛型一致。返回值代表添加是否成功。
备注：对于ArrayList集合来说，add添加动作一定是成功的，所以返回值可用可不用。
但是对于其他集合（今后学习）来说，add添加动作不一定成功。

public E get(int index)：从集合当中获取元素，参数是索引编号，返回值就是对应位置的元素。

public E remove(int index)：从集合当中删除元素，参数是索引编号，返回值就是被删除掉的元素。

public int size()：获取集合的尺寸长度，返回值是集合中包含的元素个数。

~~~java
ls.add("hello");
~~~

# 5.2 向集合ArrayList当中存储基本类型数据

如果希望向集合ArrayList当中存储基本类型数据，必须使用基本类型对应的“包装类”。

基本类型    包装类（引用类型，包装类都位于java.lang包下）
byte        Byte
short       Short
int         Integer     【特殊】
long        Long
float       Float
double      Double
char        Character   【特殊】
boolean     Boolean

从JDK 1.5+开始，支持自动装箱、自动拆箱。

自动装箱：基本类型 --> 包装类型
自动拆箱：包装类型 --> 基本类型

~~~java
ArrayList<int> ls= new ArrayList<>(); #int报错
ArrayList<Integer> ls= new ArrayList<>(); #正确写法
~~~

