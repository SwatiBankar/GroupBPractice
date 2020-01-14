import java.util.ArrayList;

public class ArrayListForPrintingName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("swati");
		list.add("swapna");
		list.add("sharayu");
		
		ArrayList<String> l2=new ArrayList<String>();
		l2.add("Uddhav");
		l2.add("Balu");
		l2.add("abhijeet");
		
		ArrayList<String> l3=new ArrayList<String>();
		l3.add("Pachrne");
		l3.add("Shinde");
		l3.add("Gaykwad");
		
		for(int i=0;i<list.size();i++)
		{
			System.out.print(list.get(i)+ " " + l2.get(i)+ " "+l3.get(i)+ " ");
			System.out.println();
		//System.out.print(list.get(i) + l2.get(i)+l3.get(i));	
		}
		

	}

}
