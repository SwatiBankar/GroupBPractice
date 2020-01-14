import org.testng.annotations.Test;

public class DataProviderDemo {
	
	@Test(dataProvider="booksInfo",dataProviderClass=DataProvider.class)
	public void m1(String bookname,String authore)
	{
		System.out.println("Book Name:"+bookname+"\t author"+authore);
	}
	
    @DataProvider(name="booksInfo")
    public Object[][] booksDataProvider()
    {
    	Object[][] booksInfo={{"c++","aa"},{"java","bb"},{"c#","cc"}};
    	return booksInfo;
    }
    
	
}




	


