package com.testing.selenium;

import com.testing.selenium.pagetests.ElementsTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;



@RunWith(Suite.class)
@Suite.SuiteClasses({
        SimpleTest.class,
        ElementsTest.class
})
public class TestOrder {


}