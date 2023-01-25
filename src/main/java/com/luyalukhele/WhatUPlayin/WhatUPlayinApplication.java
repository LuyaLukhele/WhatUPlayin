package com.luyalukhele.WhatUPlayin;

import com.luyalukhele.WhatUPlayin.config.AppProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(AppProperties.class)
public class WhatUPlayinApplication {

	public static void main(String[] args) {
		SpringApplication.run(WhatUPlayinApplication.class, args);
	}

}
