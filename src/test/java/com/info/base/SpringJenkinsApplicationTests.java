package com.info.base;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class SpringJenkinsApplicationTests {

	static Logger logger = LoggerFactory.getLogger(SpringJenkinsApplication.class);
	
	@Test
	void contextLoads() {
		logger.info("Testing Started...");
		assertEquals(true, true);
	}

}
