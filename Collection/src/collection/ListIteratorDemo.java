package collection;

import java.util.ArrayList;
import java.util.ListIterator;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class ListIteratorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		al.add("swati");
		al.add("swapna");
		al.add("vasu");
		al.add("sonali");
		al.add("kalyani");
	System.out.println(al);
	ListIterator itr=al.listIterator();
	
	while(itr.hasNext())
	{
		String s=(String)itr.next();
		if(s.equals("swati"))
		{
		itr.add	("riya");
		}
		else if(s.equals("vasu"))
		{
			itr.remove();
		}
		else if(s.equals("kalyani"))
		{
			itr.set("kaustubh");
			
		}
		else if(s.equals("sonali"))
		{
			itr.hashCode();
		}
	}
	
	System.out.println(al);

	}

}
