# 一、junit

测试方法可以独立运行

## 1.1 @test

* 带有test关键字的方法可以独立运行

* 该方法必须带关键字void 不允许有返回值

~~~java
@test
pubilc void testMyMethod(){
		Assert.assertEquals(1,2);
}
~~~

## 1.2 @Before

* 带有Before关键字的方法必定在带有@test的方法之前运行

## 1.3 @After

* 带有After关键字的方法必定在带有@test的方法之后运行

~~~java
@Before
public void init(){
	System.out.println("我是初始化");
}

@After
public void close(){
	System.out.println("我是关闭程序");
}

@test
pubilc void testMyMethod(){
		Assert.assertEquals(1,2);
}
~~~

# 二、反射

用于框架设计

三阶段：

	1. Source源代码阶段
 	2. Class类对象阶段
 	3. Runtime运行时阶段

## 2.1 反射机制

* 将类的各个组成部分封装为类的对象
* 可以在程序运行过程中，操作这些对象
* 可以降低耦合性，提高程序的可扩展性



## 2.2 获取class对象

* ` Class.forName("全类名")` 将字节码文件加载入内存，返回class对象
* `类名.class` 通过类名的属性class获取
* `对象.getClass()`在object类中定义着

~~~java
Class cls1 = Class.forName("Java.uitl.xxxx");
Class cls2 = xxxx.class;
Class cls3 = new xxxx().getClass();

cls1==cls2;//true
cls2==cls3;//true
~~~

**同一个字节码文件(\*.class)在程序的一次运行中，只会被加载一次 **

## 2.3 Class对象功能

* 获取成员变量` Field[] getFields()` `Field getField(String name)` 仅public

* 获取构造方法` Constructor<?>[] getConstructors()` ` Constructor<T> getConstructors(类<?>...parameterTypes)`
* 获取成员方法`Method[] getMethods()`  `Method getMethods(类<?>...parameterTypes) `
* 获取类名 `String getName()`

## 2.4 案例（仔细看！框架）

~~~java
 public static void main(String[] args) throws Exception {
    		//可以创建任意类的对象，可以执行任意方法
        /*
        前提：不能改变该类的任何代码。可以创建任意类的对象，可以执行任意方法
        */
      	/* 
      	Person p = new Person();
        p.eat();*/
				/*
        Student stu = new Student();
        stu.sleep();*/

        //1.加载配置文件
        //1.1创建Properties对象
        Properties pro = new Properties();
        //1.2加载配置文件，转换为一个集合
        //1.2.1获取class目录下的配置文件
        ClassLoader classLoader = ReflectTest.class.getClassLoader();
        InputStream is = classLoader.getResourceAsStream("pro.properties");
        pro.load(is);

        //2.获取配置文件中定义的数据
        String className = pro.getProperty("className");
        String methodName = pro.getProperty("methodName");


        //3.加载该类进内存
        Class cls = Class.forName(className);
        //4.创建对象
        Object obj = cls.newInstance();
        //5.获取方法对象
        Method method = cls.getMethod(methodName);
        //6.执行方法
        method.invoke(obj);


    }
~~~

配置文件：

~~~java
className=cn.itcast.domain.Student
methodName=sleep
~~~



# 三、注解 Annotation

* 概念： 说明程序的，是给计算机看的
* 注释：用文字描述程序，是给程序员看的
* 定义：注解（Annotation），也叫元数据。一种代码级别的说明。它可以声明在包、类、字段、方法、局部变量、方法参数等的前面，用来对这些元素进行说明，注释。
* @注解名称

## 3.1 作用

1. 编写文档：通过注解生成doc文档 在命令行使用javadoc命令
2. 代码分析：通过代码里标识的注解对代码进行分析，反射
3. 编译检查：比如@Override

## 3.2 JDK预定义的注解

* @Override	     检测该方法是否是继承自父类（接口）
* @Deprecated    该注解标示的内容，表示已过时
* @SuppressWarnings("all")   压制警告 一般传递参数all 

~~~java
@SuppressWarnings("all")
public class Test{
	@Override
	public String toString(){
			return super.toString;
	}
	
	@Deprecated
	public void showOld(){
	
	}
	
	public void showNow(){
	
	}
}
~~~

## 3.3 自定义注解

格式：

	* 元注解
	`public @interface 注解名称{}`
 * 本质：注解的本质是一个接口，默认继承Annotation接口
 * 属性：接口中可以定义的抽象方法
  * 不允许void返回值
  * 基本数据类型
  * String
  * 枚举
  * 注解
  * 以上返回值的数组
* 定义了属性，需要在使用时给属性赋值
  * 如果定义属性时，使用default关键字给默认属性赋值，则不需要使用时赋值。
  *  如果只有一个属性需要赋值，且属性名为value，则value可以省略，直接定义值即可。
  * 数组赋值时，使用{}。若只有一个值时，则可以省略。

## 3.4 元注解

* 用于描述注解的注解

* `@Target`：描述注解能够作用的位置

  * TYPE：可以作用在类上
  * METHOD：可以作用在方法上
  * FIELD：可以作用在成员变量上

  ~~~java
  @Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})
  @Retention(RetentionPolicy.RUNTIME)
  @Documented
  @Inherited
  public @interface MyAnno3 {
  }
  ~~~

* `@Retention`：描述注解被保留的阶段

  * `@Retention(RetentionPolicy.RUNTIME)`表示当前被注释的注解，会保留到class字节码中，并被JVM读取到。

* `@Decumented`：描述注解是否被抽取到API文档中

* `@Inherited`：描述注解是否被子类继承



