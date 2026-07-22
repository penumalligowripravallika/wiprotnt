package com.wipro.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)

@Suite.SuiteClasses({

    TestStringConcat.class,
    Testsort.class,
    TestCheckPresence.class

})

public class AllTests {

}