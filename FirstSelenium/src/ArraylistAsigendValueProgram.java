import java.util.ArrayList;

public class ArraylistAsigendValueProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();
		al.add("MM");
		al.add("NN");
		
		ArrayList<String> L=new ArrayList<String>();
		L.add("101");
		L.add("102");
		
		for(int i=0;i<=al.size()-1;i++)
		{
			System.out.print(al.get(i) +"="+L.get(i));
			System.out.println();
		}
		

	}

}
