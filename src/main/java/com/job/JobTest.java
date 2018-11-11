//package com.job;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//import com.dangdang.ddframe.job.api.ShardingContext;
//import com.dangdang.ddframe.job.api.simple.SimpleJob;
//import com.dangdang.elasticjob.lite.annotation.ElasticSimpleJob;
//@ElasticSimpleJob(cron="61 * * * * ?",jobName="jobTest",shardingTotalCount=1)
//public class JobTest implements SimpleJob{
//	
//	public Logger logger = LoggerFactory.getLogger(JobTest.class);
//
//	@Override
//	public void execute(ShardingContext content) {
//		
//		System.out.println("---------------------------------------");
//        System.out.println("JobName:"+content.getJobName());
//        System.out.println("JobParameter:"+content.getJobParameter());
//        System.out.println("ShardingItem:"+content.getShardingItem());
//        System.out.println("ShardingParameter:"+content.getShardingParameter());
//        System.out.println("ShardingTotalCount:"+content.getShardingTotalCount());
//        System.out.println("TaskId:"+content.getTaskId());
//        System.out.println("---------------------------------------");
//		
//	}
//
//}
