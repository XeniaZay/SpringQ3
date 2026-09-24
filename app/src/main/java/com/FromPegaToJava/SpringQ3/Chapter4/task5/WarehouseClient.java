package com.FromPegaToJava.SpringQ3.Chapter4.task5;

public class WarehouseClient {
    private final String baseUrl;
    private final String token;

    public WarehouseClient(String baseUrl, String token) {
        this.baseUrl = baseUrl;
        this.token = token;
    }

    public String ping() {
        return "ping " + baseUrl + " token=" + token;
    }
}