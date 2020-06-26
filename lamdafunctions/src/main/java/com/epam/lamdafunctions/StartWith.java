package com.epam.lamdafunctions;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartWith {
	public List<String> chk(List <String> ll)
	{
	  return ll.stream().filter(val -> ((val.charAt(0)=='a') && (val.length()==3) ))
	  .collect(Collectors.toList());
	     
	}
	

}
