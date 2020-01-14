package collection;

import java.util.ArrayList;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ArrayListProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(10);
		java.util.Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			
		System.out.print(itr.next()+" ");
		}

	}

}
