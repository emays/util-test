/*
 * Copyright 2007-2022 Mays Systems. All rights reserved.
 * Confidential and Proprietary. 
 */
package com.mays.util;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UtilTest {

	@SuppressWarnings("unused")
	private static final Logger logger = LoggerFactory.getLogger(UtilTest.class);

	@Test
	public void tabDelimitedString() {
		assertEquals("1\t2", Util.tabDelimitedString(1, 2));
	}

}
