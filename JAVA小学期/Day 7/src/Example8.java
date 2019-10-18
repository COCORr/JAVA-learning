import java.util.Scanner;
abstract class MotorVehicles {
   abstract void brake(String s);
}
interface MoneyFare {
   void charge(String c);
}
interface ControlTemperature {
   void controlAirTemperature(String t);
}
class Bus extends MotorVehicles implements MoneyFare { 
    void brake(String s) {
        System.out.println("公共汽车使用"+s+"刹车技术");
    }
    public void charge(String c) {
        System.out.println("公共汽车:"+c+"元/张,不计算公里数");
    }
} 
class Taxi extends MotorVehicles implements MoneyFare,ControlTemperature { 
    void brake(String s) {
        System.out.println("出租车使用"+s+"刹车技术");
    }
    public  void charge(String c) {
        System.out.println("出租车:"+c+"元/公里,起价3公里");
    }
    public void  controlAirTemperature(String t) { 
        System.out.println("出租车安装了"+t+"空调");
    }
}
class Cinema implements MoneyFare,ControlTemperature {
    public  void charge(String s) {
        System.out.println("电影院:门票,"+s+"元/张");
    }
    public void controlAirTemperature(String t) { 
       System.out.println("电影院安装了"+t+"空调");
    }
}
public class Example8 {
   public static void main(String args[]) {
	   Scanner scanner = new Scanner(System.in);
       Bus bus101 = new Bus();
       Taxi buleTaxi = new Taxi();
       Cinema redStarCinema = new Cinema();
       MoneyFare  fare;
       ControlTemperature temperature;
       fare = bus101;
       System.out.println("请输入公交车采用刹车技术和车票价（元）：");
       bus101.brake(scanner.next());
        bus101.charge(scanner.next());

        //公交车逻辑
        fare = buleTaxi;
        temperature = buleTaxi;
        System.out.println("请输入出租车采用刹车技术、车票价（元）、安装空调样式：");
        buleTaxi.brake(scanner.next());
        buleTaxi.charge(scanner.next());
        buleTaxi.controlAirTemperature(scanner.next());

        //出租车逻辑
        fare = redStarCinema;
        temperature = redStarCinema;
        System.out.println("请输入电影院票价（元）、安装空调样式：");
        redStarCinema.charge(scanner.next());
        redStarCinema.controlAirTemperature(scanner.next());
   }
}