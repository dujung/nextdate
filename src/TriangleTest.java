import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import trianglepackage.Triangle;

/**
 * TriangleTest for testing the Triangle class.
 * This template is used in the exercise phase 1.
 * Students should add relevant unit test cases related to the Triangle 
 * class to this class.
 */
public class TriangleTest extends TestCase
{
	
	private Triangle eqiliteralTriangle;
	private Triangle aboveEqiliteralTriangle;
	private Triangle belowEqiliteralTriangle;
	private Triangle isoscelesTriangle;
	private Triangle aboveIsoscelesTriangle;
	private Triangle belowIsoscelesTriangle;
	private Triangle scaleneTriangle;
	private Triangle notScaleneTriangle;
	private Triangle rightAngledTriangle;
	private Triangle aboveRightAngledTriangle;
	private Triangle belowRightAngledTriangle;
	private Triangle impossibleLBTriangle;
	private Triangle notImpossibleALBTriangle;
	private Triangle impossibleUBTriangle;
	private Triangle notImpossibleBUBTriangle;
	

	/**
	 * Constructs a test case with the given name.
	 */
	public TriangleTest(String name)
	{
		super(name);
	}

	/** 
	 * Initializes common objects. The JUnit framework automatically invokes 
	 * this method before each test is run.
	 */
	protected void setUp()
	{
		eqiliteralTriangle = new Triangle(200,200,200);
		aboveEqiliteralTriangle = new Triangle(201,200,200);
		belowEqiliteralTriangle = new Triangle(199,200,200);
		isoscelesTriangle = new Triangle(300,300,200);
		aboveIsoscelesTriangle = new Triangle(300,200,201);
		belowIsoscelesTriangle = new Triangle(300,200,199);
		scaleneTriangle = new Triangle(199,200,201);
		notScaleneTriangle = new Triangle(200,200,201);
		rightAngledTriangle = new Triangle(300,400,500);
		aboveRightAngledTriangle = new Triangle(300,400,499);
		belowRightAngledTriangle = new Triangle(300,400,501);
		impossibleLBTriangle = new Triangle(0,200,200);
		notImpossibleALBTriangle = new Triangle(1,200,200);
		impossibleUBTriangle = new Triangle(300,400,700);
		notImpossibleBUBTriangle = new Triangle(300,400,699);
		
	}

	/**
	 * Cleanup method. The JUnit framework automatically invokes
	 * this method after each test is run.
	 */
	protected void tearDown()
	{
		rightAngledTriangle = null;
	}
	
	public void testGetSideLengths()
	{
		assertEquals("Should return '300,400,500'", "300,400,500", rightAngledTriangle.getSideLengths());
	}
	
	
	public void testSetSideLengths()
	{
		rightAngledTriangle.setSideLengths(100, 200, 250);
		assertEquals("Should return '100,200,250'", "100,200,250", rightAngledTriangle.getSideLengths());
	}
	
	public void testGetPerimiter()
	{
		assertEquals("Should return '1200'", 1200, rightAngledTriangle.getPerimeter());
	}
	public void testGetPerimiterUB()
	{
		assertEquals("Should return '-1'", -1, impossibleUBTriangle.getPerimeter());
	}
	public void testGetPerimiterLB()
	{
		assertEquals("Should return '-1'", -1, impossibleLBTriangle.getPerimeter());
	}
	
	
	public void testGetArea()
	{
		assertEquals("Should return '60000.0'", 60000.0, rightAngledTriangle.getArea());
	}
	public void testGetAreaUB()
	{
		assertEquals("Should return '-1.0'", -1.0, impossibleUBTriangle.getArea());
	}
	public void testGetAreaLB()
	{
		assertEquals("Should return '-1.0'", -1.0, impossibleLBTriangle.getArea());
	}
	
	public void testClassifyEqi()
	{
		assertEquals("Should return 'equilateral'", "equilateral", eqiliteralTriangle.classify());
	}
	public void testClassifyEqiUB()
	{
		assertNotSame("Should not return 'equilateral'", "equilateral", aboveEqiliteralTriangle.classify());
	}
	public void testClassifyEqiLB()
	{
		assertNotSame("Should not return 'equilateral'", "equilateral", belowEqiliteralTriangle.classify());
	}
	
	public void testClassifyIso()
	{
		assertEquals("Should return 'isosceles'", "isosceles", isoscelesTriangle.classify());
	}
	public void testClassifyIsoUB()
	{
		assertNotSame("Should not return 'isosceles'", "isosceles", aboveIsoscelesTriangle.classify());
	}
	public void testClassifyIsoLB()
	{
		assertNotSame("Should not return 'isosceles'", "isosceles", belowIsoscelesTriangle.classify());
	}
	
