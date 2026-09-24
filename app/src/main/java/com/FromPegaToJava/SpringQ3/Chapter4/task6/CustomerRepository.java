package com.FromPegaToJava.SpringQ3.Chapter4.task6;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepository {
    private final String jdbcUrl;
    private final String username;
    private final String password;

    public CustomerRepository(
            @Value("${spring.datasource.url}") String jdbcUrl,
            @Value("${spring.datasource.username}") String username,
            @Value("${spring.datasource.password}") String password
    ) {
        this.jdbcUrl = jdbcUrl;
        this.username = username;
        this.password = password;
    }

    public String connectionInfo() {
        return jdbcUrl + "|" + username + "|" + password;
    }
}
