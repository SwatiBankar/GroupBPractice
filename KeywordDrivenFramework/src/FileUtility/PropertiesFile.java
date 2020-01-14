package FileUtility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import Keyword.constant;

public class PropertiesFile {
	private static final boolean FileNotFoundException = false;
	/**
	 * This method will open object repository.properties and will return value associated with key
	 * @param key
	 * @return value in form of {@code String}}
	 */
	public static String getProperty(String key)
	{
		String value=null;
		
			try{
				constant. fis = new FileInputStream("Input/ObjectRepository.properties");
	            constant. prop=new Properties();
				constant.prop.load(constant.fis);
	            value=constant.prop.getProperty(key);
			}catch(FileNotFoundException e){
			System.out.println("unable to open object repository");
		     e.printStackTrace();
			}catch(IOException e)
			{
				e.printStackTrace();
			}
		
		return value;
		
	}
	public static String getProperty(String key,String filePath)
	{
		String value=null;
		try {
			constant. fis=new FileInputStream(filePath);
			constant. prop=new Properties();
			constant.prop.load(constant.fis);
		}
			catch(FileNotFoundException e) {
				System.out.println("File"+filePath+"not found");
			} catch (IOException e) {
			 System.out.println("unable to load file"+filePath);
				e.printStackTrace();
			}
		
		return value;
		
	}
	public static String[] getLocator(String key)
	{
		String[] values=null;
		try {
			constant.fis=new FileInputStream("Input/ObjectRepository.properties");
			constant.prop=new Properties();
			constant.prop.load(constant.fis);
		    String part=constant.prop.getProperty(key);
		    values=part.split("##");
		    System.out.println("Locator Type :"+values[0]);
		    System.out.println("Locator value :"+values[1]);
		} catch (java.io.IOException e) {
			System.out.println("unable to open object repository");
			e.printStackTrace();
		}
		return values;
		
	}
	public static void main(String[] args)
	{
		getLocator("mobile_email");
	}

}
	
	
