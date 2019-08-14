package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author
 */
@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		/*
		 可以注册监听bean， 也可以用这种来加载监听
		SpringApplication springApplication = new SpringApplication(DemoApplication.class);
		springApplication.addListeners(new ApplicationStartup());
		springApplication.run(args);
		*/
		SpringApplication.run(DemoApplication.class, args);//负责启动引导应用程序
	}
}
