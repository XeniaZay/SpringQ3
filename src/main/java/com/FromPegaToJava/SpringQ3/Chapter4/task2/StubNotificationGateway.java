package com.FromPegaToJava.SpringQ3.Chapter4.task2;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("dev")
public class StubNotificationGateway implements NotificationGateway{

    @Override
    public String send(String user, String message){
        return "[DEV-STUB] " + user + ": " + message;
    }
}
