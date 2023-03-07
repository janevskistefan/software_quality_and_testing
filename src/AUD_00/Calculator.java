package AUD_00;

import java.util.function.BiFunction;

class Calculator {
    BiFunction<Integer, Integer, Integer> addition = Integer::sum;
    BiFunction<Integer, Integer, Integer> subtraction = (a, b) -> a - b;
    BiFunction<Integer, Integer, Integer> division = (a, b) -> a / b;

}
