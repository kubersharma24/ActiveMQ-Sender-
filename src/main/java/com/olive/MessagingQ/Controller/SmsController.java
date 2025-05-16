package com.olive.MessagingQ.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.olive.MessagingQ.MessageComp.SmsSender;

@RestController
@RequestMapping("/sms")
public class SmsController {

    @Autowired
    private SmsSender smsSender;

    @PostMapping("/send")
    public ResponseEntity<String> sendSms(@RequestParam String message) {
        smsSender.sendSms(message);
        return ResponseEntity.ok("SMS sent: " + message);
    }
}
