package com.gorakhcodes.consumer;

import javax.jms.ConnectionFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class MessageReceiver {

    private static final Logger log = LoggerFactory.getLogger(MessageReceiver.class);
    @Autowired
    private ConnectionFactory connectionFactory;

    @Value("${solace.listener.queue}")
    private String listenerQueue;


}

