package com.example.kafkatest;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Listeners {
    @KafkaListener(topics = "Test", groupId = "test")
    public void listener(String data) {
        System.out.println("Received: " + data);
    }
}
