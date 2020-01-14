package ArrayPrograms;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=30;
		int count=0;
		//System.out.println(n);
		for(int i=2;i<=n;i++)
		{
			//System.out.println(i);
			//int count=0;
			for(int j=2;j<=i-1;j++)
			{
				if(i%j == 0)
				{
					count++;
				}
			}
		
			 if(count==0)
			{
				System.out.println(i);
				//count=0;
				//System.out.println(count);
			}
			 count = 0;
		}

	}
}
