import java.util.ArrayList;

public class Iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list=new ArrayList<String>();
		list.add("swati");
		list.add("pacharne");
		list.add("banakar");
		
		System.out.println(list);
		java.util.Iterator<String> itr=list.iterator();
		
       while(itr.hasNext())
       {
    	   System.out.print(itr.next()+" ");
       }
	}

}
