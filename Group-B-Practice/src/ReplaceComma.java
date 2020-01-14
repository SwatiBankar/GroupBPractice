
public class ReplaceComma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] NameOfStudent={"Uddhav","Vishal","varun","kunal"};
		String name="";
		for(int i=0;i<NameOfStudent.length;i++)
		{
			name += NameOfStudent[i]+",  ";
			
		}
		System.out.println(name.trim());
		System.out.println(name.replaceAll(",  $", ""));

	}
	

}
