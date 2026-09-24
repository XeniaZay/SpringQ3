package com.FromPegaToJava.SpringQ3.Chapter4.task4;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(RoutesProperties.class)
public class RouteConfig {
}


/*
application.yml

routes:
  default-service: gateway
  rules:
    - prefix: /api/users/
      service: users
    - prefix: /api/payments/
      service: payments
  overrides:
    users: users-v1

---
spring:
  config:
    activate:
      on-profile: prod
routes:
  rules:
    - prefix: /api/users/
      service: users
    - prefix: /api/payments/
      service: payments
    - prefix: /api/analytics/
      service: analytics
  overrides:
    users: users-v2
    analytics: analytics-prod
*/
