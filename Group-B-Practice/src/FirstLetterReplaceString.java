
public class FirstLetterReplaceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="i like testing shastra";
		String NewString="";
		
		for(String S1:s.split(" "))
		{
			
			NewString+=toLowerCase(S1)+" ";
		}
		System.out.print(NewString);
		
	}	

	

	public static String toLowerCase(String s1) 
	{
		// TODO Auto-generated method stub
		char[] ch =s1.toCharArray();
		int ASCII=(int)ch[0];
		if(ASCII>=97 && ASCII<=122)
		{
			ch[0]=(char)(ASCII-32);
			
		}
		return new String(ch);
		
	}

	
	}




		

			
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			