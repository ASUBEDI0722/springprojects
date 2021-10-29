package com.ektha.app.receiver;

import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.ektha.app.model.Order;

@Component
public class MessageReceiver {
	
	@RabbitListener(queues="JuneBCQ")
//	public void readMessage(String msg) {
//		System.out.println("Received message");
//		System.out.println(msg);
//	}
	
	public void readMessage(Order order) {
		System.out.println("Received message");
		System.out.println(order);
	}

}
