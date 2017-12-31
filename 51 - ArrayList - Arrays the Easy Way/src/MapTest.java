import java.util.*;

public class MapTest {

	public static void main(String[] args) {
		Map m = new HashMap();
		m.put(1, "asd");
		m.put(3, "wwsd");
		m.put(2, "aswwwd");
		System.out.println(m);

		Set s = m.keySet();
		for (Object o : s) {
			String value = (String) m.get(o);
			System.out.println("Key=" + o + "  Values=" + value);
		}
	}

}
