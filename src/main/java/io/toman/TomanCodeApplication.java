package io.toman;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("io.toman.dao")
public class TomanCodeApplication {
	public static void main(String[] args) {
		SpringApplication.run(TomanCodeApplication.class, args);
	}
}
