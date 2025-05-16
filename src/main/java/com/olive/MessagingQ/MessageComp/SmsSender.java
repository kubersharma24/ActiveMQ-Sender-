package com.olive.MessagingQ.MessageComp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
public class SmsSender {

    @Autowired
    private JmsTemplate jmsTemplate;

    public void sendSms(String message) {
        System.out.println("Sending SMS ---------->>>: " + message);
        jmsTemplate.convertAndSend("outgoing.sms.queue", message);
    }
}
