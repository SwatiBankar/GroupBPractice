//hangout Assignment
public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1;
		
		
		for(int i=1;i<=5;i++)
		{
			char ch='B';
			
			for(int j=1;j<=i;j++)
			{
				if(i%2==0)
				{
					System.out.print(num+" ");
						
				}
				else
				{
					
					System.out.print(ch+" ");
					ch++;
				}
				
				
				
			}
			System.out.println();
			num++;
			
			
			
		
		}
		
	}
	

}
