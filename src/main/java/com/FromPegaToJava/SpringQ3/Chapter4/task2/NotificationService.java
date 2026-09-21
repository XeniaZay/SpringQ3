package com.FromPegaToJava.SpringQ3.Chapter4.task2;

import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    private final NotificationGateway gateway;

    public NotificationService(NotificationGateway gateway) {
        this.gateway = gateway;
    }

    public String notifyUser(String user, String message) {
        return gateway.send(user, message);
    }
}
