package com.gorakhcodes.consumer;

import javax.jms.ConnectionFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
public class MessageReceiver {

    private static final Logger log = LoggerFactory.getLogger(MessageReceiver.class);
    @Autowired
    private ConnectionFactory connectionFactory;

    @Value("${solace.listener.queue}")
    private String listenerQueue;

    @JmsListener(destination = "gg.test.receive", containerFactory = "jmsListenerContainerFactory")
    public void receiveMessage(String message) {
        // Print the message received from the queue
        System.out.println("Received message: " + message);
    }
}

