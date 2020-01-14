

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4jPropertiesFileConfigueExample {
	
	 public static void main(String[] args)
	 
	 {
		 Logger logger=Logger.getLogger("Log4jPropertiesFileConfigueExample");
		 PropertyConfigurator.configure("Log4j.properties");
		 logger.info("log4j Appender configuration is succesful");
	 }

}
