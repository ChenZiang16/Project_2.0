//package com.config;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperConfiguration;
//import com.dangdang.ddframe.job.reg.zookeeper.ZookeeperRegistryCenter;
//@Configuration
//@ConditionalOnExpression("'${elaticjob.zookeeper.server-lists}'.length() > 0")
//public class ElasticJobConfig {
//	
//	@Bean
//	public ZookeeperRegistryCenter regCenter(@Value("${elaticjob.zookeeper.server-lists}") final String serverLists,
//			@Value("${elaticjob.zookeeper.namespace}") final String namespace){
//		return new ZookeeperRegistryCenter(new ZookeeperConfiguration(serverLists, namespace));
//	}
//	
//
//}
