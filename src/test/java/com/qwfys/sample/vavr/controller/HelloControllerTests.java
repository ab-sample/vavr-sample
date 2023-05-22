package com.qwfys.sample.vavr.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Map;

import static org.assertj.core.api.BDDAssertions.then;

//@SpringBootTest
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloControllerTests {

    @LocalServerPort
    private int port;

    @Autowired
    private TestRestTemplate testRestTemplate;

    @Test
    void _a002() {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>");

        ResponseEntity<Map> entity = this.testRestTemplate.getForEntity(
                "http://127.0.0.1:" + this.port + "/hello",
                Map.class
        );
        then(entity.getStatusCode()).isEqualTo(HttpStatus.OK);
        then(entity.getBody().get("id")).isEqualTo(1);
        then(entity.getBody().get("content")).isEqualTo("Hello, Stranger!");

        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<");
    }

    @Test
    void _a001() {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>");

        ResponseEntity<Map> entity = this.testRestTemplate.getForEntity(
                "http://127.0.0.1:" + this.port + "/hello",
                Map.class
        );
        then(entity.getStatusCode()).isEqualTo(HttpStatus.OK);
        then(entity.getBody().get("id")).isEqualTo(1);
        then(entity.getBody().get("content")).isEqualTo("Hello, Stranger!");

        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<");
    }

}
