package example;

import static org.junit.Assert.*;

import org.junit.Test;

public class TriangleTest {
	@Test
	public void valiTriangleShouldHavePositiveside() {
		assertTrue(new Triangle(2,4,5).isValid());
		assertFalse(new Triangle(-2,4,5).isValid());
		assertFalse(new Triangle(-1,-1,-1).isValid());
		assertFalse(new Triangle(1,1,0).isValid());
		assertFalse(new Triangle(0,0,0).isValid());
		}
	@Test
	public void validTriangleshouldhaveSTGTOS() {
		assertTrue(new Triangle(2,4,5).isValid());
		assertFalse(new Triangle(1,1,3).isValid());
		assertFalse(new Triangle(7,1,2).isValid());
		assertFalse(new Triangle(2,1,6).isValid());
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
