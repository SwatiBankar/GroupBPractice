//Assignment of group-A
public class StarNew1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

char ch='a';
int i;
int num=1;
   for( i=0;i<=4;i++)
   {
	   for(int space=4;space>=i-1;space--)
	   {
		   System.out.print(" ");
	   }
    
   for(int j=0;j<=i+1;j++)
   {
	   if(i==0)
	   {
	      System.out.print(" "+"*"+" ");
	      break;
       }
	   if(i==1)
	   {
		   System.out.print(ch+" ");
		   ch++;
	   }
	   else if(i==2)
	   {
		   System.out.print(num+" ");
		   num++;
		   
	   }
	  
	   
   }
   
   System.out.println();
   }
	}
}




   
		   
		   
	

	



