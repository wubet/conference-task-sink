package com.example.conferencetasksink;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.task.launcher.annotation.EnableTaskLauncher;

@SpringBootApplication
@EnableTaskLauncher
public class ConferenceTaskSinkApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConferenceTaskSinkApplication.class, args);
	}

}
