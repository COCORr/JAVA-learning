 

# 一、DQL查询语句

## 1.1 排序查询

* order by 排序字段 排序方式, .......
* 默认排序方式为**升序** ASC
* DESC 降序排列
* 如果有多个排序条件，仅当第一条件一样时，才会考虑后续的条件 



## 1.2 聚合函数

* 将一列数据作为一个整体，进行纵向计算
  * count：计算个数
  * max
  * min
  * sum
  * avg
* 聚合函数的计算会排出null值
* 使用IFNULL函数



## 1.3 分组查询

* group by
  * 分组之后的查询字段：分组字段、聚合函数
* where和having的区别
  * where 在分组之前进行限定，如果不满足条件，则不参与分组
  * having 在分组之后进行判断，如果不满足条件，则不会被查询到
  * where 后不能跟聚合函数，但是having可以



## 1.4 分页查询

* limit 开始的索引，每页查询的条数;
* SELECT  * FROM student LIMIT 0,3;   第一页
* SELECT  * FROM student LIMIT 3,3;   第二页
* 开始的索引 = （当前的页码 - 1） * 每页显示的条数
* 该方法仅在MySQL中可以使用

# 二、 约束

1. 主键约束：primary key
2. 非空约束：not null
3. 唯一约束：unique
4. 外键约束：foreign key



## 2.1 非空约束

* 某一列的值不能为null

* 在创建表时添加约束

  * ~~~mysql
    CREATE TABLE stu(
    			id INT,
    			NAME VARCHAR(20) NOT NULL -- name为非空
    		);
    ~~~

* 创建表后，添加非空约束

  * ~~~mysql
    ALTER TABLE stu MODIFY NAME VARCHAR(20) NOT NULL;
    ~~~

* 创建表后 ，删除非空约束

  * ~~~mysql
    ALTER TABLE stu MODIFY NAME VARCHAR(20);
    ~~~

    

## 2.2 唯一约束

* 唯一约束可以有null值，但是只能有一条记录为null

* 删除唯一约束：

  * ~~~mysql
    ALTER TABLE stu DROP INDEX phone_number;
    ~~~



## 2.3 主键约束

* 非空且唯一

* 一张表只能有一个字段为主键

* 主键是表中记录的唯一标识

* 删除主键约束：

  * ~~~~mysql
    ALTER TABLE stu DROP PRIMARY KEY;
    ~~~~

    

## 2.4 自动增长

* 如果某一列是数值类型，可以使用auto_increment来完成值的自动增长

* ~~~mysql
  create table stu(
  	id int primary key auto_increment,-- 给id添加主键约束
  	name varchar(20)
  );
  ~~~



## 2.5 外键约束

* 是一种多表关系

* 创建：

  * ~~~mysql
    create table 表名(
    		....
    		外键列
    		constraint 外键名称 foreign key (外键列名称) references 主表名称(主表列名称)
    			);
    ~~~

    ~~~mysql
    ALTER TABLE 表名 ADD CONSTRAINT 外键名称 FOREIGN KEY (外键字段名称) REFERENCES 主表名称(主表列名称);
    ~~~

* 删除外键：

  * ~~~mysql
    ALTER TABLE 表名 DROP FOREIGN KEY 外键名称;
    ~~~



## 2.6 级联操作

* 创建：

  * ~~~mysql
    语法：ALTER TABLE 表名 ADD CONSTRAINT 外键名称 
    					FOREIGN KEY (外键字段名称) REFERENCES 主表名称(主表列名称) ON UPDATE CASCADE ON DELETE CASCADE  ;
    ~~~

* 级联更新：ON UPDATE CASCADE 
* 级联删除：ON DELETE CASCADE 



# 三、 范式

1. 第一范式（1NF）：每一列都是不可分割的原子数据项
2. 第二范式（2NF）：在1NF的基础上，非码属性必须完全依赖于码（在1NF基础上消除非主属性对主码的部分函数依赖）
   * 函数依赖：A-->B,如果通过A属性(属性组)的值，可以确定唯一B属性的值。则称B依赖于A
     					例如：学号-->姓名。  （学号，课程名称） --> 分数
   * 完全函数依赖：A-->B， 如果A是一个属性组，则B属性值得确定需要依赖于A属性组中所有的属性值。
     					例如：（学号，课程名称） --> 分数
   * 部分函数依赖：A-->B， 如果A是一个属性组，则B属性值得确定只需要依赖于A属性组中某一些值即可。
     					例如：（学号，课程名称） -- > 姓名
   * 传递函数依赖：A-->B, B -- >C . 如果通过A属性(属性组)的值，可以确定唯一B属性的值，在通过B属性（属性组）的值可以确定唯一C属性的值，则称 C 传递函数依赖于A
     					例如：学号-->系名，系名-->系主任
   * 码：如果在一张表中，一个属性或属性组，被其他所有属性所完全依赖，则称这个属性(属性组)为该表的码
3. 第三范式（3NF）：在2NF基础上，任何非主属性不依赖于其它非主属性（在2NF基础上消除传递依赖）



# 四、数据库的备份

* 备份： mysqldump -u用户名 -p密码 数据库名称 > 保存的路径
* 还原：
  1. 登录数据库
  	2. 创建数据库
  	3. 使用数据库
  	4. 执行source 文件路径









