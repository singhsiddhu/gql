package com.sid.gql;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GqlApplication {
	private static final Logger LOG = LoggerFactory.getLogger(GqlApplication.class);
	public static void main(String[] args) {
		LOG.debug("Main -> Run");
		SpringApplication.run(GqlApplication.class, args);
	}
}
