


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;



public class Log4jDemo {
	public  static Logger logger=Logger.getLogger(Log4jDemo.class);

	public static void main(String[] args) {
		
		PropertyConfigurator.configure("Log4j.properties");
		
		System.out.println("\n Hello world..!\n");
		logger.info("This is information message");
		logger.error("This is an error message");
		logger.warn("This is warning message");
		logger.fatal("This is a fetal message");
		System.out.println("\n Completed");
	

	}

}
