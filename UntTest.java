import org.testng.Assert;
import org.testng.annotations.Test;

/**
@ author Sukruthi Boruthalupula
 */

public class UnitTest extends StringSolution{

	@Test
	public void test()
	{
	String name = "sukruthi";
	char letter ='u';
	Character l ='u';
	
	String s1 = notInbuilt(name, letter);
	String s2 = Inbuilt(name,l);
	Assert.assertEquals(s1, s2);
	Assert.assertEquals(s1, "skrthi");
	Assert.assertEquals(s2, "skrthi");
	
	}
	
	
}
