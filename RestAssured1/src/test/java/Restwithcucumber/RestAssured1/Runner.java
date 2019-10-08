package Restwithcucumber.RestAssured1;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		plugin= {"pretty"},glue= {"RestwithCuccSteps"},features= {"src/test/java/features/RestwithCucc1.feature"})
public class Runner{
	
}
		
	
