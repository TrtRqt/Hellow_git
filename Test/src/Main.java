import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// �ϥ�HashMap �L�k�̷�put���ǱƦC�A �L�|�ϥ�Hash Table�ƦC�C
		// �p�G�n�� map �i�H�̷� put ���ǱƦC�A�N�n�ϥ�LinkedHashMap�C
		Map<String, String> map = new LinkedHashMap<>();

		map.put("justin", "justin's message!!");
		map.put("momor", "momor's message!!");
		map.put("caterpillar", "caterpillar's message!!");

		
		
		for (String m : map.values()) {
			System.out.println(m);
		}			
		
//		//Collection(���X)�O�x�Ϊ�����x�s��k
//		//�ϥ� Collection �i�H�i���Ƥ��Ƨ�
//		Collection collection = map.values();
//		Iterator iterator = collection.iterator();
//		while (iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
	}
}
