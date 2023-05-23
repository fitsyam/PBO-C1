/**
 *Penulis : Fitra Syamli Y 17/05/2023
 * File : MapTest.java
 * Deskripsi : program yang menggunakan Gneric untuk pasangan kunci-nilai
**/
import java.util.*;

public class MapTest {
	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap<Integer,String>();
		map.put(1, "satu");
		map.put(2, "dua");
		System.out.println(map.get(1));
		Set<Integer> ley = map.keySet();
	}
}