	public void testClassifyRightAngled()
	{
		assertEquals("Should return 'right-angled'", "right-angled", rightAngledTriangle.classify());
	}
	public void testClassifyRightAngledUB()
	{
		assertNotSame("Should not return 'right-angled'", "right-angled", aboveRightAngledTriangle.classify());
	}
	public void testClassifyRightAngledLB()
	{
		assertNotSame("Should not return 'right-angled'", "right-angled", belowRightAngledTriangle.classify());
	}
	
	public void testClassifyScaleneTriangle()
	{
		assertEquals("Should return 'scalene'", "scalene", scaleneTriangle.classify());
	}
	public void testClassifyNotScaleneTriangle()
	{
		assertNotSame("Should not return 'scalene'", "scalene", notScaleneTriangle.classify());
	}
	
	public void testClassifyImpossibleLB()
	{
		assertEquals("Should return 'impossible'", "impossible", impossibleLBTriangle.classify());
	}
	public void testClassifyImpossibleUB()
	{
		assertEquals("Should return 'impossible'", "impossible", impossibleUBTriangle.classify());
	}
	public void testClassifyNotImpossibleBUB()
	{
		assertNotSame("Should not return 'impossible'", "impossible", notImpossibleBUBTriangle.classify());
	}
	public void testClassifyNotImpossibleALB()
	{
		assertNotSame("Should not return 'impossible'", "impossible", notImpossibleALBTriangle.classify());
	}

	
	/**
	 * Test whether the triangle specified in the fixture (setUp) 
	 * is right-angled. 	
	 */
	public void testIsRightAngledTrue()
	{
		assertTrue("Should be true", rightAngledTriangle.isRightAngled());
	}
	public void testIsRightAngledFalseAbove()
	{
		assertFalse("Should be false", aboveRightAngledTriangle.isRightAngled());
	}
	public void testIsRightAngledBelow()
	{
		assertFalse("Should be false'", belowRightAngledTriangle.isRightAngled());
	}
	
	
	public void testIsIsoTrue()
	{
		assertTrue("Should be true", isoscelesTriangle.isIsosceles());
	}
	public void testIsIsoFalseAbove()
	{
		assertFalse("Should be false", aboveIsoscelesTriangle.isIsosceles());
	}
	public void testIsIsoBelow()
	{
		assertFalse("Should be false'", belowIsoscelesTriangle.isIsosceles());
	}
	
	
	
	public void testIsEqiTrue()
	{
		assertTrue("Should be true", eqiliteralTriangle.isEquilateral());
	}
	public void testIsEqiFalseAbove()
	{
		assertFalse("Should be false", aboveEqiliteralTriangle.isEquilateral());
	}
	public void testIsEqiBelow()
	{
		assertFalse("Should be false'", belowEqiliteralTriangle.isEquilateral());
	}
	
	
	public void testIsScaleneTrue()
	{
		assertTrue("Should be true", scaleneTriangle.isScalene());
	}
	public void testIsScaleneFalse()
	{
		assertFalse("Should be false", notScaleneTriangle.isScalene());
	}
	
	
	public void testIsImpossibleFalseALB()
	{
		assertFalse("Should be false", notImpossibleALBTriangle.isImpossible());
	}
	public void testIsImpossibleFalseBUB()
	{
		assertFalse("Should be false", notImpossibleBUBTriangle.isImpossible());
	}
	public void testIsImpossibleTrueUB()
	{
		assertTrue("Should be true'", impossibleUBTriangle.isImpossible());
	}
	public void testIsImpossibleTrueLB()
	{
		assertTrue("Should be true", impossibleLBTriangle.isImpossible());
	}

	/**
	 * Creates a test suite. You can use this if you have a hierarchy of 
	 * suites where a suite higher in the hierarchy can have 
	 * suite.addTest(TriangleTest.suite())
	 * @return a test suite 
	 */
	public static Test suite()
	{
		TestSuite suite = new TestSuite(TriangleTest.class);
		return suite;
	}

	/**
	 * Main function for starting the TestRunner.
	 * @param args no parameters required.
	 */
//	public static void main(String args[])
//	{
//		String[] testCaseName = { TriangleTest.class.getName()};
//
//		// chooses the userinterface
//
//		// junit.textui.TestRunner.main(testCaseName);
//		// junit.awtui.TestRunner.main(testCaseName);
////		junit.swingui.TestRunner.main(testCaseName);
//	}
}