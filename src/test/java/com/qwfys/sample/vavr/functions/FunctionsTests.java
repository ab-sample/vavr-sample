package com.qwfys.sample.vavr.functions;

import io.vavr.Function1;
import io.vavr.Function2;
import io.vavr.control.Option;
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
    void _a005() {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>");

        Function2<Integer, Integer, Integer> sum = (a, b) -> a + b;
        Function1<Integer,Integer> add2 = sum.apply(2);
        //AbstractIntegerAssert<?> equalTo1 = then(add2.apply(4)).isEqualTo(6);
        //System.out.println(equalTo1);
        AbstractIntegerAssert<?> anAssert = then(add2.apply(4));
        System.out.println("anAssert is"+anAssert);

        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<");
    }

    @Test
    void _a004() {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>");

        Functions functions = new Functions();

        Function2<Integer, Integer, Option<Integer>> sum = Function2.lift(functions::sum);

        Option<Integer> optionalResult = sum.apply(-1, 2);
        Integer orNull = optionalResult.getOrNull();
        System.out.println("optionalResult is " + optionalResult);
        System.out.println("orNull is " + orNull);

        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<");
    }

    @Test
    void _a003() {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>");

        Function2<Integer, Integer, Integer> divide = (a, b) -> a / b;

        Function2<Integer, Integer, Option<Integer>> safeDivide = Function2.lift(divide);

        Option<Integer> i1 = safeDivide.apply(1, 0);
        Option<Integer> i2 = safeDivide.apply(4, 2);

        System.out.println("i1 is " + i1);
        System.out.println("i2 is " + i2);
        Integer i2Value = i2.get();
        System.out.println("i2Value is " + i2Value);

        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<");
    }

    @Test
    void _a002() {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>");

        Function1<Integer, Integer> plusOne = a -> a + 1;
        Function1<Integer, Integer> multiplyByTwo = a -> a * 2;
        Function1<Integer, Integer> add1AndMultiplyBy2 = plusOne.andThen(multiplyByTwo);
        AbstractIntegerAssert<?> equalTo1 = then(add1AndMultiplyBy2.apply(2)).isEqualTo(6);

        Function1<Integer, Integer> _add1AndMultiplyBy2 = multiplyByTwo.compose(plusOne);
        AbstractIntegerAssert<?> equalTo2 = then(_add1AndMultiplyBy2.apply(2)).isEqualTo(6);

        System.out.println(equalTo1);
        System.out.println(equalTo2);

        //Function3<String,String,String,String> function3= Function3.of(this::methodWhichAccepts3Parameters);

        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<");
    }

    @Test
    void _a001() {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>");

        Function2<Integer, Integer, Integer> sum = (a, b) -> a + b;

        Function2<Integer, Integer, Integer> sum1 = new Function2<Integer, Integer, Integer>() {
            @Override
            public Integer apply(Integer _1, Integer _2) {
                return _1 + _2;
            }
        };

        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<");
    }

}
