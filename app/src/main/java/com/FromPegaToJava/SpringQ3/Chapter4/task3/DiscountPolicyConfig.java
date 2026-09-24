package com.FromPegaToJava.SpringQ3.Chapter4.task3;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(PricingFeatureProperties.class)
class DiscountPolicyConfig {

    @Bean
    @ConditionalOnProperty(
            prefix = "pricing.new-algorithm",
            name = "enabled",
            havingValue = "false",
            matchIfMissing = true
    )
    DiscountPolicy oldDiscountPolicy() {
        return new OldDiscountPolicy();
    }

    @Bean
    @ConditionalOnProperty(
            prefix = "pricing.new-algorithm",
            name = "enabled",
            havingValue = "true"
    )
    DiscountPolicy newDiscountPolicy() {
        return new NewDiscountPolicy();
    }
}
