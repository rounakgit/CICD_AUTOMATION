package helloworld;



import org.junit.Assert;
import org.junit.Test;


public class HelloworldTest {

	
	@Test
	public void test() {
		System.out.println("InsideJunit");
		//fail("Not yet implemented");
		//Assert.assertEquals("Ajan", "Ajn");
		Assert.assertEquals("Anjan", "Anjan");
	}

}
