package com.epam.lamdafunctions;
import java.util.*;
import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

public class PalindromeTest extends TestCase {
	List<String> s1=Arrays.asList("aaa","abc");
	List<String> s2=Arrays.asList("aaa");
	Palindrome pp=new Palindrome();
	@Test
	public void test() {
		assertEquals(s2,pp.palindromelist(s1));
	}

}
