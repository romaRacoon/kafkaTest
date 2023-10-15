package com.example.kafkatest;

import lombok.AllArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messages")
@AllArgsConstructor
public class MessageController {
    private KafkaTemplate<String, String> kafkaTemplate;

    @PostMapping("/add")
    public void publish(@RequestBody Message message) {
        kafkaTemplate.send("Test", message.message());
    }
}
