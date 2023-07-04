package Groups1;

import org.testng.annotations.Test;
@Test(groups= "includeTests")

public class Groups1 {
	@Test(groups = "sanity")
	public void test1()
	{
		System.out.println("hello world");
	}
	@Test(groups = {"sanity","smoke"})
	public void test2()
	{
		System.out.println("hello India");
	}
	@Test(groups = "smoke")
	public void test3()
	{
		System.out.println("hello bangalore");
	}
	

}
