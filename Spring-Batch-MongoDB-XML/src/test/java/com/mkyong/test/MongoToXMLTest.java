package com.mkyong.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.batch.core.BatchStatus;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.test.JobLauncherTestUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:job-report.xml", "classpath:context.xml", "classpath:database.xml" })
public class MongoToXMLTest {
	
	@Autowired
    private JobLauncherTestUtils jobLauncherTestUtils;


	@Test
	public void testMongoDBToXML() throws Exception {
		JobExecution jobExecution = jobLauncherTestUtils.launchJob();
        Assert.assertEquals(jobExecution.getStatus(), BatchStatus.COMPLETED);
	}

}
