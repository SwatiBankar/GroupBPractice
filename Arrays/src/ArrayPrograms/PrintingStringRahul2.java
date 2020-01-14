package ArrayPrograms;

public class PrintingStringRahul2 {
	
	public static void main(String[] args) {
		//static char [] ch={'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		    String s="abcdefghijklmnopqrstuvwxyz";
			  char [] ch=s.toCharArray();	
			 int i = 1;
		
		for(char output:ch)
		{
			System.out.println(ch[i]);
			i++;
	
		}
		
		
		if(ch[i]==s.charAt(17)||ch[i]==s.charAt(0)||ch[i]==s.charAt(7)||ch[i]==s.charAt(20)||ch[i]==s.charAt(11))
		{
			int sum=s.charAt(17)+s.charAt(0)+s.charAt(7)+s.charAt(20)+s.charAt(11);
		}
		else
		{
			System.out.println();
		}
	}

}	
	
		


