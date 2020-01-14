package ReflactionPackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Scanner;

public class ReflactionDemo {

	public static void main(String[] args)throws IllegalAccessException,IllegalArgumentException,InvocationTargetException
	{
		// TODO Auto-generated method stub
		Class c=TestClass.class;
		Method[] allMethods=c.getDeclaredMethods();
        System.out.println("Entered the method to execute:");
        Scanner sc=new Scanner(System.in);
        String m=sc.next();
        for(Method method:allMethods)
        {
        	if(m.equals(method.getName()))
        	
        		method.invoke(new TestClass());
        }
        	
        
	}

}
