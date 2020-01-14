package collection;

import java.util.HashMap;
import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs=new HashSet();
		hs.add("swati");
		hs.add("uddhav");
		hs.add("dipu");
		hs.add("bankar");
		hs.add(null);
		hs.add(null);
		hs.add("dipu");
		hs.add(8);
		System.out.println(hs);
		System.out.println(hs.add("swati"));
		
	}

}
