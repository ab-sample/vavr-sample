package com.qwfys.sample.vavr.tuples;

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
public class TupleSampleTests {

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

        //Tuple2<String, Integer> java8 = Tuple.of("java", 8);
        //String _1 = java8._1;
        //Integer _2 = java8._2;
        //System.out.printf("java8 is %s, %d)\n", _1, _2);
        //
        //Tuple2<String, Integer> that = java8.map(
        //        s -> _1.substring(2) + "vr",
        //        i -> _2 / 8
        //);
        //System.out.println("that is " + that);
        //
        //Tuple2<String, Integer> that1 = java8.map(
        //        (s, integer) -> Tuple.of(s.substring(2) + "vr", integer / 8)
        //);
        //System.out.println("that1 is " + that1);
        //
        //String that2 = java8.apply(
        //        (s, integer) -> s.substring(2) + "vr" + integer / 8
        //);
        //
        //System.out.println("that2 is " + that2);

    }
}
