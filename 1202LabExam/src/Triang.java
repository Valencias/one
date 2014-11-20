import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;


public class Triang {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@Test
	public void testTriangle() throws Exception {
		Triangle t=new Triangle(1,2,3);
		assertEquals(t.isTriangle(t.sideA, t.sideB, t.sideC),true);
	}
	

}
