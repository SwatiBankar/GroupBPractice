//hangout Assignment
public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1;
		char ch='A';
    for(int i=0;i<=4;i++)
    {
    	for(int j=0;j<=i;j++)
    	{
    		if(i%2==0)
    		{
    			System.out.print(ch+" ");
    		}
    		else
    		{
    			System.out.print(num+" ");
    		}
    		
    		//ch++;
    		//num++;
    	}
    	System.out.println();
    	ch++;
    	num++;
    }
	
	}

}
