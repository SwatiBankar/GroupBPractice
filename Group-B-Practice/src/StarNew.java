
//Assignment of group-C
import java.util.Scanner;
import java.util.*;

public class StarNew {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		System.out.println("Entered number is<<" + num);

		for (int i = 0; i <= num; i++) {
			for (int j = num; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

	}
}
