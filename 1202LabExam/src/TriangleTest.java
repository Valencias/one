import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;


public class TriangleTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	public void testTriangle() throws Exception {
		Triangle t=new Triangle(1,2,3);
		assertEquals(t.isTriangle(t.sideA, t.sideB, t.sideC),true);
	}

	@Test
	public void testIsTriangle() {
		fail("Not yet implemented");
	}

	@Test
	public void testIsEquilatTriangle() throws Exception {
		Triangle t=new Triangle(1,2,3);
		assertEquals(t.isEquilatTriangle(),false);
	}

	@Test
	public void testIsIsocelesTriangle() throws Exception {
		Triangle t=new Triangle(1,2,3);
		assertEquals(t.isIsocelesTriangle(),false);
	}

	@Test
	public void testIsScaleneTriangle() throws Exception {
		Triangle t=new Triangle(1,2,3);
		assertEquals(t.isScaleneTriangle(),true);	}

}
