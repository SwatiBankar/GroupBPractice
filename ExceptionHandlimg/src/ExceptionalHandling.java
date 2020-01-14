import java.util.Scanner;

public class ExceptionalHandling {
	
	
	String UserName="SwatiBankar";
	String Password="swatibankar88";
	
	
	public boolean addUser(String Uname,String Pwd)
	{
		return Uname.equals(UserName)&& Pwd.equals(Password);
	}
	public void findException() throws NoSuchException  
	{
		
	
		Scanner sc=new Scanner(System.in);
		int count=0;
		
       while(true)
      {
	 
	      System.out.print("Enter valid username and password");
	      String Name=sc.nextLine();
	      String Pass=sc.nextLine();
	
if(addUser(Name,Pass))
    {
	System.out.print("welcome"+ Name+"you can use your account");
	break;
    }

else
{
	count++;
if(count>=2)
   {
	throw new NoSuchException();
   }


  
	System.out.print("please try again");
   }

   }
	}


	


	public static void main(String[] args) throws NoSuchException  {
		// TODO Auto-generated method stub
		ExceptionalHandling a=new ExceptionalHandling();
		a.findException();
		

	
	
		
	
		
	}

}