# 1. String类

1. 在程序当中，所有的双引号中的内容都是字符串（没有new也是）

2. 字符串用不改变，字符串是可以共享使用的

3. 字符串效果上相当于是char[]字符数组，但底层原理是byte[]字节数组

## 1.1 4种创建方式

三种构造方法：
public String()：创建一个空白字符串，不含有任何内容。
public String(char[] array)：根据字符数组的内容，来创建对应的字符串。
public String(byte[] array)：根据字节数组的内容，来创建对应的字符串。
一种直接创建：
String str = "Hello"; // 右边直接用双引号

```java
public static void main(String[] args) {
    // 使用空参构造
    String str1 = new String(); // 小括号留空，说明字符串什么内容都没有。

    // 根据字符数组创建字符串
    char[] charArray = { 'A', 'B', 'C' };
    String str2 = new String(charArray);

    // 根据字节数组创建字符串
    byte[] byteArray = { 97, 98, 99 };
    String str3 = new String(byteArray);
  
    // 直接创建
    String str4 = "Hello";
   
```

## 1.2 字符串常量池

程序当中直接写上的双赢好字符串，就在字符串常量池中

![字符串常量值](/Users/darnell/Desktop/字符串常量值.png)

## 1.3 常用API

### public boolean equals(Object obj) 字符串比较函数

###public boolean equalsIgnoreCase(Object obj) 忽略大小写比较

注意事项：

1. 任何对象都能用Object进行接收。
2. equals方法具有对称性，也就是a.equals(b)和b.equals(a)效果一样。
3. 如果比较双方一个常量一个变量，推荐把常量字符串写在前面。
   推荐："abc".equals(str)    不推荐：str.equals("abc")

### public int length()：获取字符串当中含有的字符个数，拿到字符串长度。
### public String concat(String str)：将当前字符串和参数字符串拼接成为返回值新的字符串。

~~~java
String s1="hello";
String s2="hi";
String s3=s1.concat(s2);//s3=hellohi
~~~



### public char charAt(int index)：获取指定索引位置的单个字符。（索引从0开始。）
### public int indexOf(String str)：查找参数字符串在本字符串当中首次出现的索引位置，如果没有返回-1值。

### public String substring(int index)：截取从参数位置一直到字符串末尾，返回新字符串。
### public String substring(int begin, int end)：截取从begin开始，一直到end结束，中间的字符串。
备注：[begin,end)，包含左边，不包含右边。

### public char[] toCharArray()：将当前字符串拆分成为字符数组作为返回值。
### public byte[] getBytes()：获得当前字符串底层的字节数组。
### public String replace(CharSequence oldString, CharSequence newString)：
将所有出现的老字符串替换成为新的字符串，返回替换之后的结果新字符串。

备注：CharSequence意思就是说可以接受字符串类型。

### public String[] split(String regex)：按照参数的规则，将字符串切分成为若干部分。

切割和截取不同 截取只要一段 而切割是分成好几段

！！！ split的参数其实是一个正则表达式 如果按照英文句点区分. 需要用“\\\\.”

~~~java
String s1="aaa bbb ccc";
Srting[] array=s1.split(" ");//以空格切成三个

~~~





# 2. static 静态关键字



![static关键字详解](/Users/darnell/Desktop/static关键字详解.png)

如果一个成员变量用了static，该成员变量由该类所有。

如果使用static修饰一个方法，则该方法不属于对象，仅属于该类本身。

~~~Java
public class Aaa{
	public void phello(){
		System.out.print("hello");
	}
	public static void pphello(){
		System.out.print("hello");
	}
	public static void main(String[] args){
		Aaa a=new Aaa();
		a.phello();
		pphello();//与上方函数效果相同
    Aaa.pphello();
	}
}
~~~

### 注意事项

1. 静态不能直接访问非静态。
   原因：因为在内存当中是【先】有的静态内容，【后】有的非静态内容。
   “先人不知道后人，但是后人知道先人。”
2. 静态方法当中不能用this。
原因：this代表当前对象，通过谁调用的方法，谁就是当前对象。

## 2.1 static内存分区

![static 内存分区](/Users/darnell/Desktop/static 内存分区.png)

## 2.2 静态代码块

~~~java
//格式
public class Person{
	static{
		System.out.println("xxx");
	}
}
~~~

特点： 当第一次使用本类时，静态代码块执行唯一一次
静态内容从是优先于非静态
静态代码块比构造方法先执行

# 3. Arrays类

java.util.Arrays是一个与数组相关的工具类，里面提供了大量静态方法，用来实现数组常见的操作。

## 3.1 常用API

### public static String toString(数组)：将参数数组变成字符串（按照默认格式：[元素1, 元素2, 元素3...]）
### public static void sort(数组)：按照默认升序（从小到大）对数组的元素进行排序。

备注：
1. 如果是数值，sort默认按照升序从小到大
2. 如果是字符串，sort默认按照字母升序
3. 如果是自定义的类型，那么这个自定义的类需要有Comparable或者Comparator接口的支持。

# 4 Math类

java.util.Math类是数学相关的工具类，里面提供了大量的静态方法，完成与数学运算相关的操作。

## 4.1常用API

### public static double abs(double num)：获取绝对值。有多种重载。
### public static double ceil(double num)：向上取整。
### public static double floor(double num)：向下取整。
### public static long round(double num)：四舍五入。

# 4.2 Math中的常量

Math.PI 相当于圆周率常量