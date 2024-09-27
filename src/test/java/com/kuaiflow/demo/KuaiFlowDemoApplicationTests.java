package com.kuaiflow.demo;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import javax.annotation.Resource;

import com.kuaiflow.demo.biz.KuaiFlowBiz;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = com.kuaiflow.demo.KuaiflowDemoApplication.class)
public class KuaiFlowDemoApplicationTests {
	private Logger logger = LoggerFactory.getLogger(getClass());

	@Resource
	private KuaiFlowBiz kuaiFlowBiz;

	@Test
	public void testGetAccessToken() {
		String token = kuaiFlowBiz.getAccessToken("9910031941","c94b1dcd");
		logger.info(token);
		assertNotNull(token);
	}


	@Test
	public void saveQDictData() {
		Long id = kuaiFlowBiz.saveQDictData();
		logger.info(String.valueOf(id));
		assertNotNull(id);

	}


}
