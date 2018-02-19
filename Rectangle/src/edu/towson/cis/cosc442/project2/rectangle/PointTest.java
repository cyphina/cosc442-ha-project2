/**
 * 
 */
package edu.towson.cis.cosc442.project2.rectangle;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Cyphina
 *
 */
public class PointTest {

	Point point;
	
	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		point = new Point(5.0,6.0);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link edu.towson.cis.cosc442.project2.rectangle.Point#Point(java.lang.Double, java.lang.Double)}.
	 */
	@Test
	public void testPoint() {
		assertEquals(point.x, 5.0,0.001);
		assertEquals(point.y, 6.0,0.001);
	}

}
