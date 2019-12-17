# 一、数据库基本概念

* **DataBase DB**

* 用于存储和管理数据的仓库
* 特点：
  * 持久化存储数据
  * 方便管理数据 
  * 使用统一的方式操作数据库
* 常见数据库软件：
  * Oracle
  * MySQL
  * SQL Server

# 二、MySQL

## 2.1 启动、关闭、登陆、退出

* 关闭：`net stop mysql`

* 启动：`net start mysql`

* 登陆：
  * `mysql -uxxxx -pxxxx`
  * `mysql -uxxxx -p` 密码不可见
  * `mysql -h127.0.0.1 -uxxxx -pxxxx` 远程登陆
  * `mysql --host=ip --user=xxxx --password=xxxx` 远程登陆的全称模式
* 退出：
  * `exit`
  * `quit`



## 2.2 目录结构

* 安装目录
  * 配置文件：my.ini
* 数据目录
  * 数据库
    * 表
      * 数据



# 三、SQL  结构化查询语言



* SQL语句可以单行多行书写，以 **; **结尾
* MySQL的SQL不区分大小写
* 注释：
  * 单行注释： -- 我是注释(--与注释间有空格)    #我是注释
  * 多行注释：/*		*/

## 3.1 SQL分类

* DDL(Data Definition Language)：数据定义语言
* DML(Data Manipulation Language)：数据操作语言
* DQL(Data Query Language)：数据查询语言
* DCL(Data Control Language)：数据控制语言

## 3.2 DDL：操纵数据库、表（CRUD）

### 3.2.1 Create

* `create database 数据库名称;` 创建数据库
* `create database if not exist 数据库名称;`  带if创建数据库
* `create database 数据库名称 character set GBK;`  指定字符集创建数据库 

### 3.2.2 Retrieve

* `show databases;` 查询所有数据库的名称
* `show create database 数据库名称` 查询某个数据库的字符集

### 3.2.3 Update

* `alter database 数据库名称 character set utf8;` 修改数据库字符集 

### 3.2.4 Delete

* `drop database 数据库名称;` 删除数据库
* `drop database if exists 数据库名称;`  删除存在的数据库

### 3.2.5 查询现在正在使用的数据库

* `select database();`

* `use 数据库名称;` 使用数据库

## 3.3 DML：操纵表（CRUD）

### 3.3.1 Create

* 创建表

* `          create table student(
  			id int,
    			name varchar(32),
    			age int ,
    			score double(4,1),
    			birthday date,
    			insert_time timestamp
    		);`	

  `语法：
  			create table 表名(
  				列名1 数据类型1,
  				列名2 数据类型2,
  				....
  				列名n 数据类型n
  			);`	

* 数据库类型

  * int：整数类型
  * double:小数类型
    * score double(5,2)
  * date:日期，只包含年月日，yyyy-MM-dd
  * datetime:日期，包含年月日时分秒	 yyyy-MM-dd HH:mm:ss
  * timestamp:时间戳类型	包含年月日时分秒	 yyyy-MM-dd HH:mm:ss
    * 如果不赋值，会默认当前系统时间
  *  varchar：字符串
    * name varchar(20):姓名最大20个字符

* `create table 表名 like 表名; `复制表

### 3.3.2 Retrieve

* `show tables;` 查询某个数据库中所有的表名称 
* `desc 表名称;` 查询表结构

### 3.3.3 Update

* `alter table 表名 rename to 新的表名;` 修改表名
* `alter table 表名 character set 字符集名称;` 修改字符集
* `alter table 表名 add 列名 数据类型;` 添加一列
* `alter table 表名 change 列名 新列别 新数据类型;` 修改列名称、数据类型
* `alter table 表名 modify 列名 新数据类型;` 修改列数据类型
* `alter table 表名 drop 列名;` 删除列

### 3.3.4 Delete

* `drop table 表名;`  删除表
* `drop table if exists 表名;` 删除存在的表

## 3.4 DML 增删该表中数据

### 3.4.1 添加数据

* `insert into 表名(列名1,列名2,...列名n) values(值1,值2,...值n);`
  * 列名和值一一对应
  * 如果表名后，不定义列名，则默认给所有列添加值
    			insert into 表名 values(值1,值2,...值n);
  * 除了数字类型，其他类型需要使用引号引起来

### 3.4.2 删除数据

* ` delete from 表名 [where 条件]`
  * 不加条件，删除所有记录
  * 删除所有记录 `TRUNCATE TABLE` 删除表再重新建表   会快很多！！

### 3.4.3 修改数据

* `update 表名 set 列名1 = 值1, 列名2 = 值2,... [where 条件];`
  * 如果不加任何条件，会将表中的所有记录修改！

## 3.5 DQL 查询

### 3.5.1 语法

​	select
​		字段列表
​	from
​		表名列表
​	where
​		条件列表
​	group by
​		分组字段
​	having
​		分组之后的条件
​	order by
​		排序
​	limit
​		分页限定

### 3.5.2 基础

1. 多个字段的查询
	select 字段名1，字段名2... from 表名；
	* 注意：
		* 如果查询所有字段，则可以使用*来替代字段列表。
2. 去除重复：
	* distinct 需要所有字段都一样
3. 计算列
	* 一般可以使用四则运算计算一些列的值。（一般只会进行数值型的计算）
	* ifnull(表达式1,表达式2)：null参与的运算，计算结果都为null
		* 表达式1：哪个字段需要判断是否为null
		* 如果该字段为null后的替换值。
4. 起别名：
	* as：as也可以省略

### 3.5.3 条件

1. where子句后跟条件
	2. 运算符
		
		* ​	>、< 、<= 、>= 、= 、<>
		
		* BETWEEN...AND  
		
		* IN( 集合) 
		
		* LIKE：模糊查询
			* 占位符：
				* _:   单个任意字符
				* %：多个任意字符
			
		* IS NULL  

		* and  或 &&
		
		* or  或 || 
		
		* not  或 !
		
		* 示例：
		
			-- 查询年龄大于20岁
		
			SELECT * FROM student WHERE age > 20;
			
			SELECT * FROM student WHERE age >= 20;
			
			-- 查询年龄等于20岁
			SELECT * FROM student WHERE age = 20;
			
			-- 查询年龄不等于20岁
			SELECT * FROM student WHERE age != 20;
			SELECT * FROM student WHERE age <> 20;
			
			-- 查询年龄大于等于20 小于等于30
			
			SELECT * FROM student WHERE age >= 20 &&  age <=30;
			SELECT * FROM student WHERE age >= 20 AND  age <=30;
			SELECT * FROM student WHERE age BETWEEN 20 AND 30;
			
			-- 查询年龄22岁，18岁，25岁的信息
			SELECT * FROM student WHERE age = 22 OR age = 18 OR age = 25
			SELECT * FROM student WHERE age IN (22,18,25);
			
			-- 查询英语成绩为null
			SELECT * FROM student WHERE english = NULL; -- 不对的。null值不能使用 = （!=） 判断
			
			SELECT * FROM student WHERE english IS NULL;
			
			-- 查询英语成绩不为null
			SELECT * FROM student WHERE english  IS NOT NULL;
			
			-- 查询姓马的有哪些？ like
					SELECT * FROM student WHERE NAME LIKE '马%';
					-- 查询姓名第二个字是化的人
					SELECT * FROM student WHERE NAME LIKE "_化%";
			
			-- 查询姓名是3个字的人
			SELECT * FROM student WHERE NAME LIKE '___';

