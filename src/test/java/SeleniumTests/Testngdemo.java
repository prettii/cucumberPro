package SeleniumTests;

import org.testng.annotations.Test;

public class Testngdemo {
	
	@Test (priority=1)
	public void order1()
	{
		System.out.println("order 1");
		
	}
	
	
	@Test (priority=0)
	public void order0()
	{
		System.out.println("order 0");
		
	}
	
	@Test (priority=-1)
	public void minus1()
	{
		System.out.println("minus 1");
		
	}

}
