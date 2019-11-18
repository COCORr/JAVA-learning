# JAVA的线程详解

## 一、线程

### 1.1 线程实例及注意事项

~~~java
MyThread my = new MyThread();
my.start();//此时会运行run 需要在类内重写
~~~

- `public void getName()`方法可以获取当前进程的名字
- 新线程从Thread-0开始计数
- `Thread.currentThread()`方法返回当前正在执行的进程

### 1.2 Thread常用方法

- `public void setName()` 给线程取名
- 也可以通过代参数的构造方法给线程取名
- `public void sleep()`使线程睡眠，参数为毫秒，相当于计时器

### 1.3 Runnable接口 创建线程的第二种方式

- `Thread(Runnable target)`
- `Thread(Runnable target,String name)`
- 以上为Thread类的构造方法，可以避免单继承的局限性

具体实现步骤如下：

1. 创建一个Runnable接口的实现类
2. 在现实类中重写Runnable接口的run方法，设置线程任务
3. 创建一个Runnable接口的实现类对象
4. 创建Thread类对象，构造方法中传递Runnable接口的实现类对象
5. 调用Thread类中的start方法

~~~java
RunnableImp1 run = new RunnableImp1();
Thread t = new Thread(run);
t.start();
~~~

 ### 1.4 匿名内部类实现多线程的创建

匿名内部类----简化代码  

~~~java
public static void main(String[] args){
		new Thread(){
				@override
				public void run(){
						//pass
				}
		}.start();
		
		
		
		
		Runnable r = new Runnable(){
				@override
				public void run(){
						//pass
				}
		};
		new Thread(r).start()
		
}
~~~

# 二、线程安全

多线程对一个变量进行操作时容易出现问题

例如：三个线程卖电影票，同时卖出相同座位的票  

线程安全问题是不能产生的，当一个线程访问共享变量时，别的线程需要等待

## 2.1 同步代码块

~~~java
synchronized(锁对象){
		//可能会出行问题的代码块
}
~~~

1. 同步代码块中的锁对象，可以使用任意的对象
2. 但是必须保证多个线程使用的锁对象是用一个
3. 锁对象：把同步代码块锁住，只让一个线程在同步代码块中执行

 ## 2.2 静态同步方法

~~~java
public static synchronized void xxxx{
		//可能会出现问题的代码
}
~~~

方法必须是静态的，则方法中访问的变量也必须是静态的

静态方法不能使用this

静态方法的锁对象是.class文件对象（反射）

## 2.3 Lock锁

- `public void lock()`获取锁
- `public void unlock()`释放锁

# 三、线程的唤醒与等待

- `void wait()`在其他线程调用notify()或notifyall()之前，线程保持等待状态
- `void notify()`唤醒等待的线程 
- `void wait(long l)`表示一定时间后会被唤醒
- `void notifyall()`唤醒所有在等待的线程