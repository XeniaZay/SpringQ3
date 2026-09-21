package com.FromPegaToJava.SpringQ3.Chapter4.task1;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.net.URI;
import java.time.Duration;

@Component
public class CatalogHttpClient {
    private final URI baseUrl;
    private final Duration timeoutMs;
    private final boolean metricsEnabled;

    public CatalogHttpClient(URI baseUrl, Duration timeoutMs, boolean metricsEnabled) {
        this.baseUrl = baseUrl;
        this.timeoutMs = timeoutMs;
        this.metricsEnabled = metricsEnabled;
    }

    public String get(String path) {
        return "GET " + baseUrl + path + " timeout=" + timeoutMs + " metrics=" + metricsEnabled;
    }
}


