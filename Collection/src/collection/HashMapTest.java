package collection;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer,String> map=new HashMap<Integer,String>();
		map.put(101,"swati");
		map.put(102,"swapna");
		map.put(103,"vasundhara" );
		map.put(104, "kalyani");
		map.put(105, "sonali");
		System.out.println(map);
		map.remove(105);
		System.out.print(map);
	}

}
