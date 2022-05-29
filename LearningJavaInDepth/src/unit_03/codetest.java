package unit_03;

import java.util.InputMismatchException;

public class codetest {
	
	public static void main(String[]args)
	{
//		try
//		{
//			int a=100;
//			int result=a/0;
//			System.out.println("result is :"+result);  
//		}
//		catch(InputMismatchException e)
//		{
//			System.out.println("something went wrong");
//		}
//		catch(Exception e )
//		{
//			System.out.println("exception");
//		}
		int a=100/0;
		
			if(a<10)
			{
				throw new InputMismatchException("abc");
				
			}
		
		//if exception bypasses compiler passes and break at run time is called runtime exception
		
//		System.out.println("try catch is finished");
		// finally always run
		//if there is no exception finally always run
		//if there is exception and it is catch finally will run
		//if there is exception but is not catch then also finally will run
		
//		finally
//		{
//			System.out.println("try catch is finished");
//		}
	}

}

