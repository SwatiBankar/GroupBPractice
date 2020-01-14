
public class SepratingComaFromStringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name={"swati","swapna","kalyani","sonali","vasu"};
		String x ="";
	
		for(int i=0;i<name.length;i++)
		{
			x += name[i]+",  ";
			
			//System.out.print(name[i]+" ,");
				
		}
		System.out.println(x.trim());
		System.out.println(x.replaceAll(",  $", "  "));
		//System.out.println(name.subString(name.length-1));
	}
	
}

			
			
			 
			
				
			
		
		
		
	




