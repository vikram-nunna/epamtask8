package com.epam.lamdafunctions;

import junit.framework.TestCase;
import java.util.*;

public class AverageTest extends TestCase {
	
	List <Integer> l1= Arrays.asList(1,2,3,4,5,6);

	Average objAvg=new Average();
	public void testAverage() {
			assertEquals(3.5,objAvg.average(l1));
	}

}
