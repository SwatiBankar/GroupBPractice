package collection;

import java.util.ArrayList;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import javax.swing.text.html.HTMLDocument.Iterator;

public class ALProgramUsingIterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al=new ArrayList();
		for(int i=0;i<=10;i++)
		{
			al.add(i);
		}
		System.out.print(al);
	 System.out.println();
		java.util.Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			
			Integer I=(Integer)itr.next();
			{
				if(I%2==0)
				{
			
		           System.out.print(I+" ");
		        }
		
			}
			

      }
	}
}
	
