import java.util.Scanner;

public class ExceptionDemo{

	String uname="SwatiBankar";
	String Pass="swatibankar88";
	
	
	public boolean checkException(String Username,String password)
	{
		return(Username.equals(uname)&& password.equals(Pass));
	}
public void addUser() throws nosuchUserExceptin// throws nosuchUserExceptin
 {
	Scanner sc=new Scanner(System.in);
	int count=0;
    while(true)
       {
		
	System.out.print("Enter the username and password");
	
    String Name=sc.nextLine();
    String Pwd=sc.nextLine();
 
	
	if(checkException(Name,Pwd))
	{
			
		
		System.out.println("welcome"+Name+"now you can use your account");
		
		break;
		}
	else
	{
		count++;
		
	if(count>=2)
	{
		
		throw new  nosuchUserExceptin();
	}
	
	else
	{
		System.out.print("please try again");
	}
	
}
  }
 }

	
	public static void main(String[] args) throws nosuchUserExceptin
	{
	 ExceptionDemo e=new ExceptionDemo();
	 e.addUser();
		
	}
}

	
	


