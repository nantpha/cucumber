package com.example.testing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.messaging.support.GenericMessage;

public class KafkaSender {

	@Autowired
	private KafkaTemplate<String, String> kafkaTemplate;
	
	public void sendData(String student) {
		kafkaTemplate.send(new GenericMessage<String>(student));
	}

	
}
