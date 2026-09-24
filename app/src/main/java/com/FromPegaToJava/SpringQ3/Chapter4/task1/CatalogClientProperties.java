package com.FromPegaToJava.SpringQ3.Chapter4.task1;

import jakarta.validation.constraints.*;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.net.URI;
import java.time.Duration;

@Validated
@Component
@ConfigurationProperties("catalog.client")
public class CatalogClientProperties {
    @NotNull private URI baseUrl;
    @NotNull Duration timeout = Duration.ofSeconds(1);
    private boolean metricsEnabled = true;

    public URI getBaseUrl() { return baseUrl; }
    public void setBaseUrl(URI baseUrl) { this.baseUrl = baseUrl; }
    public Duration getTimeout() { return timeout; }
    public void setTimeout(Duration timeout) { this.timeout = timeout; }
    public boolean isMetricsEnabled() { return metricsEnabled; }
    public void setMetricsEnabled(boolean metricsEnabled) { this.metricsEnabled = metricsEnabled; }
}
