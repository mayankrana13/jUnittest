package jUnitTestingPackage;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ testAddnumbers.class })
public class AllTests {

}
