package com.practice.jenkin.api;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class SpringJenkinsApplicationTests {

	static Logger logger=LoggerFactory.getLogger(SpringJenkinsApplicationTests.class);
	
	
	@Test
	void contextLoads() {
		logger.info("Test...");
		Assertions.assertTrue(true);
	}

}
