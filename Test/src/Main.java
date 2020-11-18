import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// 使用HashMap 無法依照put順序排列， 他會使用Hash Table排列。
		// 如果要讓 map 可以依照 put 順序排列，就要使用LinkedHashMap。
		Map<String, String> map = new LinkedHashMap<>();

		map.put("justin", "justin's message!!");
		map.put("momor", "momor's message!!");
		map.put("caterpillar", "caterpillar's message!!");

		
		
		for (String m : map.values()) {
			System.out.println(m);
		}			
		
//		//Collection(集合)是泛用的資料儲存方法
//		//使用 Collection 可以進行資料比對排序
//		Collection collection = map.values();
//		Iterator iterator = collection.iterator();
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
	}
}
