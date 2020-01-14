
public class FirstLetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="I Love You";
		String[] ch=s.split(" ");
		for(String name1:ch)
		{
		s=name1.substring( 0,1).toUpperCase()+name1.substring(1).toLowerCase()+" ";
        System.out.print(s);
		}
	}
	

}
