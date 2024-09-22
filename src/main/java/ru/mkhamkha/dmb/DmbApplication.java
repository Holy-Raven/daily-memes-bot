package ru.mkhamkha.dmb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class DmbApplication {

	public static void main(String[] args) {
		SpringApplication.run(DmbApplication.class, args);
	}
}
