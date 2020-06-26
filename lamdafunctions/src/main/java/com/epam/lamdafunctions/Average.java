package com.epam.lamdafunctions;
import java.util.*;
import java.util.stream.*;
public class Average {
	
	public double average(List<Integer> ll)
	{	  
	  return ll.stream().mapToInt(value -> value).average().orElse(0.0);
	}

}
