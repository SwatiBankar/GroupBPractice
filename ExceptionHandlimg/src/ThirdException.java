import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThirdException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("statement-1");
		try{
			System.out.println("statement-2");
			FileInputStream fis=new FileInputStream(" ");
			
		}catch(FileNotFoundException e)
		{
			System.out.print("statement 3");
		}catch(ArithmeticException e1){
			System.out.println("statement-4");
			try{
				int i=10/0;
			}catch (ArithmeticException e1)
			{
				System.out.println("statement-6");
			}
		}
		
		

	}

}
