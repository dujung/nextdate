import trianglepackage.Triangle;
import junit.framework.TestCase;


public class TriangleTest_EP extends TestCase
{
	
	private Triangle TCEP1;
	private Triangle TCEP2;
	private Triangle TCEP3;
	private Triangle TCEP4;
	private Triangle TCEP5;
	private Triangle TCEP6;
	private Triangle TCEP7;
	private Triangle TCEP8;
	private Triangle TCEP9;
	private Triangle TCEP10;
	private Triangle TCEP11;
	private Triangle TCEP12;
	private Triangle TCEP13;
	private Triangle TCEP14;
	private Triangle TCEP15;
	private Triangle TCEP16;
	private Triangle TCEP17;
	private Triangle TCEP18;
	private Triangle TCEP19;
	private Triangle TCEP20;
	private Triangle TCEP21;
	private Triangle TCEP22;
	private Triangle TCEP23;
	private Triangle TCEP24;		
	private Triangle TCEP25;
	private Triangle TCEP26;
	private Triangle TCEP27;
	private Triangle TCEP28;		//Test case cannot be performed. out of range
	private Triangle TCEP29;
	private Triangle TCEP30;
	private Triangle TCEP31;

	protected void setUp()
	{
		//classify() test
		TCEP1 = new Triangle(100,100,100);
		TCEP2 = new Triangle(100,100,150);
		TCEP3 = new Triangle(100,150,100);
		TCEP4 = new Triangle(150,100,100);		
		TCEP5 = new Triangle(400,300,500);
		TCEP6 = new Triangle(300,500,400);
		TCEP7 = new Triangle(500,300,400);
		TCEP8 = new Triangle(80,100,110);
		TCEP9 = new Triangle(50,50,100);
		//isEquilateral() test
		TCEP10 = new Triangle(100,100,100);
		TCEP11 = new Triangle(90,100,100);
		//isRightAngled() test
		TCEP12 = new Triangle(300,400,500);
		TCEP13 = new Triangle(300,500,400);
		TCEP14 = new Triangle(500,400,300);
		TCEP15 = new Triangle(100,100,100);
		//isIsosceles() test
		TCEP16 = new Triangle(100,100,150);
		TCEP17 = new Triangle(100,150,100);
		TCEP18 = new Triangle(150,100,100);
		TCEP19 = new Triangle(100,150,200);
		//isScalene() test
		TCEP20 = new Triangle(100,150,200);
		TCEP21 = new Triangle(100,100,150);
		//getArea() test
		TCEP22 = new Triangle(500,500,500);
		TCEP23 = new Triangle(100,50,50);
		//getPerimeter() test
		TCEP24 = new Triangle(100,100,150);
		TCEP25 = new Triangle(0,100,100);
		//isImpossible() test
		TCEP26 = new Triangle(50,50,100);
		TCEP27 = new Triangle(0,100,100);		
		//TCEP28 = new Triangle(2147483648,50,100);		//Test case cannot be performed. out of range
		TCEP29 = new Triangle(100,100,100);
		//setSideLengths(,,) test
		TCEP30 = new Triangle(100,100,100);
		//getSideLengths test
		TCEP31 = new Triangle(100,150,200);

		
	}

	protected void tearDown()
	{
		TCEP1 = null;
		TCEP2 = null;
		TCEP3 = null;
		TCEP4 = null;
		TCEP5 = null;
		TCEP6 = null;
		TCEP7 = null;
		TCEP8 = null;
		TCEP9 = null;
		TCEP10 = null;
		TCEP11 = null;
		TCEP12 = null;
		TCEP13 = null;
		TCEP14 = null;
		TCEP15 = null;
		TCEP16 = null;
		TCEP17 = null;
		TCEP18 = null;
		TCEP19 = null;
		TCEP20 = null;
		TCEP21 = null;
		TCEP22 = null;
		TCEP23 = null;
		TCEP24 = null;		//Test case cannot be performed. out of range
		TCEP25 = null;
		TCEP26 = null;
		TCEP27 = null;
		TCEP28 = null;
		TCEP29 = null;
		TCEP30 = null;
		TCEP31 = null;
		

	}
	
