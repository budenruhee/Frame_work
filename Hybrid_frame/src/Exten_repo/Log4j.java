package Exten_repo;

import java.util.logging.Logger;

import org.apache.log4j.BasicConfigurator;
import org.testng.annotations.Test;

public class Log4j {
	@Test
	public void test2()
	{
		//step1
		BasicConfigurator.configure();
		// step2
		Logger log = Logger.getLogger(null)
	}

}
