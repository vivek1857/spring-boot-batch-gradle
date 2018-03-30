package com.vmtech.batch;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class BootGradleApplication {
	public static void main(String[] args) {
		SpringApplication.run(BootGradleApplication.class, args);
	}
}
