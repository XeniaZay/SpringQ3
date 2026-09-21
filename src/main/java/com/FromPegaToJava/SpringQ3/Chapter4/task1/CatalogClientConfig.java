package com.FromPegaToJava.SpringQ3.Chapter4.task1;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(CatalogClientProperties.class)
public class CatalogClientConfig {

    @Bean
    public CatalogHttpClient catalogHttpClient(CatalogClientProperties props){
        return new CatalogHttpClient(props.getBaseUrl(),props.getTimeout(),props.isMetricsEnabled());
    }
}
