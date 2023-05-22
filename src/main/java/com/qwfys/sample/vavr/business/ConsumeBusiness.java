package com.qwfys.sample.vavr.business;

import com.qwfys.sample.vavr.model.Consume;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

/**
 * @author liuwenke
 * @since 0.0.1
 */
public class ConsumeBusiness {

    RestTemplate rest = new RestTemplate();

    public ResponseEntity<Consume> get() {
        ResponseEntity<Consume> entity = rest.getForEntity(
                "http://127.0.0.1:19000/json/{id}/{name}/{data}",
                Consume.class,
                "007", "geek@drash", "Darshan.G.Pawar"
        );
        return entity;
    }
}
