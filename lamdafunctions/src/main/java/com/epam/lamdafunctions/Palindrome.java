package com.epam.lamdafunctions;
import java.util.*;
import java.util.stream.Collectors;
import java.lang.*;
import java.io.*; 
public class Palindrome {

	public List<String> palindromelist(List <String> a)
	{
	  return a.stream()
	    .filter(value -> ispalindrome(value))  
	    .collect(Collectors.toList());
	  
	}
	
	static boolean ispalindrome(String ss)
	{
		String hl="";
		int le=ss.length();
		int i;
		  for(i=le-1;i>=0;i--)
		  {
		    hl=hl+ss.charAt(i);
		  }
		  if(hl.equals(ss))
		  {
		  return(true);
		  }
		  else {
		    return(false);
		  }
	}
}
