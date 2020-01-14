package StringBufferPackage;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Testing";
		s.concat("Shastra");
		System.out.println(s);//immutable
		StringBuffer sb=new StringBuffer("Testing Shastra");
		s.concat("by avinash sir");
		System.out.println(sb);
		sb.append("Resonentia");
		System.out.println(sb);

	}

}
