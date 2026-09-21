package com.FromPegaToJava.SpringQ3.Chapter4.task4;

import org.springframework.boot.context.properties.ConfigurationProperties;
import jakarta.validation.constraints.NotEmpty;
import org.springframework.stereotype.Component;

import java.net.URI;
import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties("routes")
public class RoutesProperties {
    String defaultService;
    @NotEmpty private List<Rule> rules = List.of();
    private Map<String, URI> overrides = Map.of();

    public List<Rule> getRules() { return rules; }
    public void setRules(List<Rule> rules) { this.rules = rules; }
    public Map<String, URI> getOverrides() { return overrides; }
    public void setOverrides(Map<String, URI> overrides) { this.overrides = overrides; }

    record Rule(String prefix, String service) {
    }
}
