package testcases;

import org.testng.annotations.Test;

public class SetPriority {
	
	@Test(priority=1)
	
	public void atest1 ()
	{
		System.out.println("test1");
	}
@Test (priority=0,enabled = false)
	
	public void btest2 ()
	{
		System.out.println("test2");
	}
@Test(priority=2)

public void ctest3 ()
{
	System.out.println("test3");
}

}

