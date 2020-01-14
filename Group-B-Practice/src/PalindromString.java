
public class PalindromString {

	public static void main(String[] args) {
				String a="NITIN";
				String b="";
				for(int i=a.length()-1;i>=0;i--){
					b=b+a.charAt(i);
					
				}
			if(a.equalsIgnoreCase(b))
			{
				System.out.println("String is palindrom");
			}
			else
			{
				System.out.println("not a palindrom");
			}

	}

}
