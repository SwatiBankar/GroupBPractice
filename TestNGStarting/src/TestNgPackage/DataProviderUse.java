package TestNgPackage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import CustomPackage.InvalidUserPassException;

public class DataProviderUse {
	@Test(dataProvider="loginDataProvidwer")
	public void m1(String name,String pass) throws InvalidUserPassException
	{
		if(name.contains("user")&&pass.contains("pass"))
		{
		System.out.println(name+"\t"+pass);
		}
		else
		{
			throw new InvalidUserPassException();
		}
	}
	@DataProvider(name="loginDataProvidwer")
	public Object[][] loginData()
	{
	 Object[][] values={{"user1","pass1"},{"user2","pass2"},{"user3","pass3"},{"swati B","swati P"}};
		return values;
		
	}

}
