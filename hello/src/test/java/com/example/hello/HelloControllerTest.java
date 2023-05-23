package com.example.hello;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class HelloControllerTest {

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    void sayHi() {
        HelloResponse body = testRestTemplate.getForObject("/hello/demo", HelloResponse.class);
        assertEquals("Hello demo", body.getMessage());
    }

}