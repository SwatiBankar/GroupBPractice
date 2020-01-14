
public class SortingStringNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="UddhavSwatiPacharne";
       char[] ch=s.toCharArray();
       String s1="";
       String s2="";
       //int i=0;
       int ASCII;
       for(int i=0;i<ch.length;i++)
       {
    	   ASCII=(int)ch[i];
    	   if(ASCII>=97 && ASCII<=122)
    	   {
    		   s1=s1+ch[i];
    	   }
       
        
    	   else if(ASCII>=65 && ASCII<=91)
    	   {
    		  
    		   s2=s2+ch[i];
    		  
    	   }
       }
       
       System.out.print(s1+s2);
	}
}


