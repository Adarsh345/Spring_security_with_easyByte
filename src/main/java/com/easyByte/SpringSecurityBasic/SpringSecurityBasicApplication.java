package com.easyByte.SpringSecurityBasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
* Filter : Spring security filter extract username and password from http request and
* converts it in to the Authentication object .
*
*
*
*
* */

@SpringBootApplication
public class SpringSecurityBasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityBasicApplication.class, args);
	}

}
