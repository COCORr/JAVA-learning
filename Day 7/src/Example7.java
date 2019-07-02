import java.util.Scanner;

 interface Advertisement { //接口
      public void showAdvertisement(Scanner scanner);
      public String getCorpName(Scanner scanner);
}
 class AdvertisementBoard { //负责创建广告牌
       public void show(Advertisement adver,Scanner scanner) {
           System.out.println(adver.getCorpName(scanner)+"的广告词如下:");
           /* TODO: 接口回调,显示广告词 */
          adver.showAdvertisement(scanner);
            
       }
    }
 /* TODO: 实现接口 */
class BlackLandCorp implements Advertisement{
    private String corpName;
    private String advertisement;
    public void showAdvertisement(Scanner scanner){
        System.out.println("请输入广告公司的广告词：");
        advertisement=  scanner.next();
        if(advertisement.contains("劳动是爹"))
            advertisement="劳动是爹\\n土地是妈\\n";
        System.out.println("广告词："+advertisement);
    }
    public String getCorpName(Scanner scanner) {
        System.out.println("请输入广告公司名：");
        corpName = scanner.next();

        return corpName ;
    }
}
/* TODO: 实现接口 */
class WhiteCloudCorp implements Advertisement {
    private String corpName;
    private String advertisement;
    public void showAdvertisement(Scanner scanner){
        System.out.println("请输入广告公司的广告词：");
        advertisement=  scanner.next();
        if(advertisement.contains("劳动是爹"))
            advertisement="劳动是爹\\n土地是妈\\n";

        System.out.println("广告词："+advertisement);
    }
    public String getCorpName(Scanner scanner) {
        System.out.println("请输入广告公司名：");
        corpName = scanner.next();
        return corpName;
    }
}
/*
* 俩个广告公司类实现同一个接口中的相同方法，一个负责创建广告牌类，
* 其方法参数传入广告公司类。利用多态性质，对输入的字符串打印输入。
*/
public class Example7 {
   public static void main(String args[]) {
      AdvertisementBoard board = new AdvertisementBoard();
      Scanner scanner = new Scanner(System.in);
        // 调用BlackLandCorp类的showAdvertisement
        BlackLandCorp b=new BlackLandCorp();
        board.show(b/* TODO: 参数 */,scanner);
        // 调用BlackLandCorp类的showAdvertisement
        WhiteCloudCorp c=new WhiteCloudCorp();
        board.show(c/* TODO: 参数 */,scanner);
   }
}

