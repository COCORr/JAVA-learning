import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
 已知userMap，存入用户信息，key为用户编号，value为用户名称。
 输入用户编号，已在userMap中，提示：输入新用户名称，来替换原来名称。
 输入用户编号，不存在userMap中，提示：输入用户名称，将用户编号和用户名称，增加到HashMap中。
 最后，将userMap输出，请补全代码。
 例如：输入：1 小号
 输出：
输入用户编号
输入新用户名称
用户编号=1,用户名称=小号
用户编号=2,用户名称=小明
用户编号=3,用户名称=小张
用户编号=4,用户名称=小王
*/
public class Example2 {
  
	public static void main(String[] args) {
		Map<Integer, String> userMap = new HashMap<>(); 
		userMap.put(1, "小田");
		userMap.put(2, "小明");
		userMap.put(3, "小张");
		userMap.put(4, "小王"); 
		
		Scanner sc = new Scanner(System.in);
		System.out.println("输入用户编号");
		int userId = sc.nextInt();

		if (userMap.containsKey(userId)) {
			System.out.println("输入新用户名称");
			String userName = sc.next();		 

          	userMap.put(userId,userName);
          
		} else {
			System.out.println("输入用户名称");
			
			String userName = sc.next();


          	userMap.put(userId,userName);
		}

		Set<Integer> set = userMap.keySet();
		for (Integer id : set) {
			System.out.println("用户编号="+id+",用户名称="+userMap.get(id));
		}

	}
}
