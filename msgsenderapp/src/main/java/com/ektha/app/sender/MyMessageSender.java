package com.ektha.app.sender;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitMessagingTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import com.ektha.app.model.Order;

@Component
public class MyMessageSender {
	
	@Autowired
	private RabbitMessagingTemplate messagingTemplate;
	
	@Bean
	public Queue getQueue() {
		
		Queue queue = new Queue("JuneBCQ", false);
		return queue;
	}
	
//	public void sendMessage(String msg) {
//		
//		messagingTemplate.convertAndSend("JuneBCQ", msg);
//		System.out.println("Message sent successfully...");
//		
//		
//		
//	}
	
	public void sendOrderDetails(Order order) {
		
		messagingTemplate.convertAndSend("JuneBCQ", order);
		System.out.println("Order details sent successfully...");
	}

}
