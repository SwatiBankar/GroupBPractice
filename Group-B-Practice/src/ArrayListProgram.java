import java.util.ArrayList;

public class ArrayListProgram {
	
		public static void main(String[] args) {
		ArrayList fname = new ArrayList();
		fname.add("Rohit");
		fname.add("Shashikant");
		fname.add("Avi");
		ArrayList mname = new ArrayList();
		mname.add("Raju");
		mname.add("Ram");
		mname.add("Vijay");
		ArrayList lname = new ArrayList();
		lname.add("Ashtange");
		lname.add("Kad");
		lname.add("Shelke");

		/*int j = 0, j2 = 0;
		for (int i = 0; i < fname.size(); i++) {
		System.out.print(" "+fname.get(i));
		for (; j < mname.size(); j++) {
		System.out.print(" "+mname.get(j));
		               
		for (; j2 < lname.size(); j2++) {
		System.out.print(" "+lname.get(j2));
		System.out.println("");
		break;
		}break;

		}j++ ;j2++;

		}

		}*/
		ArrayList al=new ArrayList();
		for (int i = 0; i < 3; i++) {
		al.add(fname.get(i)+" "+mname.get(i)+" "+lname.get(i));
		}
		System.out.println(al);


		}
		}

}
