package recursion.controller;

public class RecursionAppController
{
	
	
	public void start()
	{
		for(int i = 0; i < 200; i++)
		{
			long startTime = System.currentTimeMillis();
			
			System.out.println(i + " took " + (System.currentTimeMillis() - startTime) + " milliseconds: " + getFactorial(i));
		}
	}
	
	
	public double getFactorial(int spot)
	{
		if(spot == 0 || spot == 1)
		{
			return 1;
		}
		else
		{
			return spot * getFactorial(spot - 1);
		}
	}
	
	public int getFibonacci(int position)
	{
		if(position == 0 || position == 1)
		{
			return 1;
		}
		else
		{
			return getFibonacci(position - 1) + getFibonacci(position - 2);
		}
	}
}
