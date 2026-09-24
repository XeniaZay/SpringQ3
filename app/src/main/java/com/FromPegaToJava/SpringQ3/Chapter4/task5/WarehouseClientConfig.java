package com.FromPegaToJava.SpringQ3.Chapter4.task5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class WarehouseClientConfig {
    @Bean
    WarehouseClient warehouseClient() {
        return new WarehouseClient("https://warehouse.internal", "hardcoded-token");
    }
}
