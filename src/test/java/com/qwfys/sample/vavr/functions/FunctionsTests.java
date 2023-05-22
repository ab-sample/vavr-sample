package com.qwfys.sample.vavr.functions;

import io.vavr.Tuple;
import io.vavr.Tuple2;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author liuwenke
 * @since 0.0.1
 */
@SpringBootTest
public class FunctionsTests {

    @Test
    void _a1() {
        Tuple2<String, Integer> java8 = Tuple.of("java", 8);
        String _1 = java8._1;
        Integer _2 = java8._2;
        System.out.printf("java8 is %s, %d)\n", _1, _2);

        Tuple2<String, Integer> that = java8.map(
                s -> _1.substring(2) + "vr",
                i -> _2 / 8
        );
        System.out.println("that is " + that);

        Tuple2<String, Integer> that1 = java8.map(
                (s, integer) -> Tuple.of(s.substring(2) + "vr", integer / 8)
        );
        System.out.println("that1 is " + that1);

        String that2 = java8.apply(
                (s, integer) -> s.substring(2) + "vr" + integer / 8
        );

        System.out.println("that2 is " + that2);

    }
}
