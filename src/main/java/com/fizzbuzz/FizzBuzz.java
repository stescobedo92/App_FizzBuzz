package com.fizzbuzz;

import java.util.List;
import java.util.Map;
import java.util.Optional;

import static java.util.Arrays.stream;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.*;
import static org.apache.commons.lang3.StringUtils.isNumeric;

public class FizzBuzz {
    public static String fizzBuzz(Integer number) {
        return Optional.of(number).map(n -> {
            if (n.toString().contains("3")) return "lucky";
            else if (n % 15 == 0) return "fizzbuzz";
            else if (n % 3 == 0) return "fizz";
            else if (n % 5 == 0) return "buzz";
            else return n.toString();
        }).get();
    }

    public static String realFizzBuzz(List<Integer> list) {
        return list.stream()
                .map(number -> fizzBuzz(number))
                .collect(joining(" "));
    }

    public static Map<String, Long> frequencies(String output) {
        Map<String, Long> frequencies = stream(output.split(" ")).filter(w -> !isNumeric(w)).collect(groupingBy(identity(), counting()));
        frequencies.put("integer", stream(output.split(" ")).filter(w -> !isNumeric(w)).count());
        return frequencies;
    }
}
