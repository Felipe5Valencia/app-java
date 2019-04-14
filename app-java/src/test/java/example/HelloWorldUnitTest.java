package example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorldUnitTest {

  @Test
  public void test() {
    new HelloWorld().coveredByUnitTest();
  }
  
  @Test
  public void test_get_set() {
	  Logger log = LoggerFactory.getLogger(HelloWorldUnitTest.class);
	  HelloWorld.setLog(log);
	  assertTrue(HelloWorld.getLog()==log);
  }
  
  @Test
  public void test_Integration() {
    new HelloWorld().coveredByIntegrationTest();
  }
  
  @Test
  public void test_NowCovered() {
    new HelloWorld().notCovered();
  }

}
