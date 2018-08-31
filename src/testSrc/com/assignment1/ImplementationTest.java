package com.assignment1;

import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.Before;
import org.junit.Test;

public class ImplementationTest {
	
	private Implementation classUnderTest;

	@Before
	public void setUp() throws Exception {
		classUnderTest = new Implementation();
	}
	
	@Test
	public void testGradientCalculate() {
		
		Scanner ug=new Scanner(System.in);
		
		 System.out.println("enter x1 test point");
		 
		 double x1 = ug.nextInt();
		 
		 System.out.println("enter y1 test point");
		 
		 double y1 = ug.nextInt();
		 
		 System.out.println("enter x2 test point");
		 
		 double x2 = ug.nextInt();
		 
		 System.out.println("enter y2 test point");
		 
		 double y2 = ug.nextInt();
		 
		Object gradientResult = (y2-y1)/ (x2-x1);
		
		assertEquals(gradientResult, classUnderTest.gradientCalculate(x1 , y1, x2, y2));
		
	}
	
	@Test
	public void testDitanceCalculate() {
		
		Scanner ud=new Scanner(System.in);
		
		 System.out.println("enter x1 test point");
		 
		 double x1 = ud.nextInt();
		 
		 System.out.println("enter y1 test point");
		 
		 double y1 = ud.nextInt();
		 
		 System.out.println("enter x2 test point");
		 
		 double x2 = ud.nextInt();
		 
		 System.out.println("enter y2 test point");
		 
		 double y2 = ud.nextInt();
		 
		Object distanceResult = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		
		assertEquals(distanceResult, classUnderTest.ditanceCalculate(x1 , y1, x2, y2));
		
	}
	
	@Test
	public void testequationCalculate() {
		
		Scanner ue=new Scanner(System.in);
		
		 System.out.println("enter x1 test point");
		 
		 double x1 = ue.nextInt();
		 
		 System.out.println("enter y1 test point");
		 
		 double y1 = ue.nextInt();
		 
		 System.out.println("enter x2 test point");
		 
		 double x2 = ue.nextInt();
		 
		 System.out.println("enter y2 test point");
		 
		 double y2 = ue.nextInt();
		 
		Object equationbResult = y1-(y2-y1)/ (x2-x1)*x1;
		
		assertEquals(equationbResult, classUnderTest.equationCalculate(x1 , y1, x2, y2));
		
	}
}
