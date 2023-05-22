package com.qwfys.sample.vavr.controller;

import com.qwfys.sample.vavr.model.Consume;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

/**
 * @author liuwenke
 * @since 0.0.1
 */
@RestController
//@RequestMapping(path="/json", produces="application/json")
@CrossOrigin(origins="*")
public class RestJsonResponse {

    @GetMapping("/json/data")
    public ArrayList<Consume> get() {

        ArrayList<Consume> arr = new ArrayList<>();

        Consume userOne = new Consume();
        userOne.setId("1");
        userOne.setName("@geek");
        userOne.setData("GeeksforGeeks");

        Consume userTwo = new Consume();
        userTwo.setId("2");
        userTwo.setName("@drash");
        userTwo.setData("Darshan.G.Pawar");

        arr.add(userOne);
        arr.add(userTwo);

        return arr;
    }

    @GetMapping("/json/{id}/{name}/{data}")
    public ResponseEntity<Consume> getData(@PathVariable("id") String id,
                                           @PathVariable("name") String name,
                                           @PathVariable("data") String data) {

        Consume user = new Consume();
        user.setId(id);
        user.setName(name);
        user.setData(data);

        HttpHeaders headers = new HttpHeaders();

        ResponseEntity<Consume> entity = new ResponseEntity<>(user,headers, HttpStatus.CREATED);

        return entity;
    }
}
