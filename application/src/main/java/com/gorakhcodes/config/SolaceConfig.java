package com.gorakhcodes.config;

import javax.jms.ConnectionFactory;
import com.solacesystems.jms.SolConnectionFactory;
import com.solacesystems.jms.SolJmsUtility;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import org.springframework.jms.config.JmsListenerContainerFactory;

@Configuration
public class SolaceConfig {

    @Value("${solace.java.host}")
    private String solaceHost;

    @Value("${solace.java.vpn}")
    private String solaceVpn;

    @Value("${solace.java.username}")
    private String solaceUsername;

    @Value("${solace.java.password}")
    private String solacePassword;

    @Bean
    public ConnectionFactory solaceConnectionFactory() throws Exception {
        SolConnectionFactory connectionFactory = SolJmsUtility.createConnectionFactory();
        connectionFactory.setHost(solaceHost);
        connectionFactory.setVPN(solaceVpn);
        connectionFactory.setUsername(solaceUsername);
        connectionFactory.setPassword(solacePassword);
        return connectionFactory;
    }

    @Bean
    public JmsListenerContainerFactory<?> jmsListenerContainerFactory(ConnectionFactory connectionFactory) {
        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
        factory.setConnectionFactory(connectionFactory);
        factory.setConcurrency("1-1"); // Set concurrency for message processing
        return factory;
    }
}
