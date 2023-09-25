package com.ey.attendanceBE;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AttendanceBEApplication {

	public static void main(String[] args) {
		SpringApplication.run(AttendanceBEApplication.class, args);
	}

}
