package com.gorakhcodes.config;

import javax.jms.Connection;
import javax.jms.Session;
import javax.jms.MessageProducer;
import javax.jms.TextMessage;
import javax.jms.Queue;
import javax.jms.ConnectionFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class SolaceSender {

    private static final Logger log = LoggerFactory.getLogger(SolaceSender.class);
    @Autowired
    private ConnectionFactory connectionFactory;

    @Value("${solace.listener.queue}")
    private String listenerQueue;


}