	public void testclassfy_TCEP1()
	{
		assertEquals("Should return 'equilateral'", "equilateral", TCEP1.classify());
	}
	
	public void testclassfy_TCEP2()
	{
		assertEquals("Should return 'isosceles'", "isosceles", TCEP2.classify());
	}
	
	public void testclassfy_TCEP3()
	{
		assertEquals("Should return 'isosceles'", "isosceles", TCEP3.classify());
	}
	
	public void testclassfy_TCEP4()
	{
		assertEquals("Should return 'isosceles'", "isosceles", TCEP4.classify());
	}
	
	public void testclassfy_TCEP5()
	{
		assertEquals("Should return 'right-angled'", "right-angled", TCEP5.classify());
	}
	
	public void testclassfy_TCEP6()
	{
		assertEquals("Should return 'right-angled'", "right-angled", TCEP6.classify());
	}
	
	public void testclassfy_TCEP7()
	{
		assertEquals("Should return 'right-angled'", "right-angled", TCEP7.classify());
	}

	public void testclassfy_TCEP8()
	{
		assertEquals("Should return 'scalene'", "scalene", TCEP8.classify());
	}
	
	public void testclassfy_TCEP9()
	{
		assertEquals("Should return 'impossible'", "impossible", TCEP9.classify());
	}

	public void testisEquilateral_TCEP10()
	{
		assertTrue("Should be true", TCEP10.isEquilateral());
	}

	public void testisEquilateral_TCEP11()
	{
		assertFalse("Should be false", TCEP11.isEquilateral());
	}
	
	public void testisRightAngled_TCEP12()
	{
		assertTrue("Should be true", TCEP12.isRightAngled());
	}
	
	public void testisRightAngled_TCEP13()
	{
		assertTrue("Should be true", TCEP13.isRightAngled());
	}
	
	public void testisRightAngled_TCEP14()
	{
		assertTrue("Should be true", TCEP14.isRightAngled());
	}
	
	public void testisRightAngled_TCEP15()
	{
		assertFalse("Should be false", TCEP15.isRightAngled());
	}
	
	public void testisIsosceles_TCEP16()
	{
		assertTrue("Should be true", TCEP16.isIsosceles());
	}
	
	public void testisIsosceles_TCEP17()
	{
		assertTrue("Should be true", TCEP17.isIsosceles());
	}

	public void testisIsosceles_TCEP18()
	{
		assertTrue("Should be true", TCEP18.isIsosceles());
	}
	
	public void testisIsosceles_TCEP19()
	{
		assertFalse("Should be false", TCEP19.isIsosceles());
	}
	
	public void testisScalene_TCEP20()
	{
		assertTrue("Should be true", TCEP20.isScalene());
	}

	public void testisScalene_TCEP21()
	{
		assertFalse("Should be false", TCEP21.isScalene());
	}
	
	public void testgetArea_TCEP22()
	{
		assertEquals("Should return '108253.1'", 108253.1, TCEP22.getArea());
	}
	
	public void testgetArea_TCEP23()
	{
		assertEquals("Should return '-1.0'", -1.0, TCEP23.getArea());
	}
	
	public void testgetArea_TCEP24()
	{
		assertEquals("Should return '350'", 350, TCEP24.getPerimeter());
	}
	
	public void testgetArea_TCEP25()
	{
		assertEquals("Should return '-1'", -1, TCEP25.getPerimeter());
	}	
	
	public void testisImpossible_TCEP26()
	{
		assertTrue("Should be true", TCEP26.isImpossible());
	}	
	
	public void testisImpossible_TCEP27()
	{
		assertTrue("Should be true", TCEP27.isImpossible());
	}	
	
	public void testisImpossible_TCEP28()
	{
		//na
	}	
	
	public void testisImpossible_TCEP29()
	{
		assertFalse("Should be false", TCEP29.isImpossible());
	}	

	public void testsetSideLengths_TCEP30()
	{
		TCEP30.setSideLengths(50, 100, 150);
		assertEquals("Should return '50,100,150'", "50,100,150", TCEP30.getSideLengths());
	}
	
	public void testgetSideLengths_TCEP31()
	{
		assertEquals("Should return '100,150,200'", "100,150,200", TCEP31.getSideLengths());
		
	}
	
}
