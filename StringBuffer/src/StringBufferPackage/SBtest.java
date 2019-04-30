package StringBufferPackage;

public class SBtest {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		StringBuffer s=new StringBuffer("swati");
		System.out.println(s);
		System.out.println(sb.capacity());
		
		sb.append("abcdefghijklmnopqrst");
		sb.append("uvwxyz");
		sb.append("abcdefghij");
		sb.append("uddhavswati");
		sb.append("lmnopqrstuvwxyhazmncgjkfdfhjkdhkhgkjhgkjhfjghfjhbgtugonvyvnrtuiwuevtttjdd");
		System.out.print(sb.capacity());
		// TODO Auto-generated method stub

	}

}
