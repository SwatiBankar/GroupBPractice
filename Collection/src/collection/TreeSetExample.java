package collection;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> hashSet=new HashSet<String>();
		hashSet.add("swati");
		hashSet.add("swapna");
		hashSet.add("swati");
		hashSet.add("uddhav");
		
		System.out.println("set output without duplicate:");
		System.out.println(hashSet);
		
		System.out.println("After parsing into Tree set:");
		
		Set<String> treeSet=new TreeSet<String>(hashSet);
		
		System.out.println(treeSet);
		
		
		
		
		

	}

}
