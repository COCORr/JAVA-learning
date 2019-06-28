import java.util.*;

import javax.swing.text.View;



class Computer {
	String name;
	String brandString;
	String cpu;
	String memory;
	String hardDisk;
	String monitor;
	public Computer(String name,String brandString,String cpu,String memory,String hardDisk,String monitor) {
		this.brandString=brandString;
		this.cpu=cpu;
		this.hardDisk=hardDisk;
		this.memory=memory;
		this.monitor=monitor;
		this.name=name;
	}
	void show() {
		System.out.println(name+"\t"+brandString+"\t"+cpu+"\t"+memory+"\t"+hardDisk+"\t"+monitor);
	}
}
class Desktop extends Computer{
	String hosttype;
	public Desktop(String name,String brandString,String cpu,String memory,String hardDisk,String monitor,String hosttype) {
		super(name, brandString, cpu, memory, hardDisk, monitor);
		this.hosttype=hosttype;
	}
	void show() {
		System.out.println(name+"\t"+brandString+"\t"+cpu+"\t"+memory+"\t"+hardDisk+"\t"+monitor+"\t"+"\t"+hosttype);
	}
	void showll() {
		System.out.println(name+"\t"+brandString+"\t"+cpu+"\t"+memory+"\t"+hardDisk+"\t"+monitor+"\t"+hosttype);
	}
}
class Notebook extends Computer{
	String battery;
	public Notebook(String name,String brandString,String cpu,String memory,String hardDisk,String monitor,String battery) {
		super(name, brandString, cpu, memory, hardDisk, monitor);
		this.battery=battery;
	}
	void show() {
		System.out.println(name+"\t\t"+brandString+"\t"+cpu+"\t"+memory+"\t"+hardDisk+"\t"+monitor+"\t"+battery);
	}
}

public class rr {
	static int num=0;//记录当前电脑数量
	static Computer com[]=new Computer[50];
	static void init() {
		com[0]=new Notebook("T61", "IBM", "Intel酷睿2", "2GB", "160GB","14.1英寸", "6芯");
		com[1]=new Notebook("X60", "IBM", "Intel酷睿2", "512MB", "60GB","12.1英寸", "6芯");
		com[2]=new Desktop("530MT", "戴尔", "Intel酷睿2", "512GB", "80GB","19.1英寸", "卧式");
		com[3]=new Desktop("Lenovo5050", "联想", "AMD速龙64", "1GB", "160GB","22英寸", "立式");
		num=4;
	}
	
	
	static void start() {
		System.out.println("请用户选择操作： 1:查看电脑信息 2:增加电脑信息 3：删除电脑信息 4:退出");
		Scanner sc=new Scanner(System.in);
		int i;
		i=sc.nextInt();
		switch (i) {
		case 1:
			view();
			start();
			break;
		case 2:
			newcom();
			start();
			break;
		case 3:
			delete();
			start();
			break;
		case 4:
			System.out.println("感谢使用！");
			break;
		default:
			System.out.println("输入有误");
		}
		
	}
	public static void main(String[] args) {
		init();
		start();
	}
	static void newcom() {
		System.out.println("请选择电脑类型：1:笔记本 2:台式");
		int k=0;
		Scanner scanner=new Scanner(System.in);
		k=scanner.nextInt();
			System.out.println("请输入型号名称：");
			String name= scanner.next();
			System.out.println("请输入品牌名称：");
			String brandString= scanner.next();
			System.out.println("请输入CPU：");
			String cpu= scanner.next();
			System.out.println("请输入内存：");
			String memory= scanner.next();
			System.out.println("请输入硬盘：");
			String hardDisk= scanner.next();
			System.out.println("请输入显示器尺寸：");
			String monitor= scanner.next();	
		if(k==1) {
			System.out.println("请选择电池类型：1:6芯 2:9芯");
			int j=scanner.nextInt();
			if (j==1) {
				com[num]=new Notebook(name, brandString, cpu, memory, hardDisk, monitor, "6芯");
			}else {
				com[num]=new Notebook(name, brandString, cpu, memory, hardDisk, monitor, "9芯");
			}
			num++;
		}else {
			System.out.println("请选择机箱类型：1:柜式 2:立式");
			int j=scanner.nextInt();
			if (j==1) {
				com[num]=new Desktop(name, brandString, cpu, memory, hardDisk, monitor, "柜式");
			}else {
				com[num]=new Desktop(name, brandString, cpu, memory, hardDisk, monitor, "立式");
			}
			num++;
		}
		System.out.println("添加成功，当前电脑信息如下：");
		System.out.println("序号 型号名称\t品牌\tcpu\t\t内存\t硬盘\t显示器\t电池芯片\t机箱类型");
		for (int i = 0; i < num; i++) {
			System.out.print(i+1+"   ");
			com[i].show();	
		}
	}
	static void delete() {
		System.out.println("请输入待删除的序号：");
		Scanner sc =new Scanner(System.in);
		int i=0;
		i=sc.nextInt();
		if(i<=num) {
			com[i-1]=com[num-1];
			num--;
			System.out.println("删除成功！");
		}else {
			System.out.print("不存在，");
			delete();
		}
	}
	static void view() {
		System.out.println("序号 型号名称\t品牌\tcpu\t\t内存\t硬盘\t显示器\t电池芯片\t机箱类型");
		for (int i = 0; i < num; i++) {
			System.out.print(i+1+"   ");
			com[i].show();	
		}
		System.out.println("请用户输入所选型号：");
		int k=0;
		Scanner scanner=new Scanner(System.in);
		k=scanner.nextInt();
		System.out.println("序号 型号名称\t品牌\tcpu\t\t内存\t硬盘\t显示器\t电池芯片\t机箱类型");
		com[k-1].show();
	}
}
