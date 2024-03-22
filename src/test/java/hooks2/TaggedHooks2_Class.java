package hooks2;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TaggedHooks2_Class 
{
	@Before()
	public void beforescenario()
	{
		System.out.println("This will run before every Scenario");
	}
	
	@After()
	public void afterscenario()
	{
		System.out.println("This will run After every Scenario");
	}
	
	@Before
	public void beforefirst()
	{
		System.out.println("This will run before first step");
	}
	
	@After
	public void afterfirst()
	{
		System.out.println("This will run after first step");
	}
	
	@Before
	public void beforessecond()
	{
		System.out.println("This will run before second step");
	}
	
	@After
	public void aftersecond()
	{
		System.out.println("This will run after second step");
	}
	
	@Before
	public void beforesthird()
	{
		System.out.println("This will run before third step");
	}
	
	@After
	public void afterthird()
	{
		System.out.println("This will run after third step");
	}

}
