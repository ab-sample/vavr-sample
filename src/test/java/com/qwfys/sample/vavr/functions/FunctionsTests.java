package com.qwfys.sample.vavr.functions;

import io.vavr.Function1;
import io.vavr.Function2;
import org.assertj.core.api.AbstractIntegerAssert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.BDDAssertions.then;

/**
 * @author liuwenke
 * @since 0.0.1
 */
@SpringBootTest
public class FunctionsTests {

    @Test
    void _a1() {
        Function2<Integer, Integer, Integer> sum = (a, b) -> a + b;

        Function2<Integer, Integer, Integer> sum1 = new Function2<Integer, Integer, Integer>() {
            @Override
            public Integer apply(Integer _1, Integer _2) {
                return _1 + _2;
            }
        };

        Function1<Integer, Integer> plusOne = a -> a + 1;
        Function1<Integer, Integer> multiplyByTwo = a -> a * 2;
        Function1<Integer, Integer> add1AndMultiplyBy2 = plusOne.andThen(multiplyByTwo);
        AbstractIntegerAssert<?> equalTo1 = then(add1AndMultiplyBy2.apply(2)).isEqualTo(6);

        Function1<Integer, Integer> _add1AndMultiplyBy2 = multiplyByTwo.compose(plusOne);
        AbstractIntegerAssert<?> equalTo2 = then(_add1AndMultiplyBy2.apply(2)).isEqualTo(6);

        System.out.println(equalTo1);
        System.out.println(equalTo2);

        //Function3<String,String,String,String> function3= Function3.of(this::methodWhichAccepts3Parameters);
    }
}
