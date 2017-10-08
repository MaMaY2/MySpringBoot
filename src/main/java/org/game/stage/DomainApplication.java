package org.game.stage;

import de.codecentric.boot.admin.config.EnableAdminServer;
import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
@EnableAdminServer
public class DomainApplication {
	private static Logger logger = Logger.getLogger(DomainApplication.class);
	public static void main(String[] args) {
		logger.info(DomainApplication.class.getClass().getResource("/"));
		SpringApplication.run(DomainApplication.class, args);
	}
}
