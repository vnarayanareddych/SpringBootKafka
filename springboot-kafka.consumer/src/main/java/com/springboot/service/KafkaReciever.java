package com.springboot.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.springboot.model.Student;

@Service
public class KafkaReciever {

	@KafkaListener(topics = "${spring.kafka.template.default-topic}", groupId = "${spring.kafka.consumer.group-id}")
	public void recieveData(Student student) {
		System.out.println("Data - " + student.toString() + "reciver");
	}
}
