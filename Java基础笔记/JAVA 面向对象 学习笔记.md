# 局部变量与成员变量

1. 定义的位置不一样
局部变量：在方法的内部
成员变量：在方法的外部，直接写在类当中

2. 作用范围不一样
局部变量：只有方法当中才可以使用，出了方法就不能再用
成员变量：整个类全都可以通用。

3. 默认值不一样
局部变量：没有默认值，如果要想使用，必须手动进行赋值
成员变量：如果没有赋值，会有默认值，规则和数组一样

4. 内存的位置不一样
局部变量：位于栈内存
成员变量：位于堆内存（采用先进先出的方式）

5. 生命周期不一样
局部变量：随着方法进栈而诞生，随着方法出栈而消失
成员变量：随着对象创建而诞生，随着对象被垃圾回收而消失

# private成员变量

间接访问private成员变量，就是定义一对儿Getter/Setter方法

必须叫setXxx或者是getXxx命名规则。
对于Getter来说，不能有参数，返回值类型和成员变量对应；
对于Setter来说，不能有返回值，参数类型和成员变量对应。

对于基本类型当中的boolean值，Getter方法一定要写成isXxx的形式，而setXxx规则不变。

# 变量重名

当方法的局部变量和类的成员变量重名的时候，根据“就近原则”，优先使用局部变量。
如果需要访问本类当中的成员变量，需要使用格式：
this.成员变量名

~~~java
public class A{
	private int a;
	public void show(int a){
		System.out.println(this.a+a);
	}
}
~~~



# 构造方法

构造方法不需要返回值 不需要void

~~~java
public class Hello{
	private int a;
	public Hello(int a){
		this.a=a;
	}
}
~~~

# idea自动生成get set代码

code-generate-GetterandSetter

同理可以生成构造方法

Code-generate-constructor

