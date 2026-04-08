
package com.zetaga.osu_pp_tracker;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class OsuPpTrackerApplication {
	public static void main(String[] args) {
		SpringApplication.run(OsuPpTrackerApplication.class, args);
	}
}
