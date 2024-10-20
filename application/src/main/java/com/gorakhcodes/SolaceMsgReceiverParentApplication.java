package com.gorakhcodes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class SolaceMsgReceiverParentApplication{

	public static void main(String[] args) {
		SpringApplication.run(SolaceMsgReceiverParentApplication.class, args);
    }

}
