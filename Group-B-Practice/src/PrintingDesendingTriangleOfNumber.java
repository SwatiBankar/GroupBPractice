
public class PrintingDesendingTriangleOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num=10;
		for(int i=1;i<=4;i++)
		{
			for(int j=i-1;j<=4;j++)
			{
				System.out.print(num +" ");
				num--;
			}
			System.out.println();

		}

	}

}
