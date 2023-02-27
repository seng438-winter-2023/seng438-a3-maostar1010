package org.jfree.data.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
	ContainsTest.class,
	ExpandTest.class,
	GetLengthTest.class,
	GetCentralValueTest.class,
	ToStringTest.class,
	scaleTests.class,
	shiftTests.class
})
public class RangeTestSuite {
}
