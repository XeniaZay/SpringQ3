package com.FromPegaToJava.SpringQ3.Chapter4.task2;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest(classes = {
        StubNotificationGateway.class,
        SmtpNotificationGateway.class,
        NotificationService.class
})
@ActiveProfiles("prod")
class NotificationServiceProdTest {

    @org.springframework.beans.factory.annotation.Autowired
    private NotificationService notificationService;

    @Test
    void shouldUseStubGatewayInDevProfile() {
        assertThat(notificationService.notifyUser("dima", "hello"))
                .isEqualTo("[SMTP] dima: hello");
    }
}
