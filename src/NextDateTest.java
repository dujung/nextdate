//import static org.junit.Assert.*;
//
//import org.junit.Test;
//
//import wb.NextDate;
//
//public class NextDateTest {
//
//	@Test
//	public void test() {
////		fail("Not yet implemented");
//		int m = 3;
//		int d = 10;
//		int y = 2017;
//		NextDate nd = new NextDate(m, d, y);
//		System.out.println(nd.run(m, d, y));
//		assertEquals("3/11/2017", nd.run(m, d, y));
//	}
//}

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import wb.NextDate;

public class NextDateTest {
	
	NextDate date;
	
	@Before
	public void setUp() {
		date = new NextDate(0,0,0);
	}
	
	@Test
	public void tc1(){
		assertEquals("invalid Input Date", date.run(1,0,2017));
	}
	
	@Test
	public void tc2(){
		assertEquals("invalid Input Date", date.run(0,1,2017));
	}
	
	@Test
	public void tc3(){
		assertEquals("invalid Input Date", date.run(13,1,2017));
	}

	@Test
	public void tc4(){
		assertEquals("invalid Input Date", date.run(1,1,1800));
	}

	@Test
	public void tc5(){
		assertEquals("invalid Input Date", date.run(1,1,2022));
	}

	@Test
	public void tc6(){
		assertEquals("10/24/2017", date.run(10,23,2017));
	}

	@Test
	public void tc7(){
		assertEquals("11/1/2017", date.run(10,31,2017));
	}

	@Test
	public void tc8(){
		assertEquals("11/24/2017", date.run(11,23,2017));
	}

	@Test
	public void tc9(){
		assertEquals("12/1/2017", date.run(11,30,2017));
	}

	@Test
	public void tc10(){
		assertEquals("Invalid Input Date", date.run(11,31,2017));
	}

	@Test
	public void tc11(){
		assertEquals("12/24/2017", date.run(12,23,2017));
	}

	@Test
	public void tc12(){
		assertEquals("1/1/2018", date.run(12,32,2017));
	}

	@Test
	public void tc13(){
		assertEquals("Invalid Next Year", date.run(12,32,2021));
	}

	@Test
	public void tc14(){
		assertEquals("2/24/2017", date.run(2,23,2017));
	}

	@Test
	public void tc15(){
		assertEquals("2/29/2000", date.run(2,28,2000));
	}

//	@Test
//	public void tc16(){
//		assertEquals("3/1/2017", date.run(2,28,2017));
//	}
//
//	@Test
//	public void tc17(){
//		assertEquals("3/1/2000", date.run(2,29,2000));
//	}
//
//	@Test
//	public void tc18(){
//		assertEquals("Invalid Input Date", date.run(2,29,2017));
//	}
//
//	@Test
//	public void tc19(){
//		assertEquals("Invalid Input Date", date.run(2,30,2017));
//	}
//
//	@Test
//	public void tc20(){
//		assertEquals("7/30/2017", date.run(7,30,2017));
//	}
}
