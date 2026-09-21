package com.FromPegaToJava.SpringQ3.Chapter4.task3;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("pricing.new-algorithm")
record PricingFeatureProperties(boolean enabled) {
}
