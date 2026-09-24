package com.FromPegaToJava.SpringQ3.Chapter4.task6;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.DynamicPropertyRegistry;
import org.springframework.test.context.DynamicPropertySource;
import org.testcontainers.containers.PostgreSQLContainer;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest(classes = CustomerRepository.class)
@ActiveProfiles("test")
public class CustomerRepositoryTest {
    private static final PostgreSQLContainer<?> pg = new PostgreSQLContainer<>("postgres:16-alpine");

    @org.springframework.beans.factory.annotation.Autowired
    private CustomerRepository customerRepository;

    @BeforeAll
    static void start() { pg.start(); }
    @AfterAll
    static void stop()  { pg.stop(); }

    @DynamicPropertySource
    static void props(DynamicPropertyRegistry registry) {
        registry.add("spring.datasource.url", pg::getJdbcUrl);
        registry.add("spring.datasource.username", pg::getUsername);
        registry.add("spring.datasource.password", pg::getPassword);
    }

    @Test
    void ok() {
        String info = customerRepository.connectionInfo();

        assertThat(info.contains(pg.getJdbcUrl()));
        assertThat(info.contains(pg.getUsername()));
        assertThat(info.contains(pg.getPassword()));

    }


}
