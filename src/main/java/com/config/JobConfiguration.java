//package com.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import com.dangdang.ddframe.job.api.simple.SimpleJob;
//import com.dangdang.ddframe.job.config.JobCoreConfiguration;
//import com.dangdang.ddframe.job.config.simple.SimpleJobConfiguration;
//import com.dangdang.ddframe.job.lite.api.JobScheduler;
//import com.dangdang.ddframe.job.lite.config.LiteJobConfiguration;
//import com.dangdang.ddframe.job.lite.spring.api.SpringJobScheduler;
//import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter;
//import com.job.JobTest;
//
//@Configuration
//public class JobConfiguration {
//	
//	@Autowired
//    private ElasticJobConfig elasticJobConfig;
//	
//	@Autowired
//	private ZookeeperRegistryCenter regCenter;
//	
//	public JobConfiguration() {
//		
//	}
//	
//	@Bean
//	public SimpleJob jobTest(){
//		return new JobTest();
//	}
//	
//	@Bean(initMethod = "init")
//	public JobScheduler simpleJobScheduler(final SimpleJob simpleJob, @Value("${jobTest.cron}") final String cron,
//			@Value("${jobTest.shardingTotalCount}") final int shardingTotalCount,
//            @Value("${jobTest.shardingItemParameters}") final String shardingItemParameters){
//		return new SpringJobScheduler(simpleJob, regCenter, getLiteJobConfiguration(simpleJob.getClass(), cron, shardingTotalCount, shardingItemParameters));
//	}
//	
//	private LiteJobConfiguration getLiteJobConfiguration(final Class<? extends SimpleJob> jobClass,
//            											 final String cron,final int shardingTotalCount,
//            											 final String shardingItemParameters){
//
//			return LiteJobConfiguration.newBuilder(
//	                new SimpleJobConfiguration(
//	                        JobCoreConfiguration.newBuilder(
//	                                jobClass.getName(),cron,shardingTotalCount)
//	                                .shardingItemParameters(shardingItemParameters)
//	                                .build()
//	                        ,jobClass.getCanonicalName()
//	                )
//	        ).overwrite(true).build();
//		
//	}
//	
//}
