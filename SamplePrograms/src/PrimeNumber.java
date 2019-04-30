
import java.util.Scanner;
public class PrimeNumber {
	Scanner scan =new Scanner(System.in);
	int i=scan.nextInt();
	

	public static void main(String[] args) {
 
		int i;
		int temp=0;
		for( i=0;i<30;i++)
		{
			if(i%2==0)
			{
				//System.out.print("number is not a prime no<<");
				temp=temp+1;
						
			}
			
		}
		if(temp==0)
		{
			System.out.println("number is prime no<<");
		}
		
		// TODO Auto-generated method stub
	}

}
