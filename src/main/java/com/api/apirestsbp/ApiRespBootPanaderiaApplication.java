package com.api.apirestsbp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude=DataSourceAutoConfiguration.class)
public class ApiRespBootPanaderiaApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiRespBootPanaderiaApplication.class, args);
	}

}
