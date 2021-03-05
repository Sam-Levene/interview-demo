package org.example;

import org.junit.runner.RunWith;
import io.cucumber.junit.*;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/test/resources/features"},glue={"classpath:org.example.step_definitions"},plugin={"json:target/cuke-results.json"})
public class InterviewDemoTest {
}
