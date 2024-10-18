package com.gorakhcodes;

import com.gorakhcodes.config.SolaceSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SolaceMsgReceiverParentApplication{

	public static void main(String[] args) {
		SpringApplication.run(SolaceMsgReceiverParentApplication.class, args);
    }

}
