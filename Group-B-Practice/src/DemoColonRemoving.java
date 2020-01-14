
public class DemoColonRemoving {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name={"swati","uddhav","pacharne"};
		String x="";
		for(int i=0;i<=name.length-1;i++)
		{
			x=x+name[i]+" , ";
		}
		//System.out.print(x);
		System.out.println(x.trim());
		System.out.println(x.replaceAll(", $", " "));
		//System.out.print(name.subString(name.length-1));
	}
}
