
public class StarProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1;

		for (int i = 0; i <= 4; i++) {
			for (int space = 4; space >= i; space--) {
				System.out.print(" ");
			}

			for (int j = i; j >= 0; j--)

			{
				System.out.print(j);

			}
			for(int m=1;m<=i;m++)
			{
				{
					
				      System.out.print(m);
					
				}
			}
			System.out.println();

		}

	}
}
