package example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld {
	
	private static Logger log = LoggerFactory.getLogger(HelloWorld.class);

	public static Logger getLog() {
		return log;
	}

	public static void setLog(Logger log) {
		HelloWorld.log = log;
	}

	public void coveredByUnitTest() {
		log.info("coveredByUnitTest1");
		log.info("coveredByUnitTest2");
	}

	public void coveredByIntegrationTest() {
		log.info("coveredByIntegrationTest1");
		log.info("coveredByIntegrationTest2");
		log.info("coveredByIntegrationTest3");
	}

	public void notCovered() {
		log.info("notCovered");
	}


}
