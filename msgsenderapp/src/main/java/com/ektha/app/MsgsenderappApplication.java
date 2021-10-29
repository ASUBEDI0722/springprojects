package com.ektha.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ektha.app.model.Order;
import com.ektha.app.sender.MyMessageSender;

@SpringBootApplication
public class MsgsenderappApplication implements CommandLineRunner {
	
	@Autowired
	private MyMessageSender myMessageSender;

	public static void main(String[] args) {
		SpringApplication.run(MsgsenderappApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		System.out.println("sending messaging...");
		
//		myMessageSender.sendMessage("Welcome to enterprise messaging..");
		myMessageSender.sendOrderDetails(new Order(1, 12, 3, "Urgent Delivery"));
		
		
	}

}
