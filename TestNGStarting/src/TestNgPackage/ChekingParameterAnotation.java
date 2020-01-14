package TestNgPackage;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ChekingParameterAnotation {
	@Parameters({"unic-value"})
	@Test
	public void ckeckingParameter(@Optional("unic-value")String param)
	{
		System.out.println("This is value of param variable: "+param);
	}

}
