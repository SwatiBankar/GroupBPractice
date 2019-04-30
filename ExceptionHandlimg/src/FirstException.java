
public class FirstException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		
		int i=10;
		int j=i%5;
		int result=0;
		try{
			result=10/j;
		}catch(ArithmeticException e)
		{
			j++;
			result=j/10;
		}

	}

}