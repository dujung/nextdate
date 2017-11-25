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
	public void invalidDay(){
		assertEquals("Should return \"invalid Input Date\"","invalid Input Date", date.run(1,0,2012));
	}
	
	@Test
	public void invalidMonthLow(){
		assertEquals("Should return \"invalid Input Date\"","invalid Input Date", date.run(0,2,2012));
	}
	
	@Test
	public void invalidMonthHigh(){
		assertEquals("Should return \"invalid Input Date\"","invalid Input Date", date.run(13,2,2012));
	}
	
	@Test
	public void invalidYearLow(){
		assertEquals("Should return \"invalid Input Date\"","invalid Input Date", date.run(2,12,1800));
	}
	
	@Test
	public void invalidYearHigh(){
		assertEquals("Should return \"invalid Input Date\"","invalid Input Date", date.run(2,12,2022));
	}
	
	@Test
	public void almostLastDayThirtyOne(){
		assertEquals("Should return \"01/31/2012\"","1/31/2012", date.run(1,30,2012));
	}
	
	@Test
	public void lastDayThirtyOne() {
		assertEquals("Should return \"04/01/2012\"","4/1/2012", date.run(3,31,2012));
	}
	
	@Test
	public void invalidDayThirtyOne() {
		assertEquals("Should return \"Invalid Input Date\"","Invalid Input Date", date.run(12,32,2012));
	}
	
	@Test
	public void almostLastDayThirty(){
		assertEquals("Should return \"04/30/2012\"","4/30/2012", date.run(4,29,2012));
	}
	
	@Test
	public void lastDayThirty(){
		assertEquals("Should return \"07/01/2012\"","7/01/2012", date.run(6,30,2012));
	}
	
	@Test
	public void almostLastDayTwentyEight(){
		assertEquals("Should return \"02/28/2013\"","2/28/2013", date.run(2,27,2013));
	}
	
	@Test
	public void lastDayTwentyEight() {
		assertEquals("Should return \"03/01/1900\"","3/1/1900", date.run(2,28,1900));
	}
	
	@Test
	public void invalidLastDayLeapYear() {
		assertEquals("Should return \"Invalid Input Date\"","Invalid Input Date", date.run(2,30,2012));
	}
	
	@Test
	public void almostLastDayLeapYearDividedByFourHundred() {
		assertEquals("Should return \"02/29/2000\"","2/29/2000", date.run(2,28,2000));
	}
	
	@Test
	public void almostLastDayLeapYearDividedByFourHundred111() {
		assertEquals("Should return \"02/29/2000\"","2/29/2000", date.run(2,28,2000));
	}
	
	@Test
	public void lastDayLeapYear() {
		assertEquals("Should return \"03/01/1904\"","3/1/1904", date.run(2,29,1904));
	}
	
	@Test
	public void invalidDateNotLeapYear() {
		assertEquals("Should return \"Invalid Input Date\"","Invalid Input Date", date.run(2,29,2013));
	}
	
	@Test
	public void invalidDateLeapYear() {
		assertEquals("Should return \"Invalid Input Date\"","Invalid Input Date", date.run(2,30,2012));
	}
	
	@Test
	public void testMay() {
		assertEquals("Should return \"05/16/2012\"","5/16/2012", date.run(5,15,2012));
	}
	
	@Test
	public void nextDayAugust() {
		assertEquals("Should return 08/20/1930", "8/20/1930", date.run(8, 19, 1930));
	}
	
	@Test
	public void invalidDayInMonth() {
		assertEquals("Should return \"Invalid Input Date\"", "Invalid Input Date", date.run(9, 31, 1945));
	}
	
	@Test
	public void nextDayOctober() {
		assertEquals("Should return 10/28/1845", "10/28/1845", date.run(10, 27, 1845));
	}
	
	@Test
	public void nextDayNovember() {
		assertEquals("Should return 11/02/1999", "11/2/1999", date.run(11, 1, 1999));
	}
	
	@Test
	public void nextDayDecember() {
		assertEquals("Should return 12/31/1999", "12/31/1999", date.run(12, 30, 1999));
	}
	
	@Test
	public void newYearsEve() {
		System.out.println(date.run(12, 31, 1999));
		assertEquals("Should return 01/01/2000", "1/1/2000",date.run(12, 31, 1999));
	}
	
	@Test
	public void invalidNextYear() {
		assertEquals("Should return \"Invalid Next Year\"", "Invalid Next Year", date.run(12,31,2021));
	}
	
//	@Test
//	public void testMain() {
//		verify(date.main(null));
//	}
	
}
