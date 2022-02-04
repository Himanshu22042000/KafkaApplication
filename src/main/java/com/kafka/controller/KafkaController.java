package com.kafka.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kafka.entity.User;

@RestController
@RequestMapping("/kafka")
public class KafkaController {
	
	@Autowired
	private KafkaTemplate<String, User> kafkaTemplate;
	
	private static final String TOPIC = "Kafka_Examples";
	
	@GetMapping("/publish/{name}")
	public String post(@PathVariable("name") final String name)
	{
		kafkaTemplate.send(TOPIC,new User(name , "Technology",1200L));
		String result = "Published Successfully" + name;
		return result;
	}

}


