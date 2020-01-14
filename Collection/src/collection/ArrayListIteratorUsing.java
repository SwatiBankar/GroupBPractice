package collection;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayListIteratorUsing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		
		al.add("A");
		al.add("B");
		al.add("C");
		al.add("D");
		al.add("E");
		al.add("E");
		al.add(null);
		//iterator to traverse the list
		
		java.util.Iterator<String> itr=al.iterator();
		
		System.out.print("Arraylist elements<<:");
		
		while(itr.hasNext())
			System.out.print(itr.next()+" ");
	}
}

			

	


