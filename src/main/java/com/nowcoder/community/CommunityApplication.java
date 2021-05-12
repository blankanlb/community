package com.nowcoder.community;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommunityApplication {
	//自动创建了Spring容器，自动扫描某些包（配置类所在包以及子包）下某些bean（有Controller、Service、Component、Repository注解，将其装配到容器中
	public static void main(String[] args) {
		SpringApplication.run(CommunityApplication.class, args);
	}

}
