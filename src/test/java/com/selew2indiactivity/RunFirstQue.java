package com.selew2indiactivity;

import org.junit.runner.RunWith;
import cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
monochrome=true,
format = {"pretty", "html:target/cucumber"})

public class RunFirstQue {

}
