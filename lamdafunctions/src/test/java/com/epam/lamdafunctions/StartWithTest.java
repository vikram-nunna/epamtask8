package com.epam.lamdafunctions;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.TestCase;

import java.util.*;
public class StartWithTest extends TestCase {
	List<String> hl=Arrays.asList("air","apple","bbb","aes","aci","vij");
	List<String> hl2=Arrays.asList("air","aes","aci");
	StartWith ss=new StartWith();

	@Test
	public void testChk() {
		assertEquals(hl2,ss.chk(hl));
	}

}
