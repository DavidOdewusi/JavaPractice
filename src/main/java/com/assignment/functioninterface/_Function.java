package com.assignment.functioninterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        int increment = incrementByOne(1);
        System.out.println(increment);

        int increment2 = incrementByOneFunction.apply(1);
        System.out.println(increment2);

        int multiply = multiplyByTenFunction.apply(increment2);
        System.out.println(multiply);

        Function<Integer, Integer> addByOneAndThenMultiplyByTen =
                incrementByOneFunction.andThen(multiplyByTenFunction);
        System.out.println(addByOneAndThenMultiplyByTen.apply(4));

        System.out.println(incrementByOneAndMultiplyBifunction.apply(4, 100));
        System.out.println(incrementByOneAndMultiply(4, 100));
    }
//  Function takes 1 argument and produces 1 result;
    static Function<Integer, Integer> incrementByOneFunction = number -> number +1;
    static Function<Integer, Integer> multiplyByTenFunction = number -> number * 10;
    static int incrementByOne(int num) {
        return num + 1;
    }
//  BiFunction takes 2 arguments and produces 1 result
    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBifunction =
            (num, numToMultiply) -> (num + 1) * numToMultiply;

    static int incrementByOneAndMultiply(int num, int numToMultiply) {
        return (num + 1) * numToMultiply;
    }
}
