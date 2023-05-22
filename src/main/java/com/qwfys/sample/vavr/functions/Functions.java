package com.qwfys.sample.vavr.functions;

/**
 * @author liuwenke
 * @since 0.0.1
 */
public class Functions {

    public int sum(int first,int second) {
        if (first < 0 || second < 0) {
            throw new IllegalArgumentException("Only positive integers are allowed");
        }
        return first + second;
    }

}
