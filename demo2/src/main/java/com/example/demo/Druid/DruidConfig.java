package com.example.demo.Druid;
import java.time.LocalDateTime;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.alibaba.druid.pool.DruidDataSource;
@Configuration
@Component

public class DruidConfig {



	@Bean
	@ConfigurationProperties(prefix="spring.datasource")
	public DataSource druid() {
		
		return new DruidDataSource();
	}
	
}
