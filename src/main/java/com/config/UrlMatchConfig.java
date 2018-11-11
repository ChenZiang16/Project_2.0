package com.config;

import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

public class UrlMatchConfig extends WebMvcConfigurationSupport{
	@Override
	public void configurePathMatch(PathMatchConfigurer configure) {
		//后缀模式匹配
		configure.setUseSuffixPatternMatch(true);
		//自动后缀路径模式匹配
		configure.setUseTrailingSlashMatch(true);
	}
	
}
