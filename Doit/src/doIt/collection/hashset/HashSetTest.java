package doIt.collection.hashset;

import java.util.HashSet;

public class HashSetTest {
	public static void main(String[] args) {
		HashSet<String> hashSet = new HashSet<String>();
		hashSet.add(new String ("임정순"));
		hashSet.add(new String ("박제이"));
		hashSet.add(new String ("홍현희"));
		hashSet.add(new String ("강감찬"));
		hashSet.add(new String ("강감찬")); //Set은 중복값을 허용하지 않는다
		
		System.out.println(hashSet);
	}
}
