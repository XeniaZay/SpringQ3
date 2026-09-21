package com.FromPegaToJava.SpringQ3.Chapter4.task2;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class SmtpNotificationGateway implements NotificationGateway{
    @Override
    public String send(String user, String message){
        return "[SMTP] " + user + ": " + message;
    }
}
