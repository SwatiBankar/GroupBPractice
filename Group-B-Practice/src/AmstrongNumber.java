import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		
		int number,reminder,temp,count=0,sum=0;
		
		System.out.print("Entere the amstrong number");
		
		
		for(int i=153;i<=1000;i++)
		{
			number=i;
			while(number>0)
			{
				reminder=number%10;
				sum=sum+(reminder*reminder*reminder);
				number=number/10;
			}
			if(sum==i)
			{
				System.out.print(i+" ");
			}
			sum=0;
		}
			

	}

}
