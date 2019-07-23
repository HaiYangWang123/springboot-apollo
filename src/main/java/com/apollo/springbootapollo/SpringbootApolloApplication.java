package com.apollo.springbootapollo;

import com.ctrip.framework.apollo.spring.annotation.EnableApolloConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;


@EnableApolloConfig
@SpringBootApplication
public class SpringbootApolloApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootApolloApplication.class, args);
	}
}
