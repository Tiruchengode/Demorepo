package testngprojects.testngproject;

import org.testng.annotations.Test;

public class TestngFacebook {
	@Test
	public void setUp()
	{
		System.out.println(" Start Testing");
	}
	
	public void tearDown()
	{
		System.out.println("Testing End");
	}

}
