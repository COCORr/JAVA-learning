# idea 操作

## 快捷字：5.fori

等同于

~~~java
for(int i=0;i<5;i++){

}
~~~

## 查看IDEA快捷键

见图



# 方法method

## 方法定义的前后顺序无所谓

## void的方法只能return自己

没有返回值，只是结束方法的执行

~~~java
public static void aaa(){
	return;
}
~~~

## 重载overload

函数名字相同即可

与public等修饰符无关

~~~java
public static void open();
static void open(int a);
~~~

与数据类型有关 与参数名称无关

~~~java
public static void open(int a,short b);
public static void open(short a,int b);
~~~





# 数组

## 创建(动态初始化)

使用动态初始化数组的时候，其中的元素将会自动拥有一个默认值。规则如下：
如果是整数类型，那么默认为0；
如果是浮点类型，那么默认为0.0；
如果是字符类型，那么默认为'\u0000'；
如果是布尔类型，那么默认为false；
如果是引用类型，那么默认为null。

~~~java
int[] array = new int[300];
~~~

## 静态初始化

会自动推算出来一个长度

~~~java
int[] array = new int[]{1,2,3};
String[] str = new String[]{"hello","hi"};
~~~

## 省略格式的静态初始化

~~~java
int[] array = {10,20,30};
~~~

可以拆分为两个步骤

~~~java
int[] arrayB;
arrayB=new int[]{10,20,30};
~~~



## 获取数组长度

.length

~~~java
int[] arrayA={1,2,3,321,12,321,12,32};
int len=arrayA.length;
~~~

