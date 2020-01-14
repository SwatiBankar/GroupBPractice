
public class FirstLetterCapital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="i love uddhav";
		

		for(String name1:name.split(" "))
		{
			name=name1.substring(0,1).toUpperCase()+name1.substring(1).toLowerCase()+" ";
			
		    System.out.print(name);

	    }
	

    }
}
