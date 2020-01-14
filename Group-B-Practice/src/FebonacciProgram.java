import java.util.Scanner;

public class FebonacciProgram {

	public static void main(String[] args) {
		int n,a=0,b=0,c=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n");
		n=sc.nextInt();
		System.out.println("febonacci number");
		
		for(int i=0;i<n;i++)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.println(a+" ");
		}

	}

}
