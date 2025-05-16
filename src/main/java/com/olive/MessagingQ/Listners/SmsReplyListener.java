package com.olive.MessagingQ.Listners;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
public class SmsReplyListener {

    @JmsListener(destination = "incoming.sms.queue")
    public void receiveReply(String message) {
        System.out.println("Received reply <<<----------: " + message);
    }
}
