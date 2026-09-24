package com.FromPegaToJava.SpringQ3.Chapter5.task2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class TimeController {

    @GetMapping("/time")
    public TimeResponse time() {
        return new TimeResponse("Current server time", LocalDateTime.now());
    }
}
