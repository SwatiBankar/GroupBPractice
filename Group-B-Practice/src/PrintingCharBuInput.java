import java.util.Scanner;

public class PrintingCharBuInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number");
      int name=sc.nextInt();
      for(int i=0;i<=name;i++)
      {
    	  System.out.print((char)+(65+i));
      }
	}

}
