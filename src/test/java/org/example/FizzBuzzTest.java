package org.example;

import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static com.fizzbuzz.FizzBuzz.fizzBuzz;
import static com.fizzbuzz.FizzBuzz.frequencies;
import static com.fizzbuzz.FizzBuzz.realFizzBuzz;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class FizzBuzzTest {
    private static final String EXPECTED_OUTPUT = "1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz";

    @Test
    public void multiplesOf3_shouldReturnFizz() {
        assertThat(fizzBuzz(9), is("fizz"));
        assertThat(fizzBuzz(12), is("fizz"));
        assertThat(fizzBuzz(18), is("fizz"));
        assertThat(fizzBuzz(21), is("fizz"));
    }

    @Test
    public void multiplesOf5_shouldReturnBuzz() {
        assertThat(fizzBuzz(5), is("buzz"));
        assertThat(fizzBuzz(10), is("buzz"));
        assertThat(fizzBuzz(20), is("buzz"));
        assertThat(fizzBuzz(25), is("buzz"));
    }

    @Test
    public void multiplesOf15_shouldReturnFizzbuzz() {
        assertThat(fizzBuzz(15), is("fizzbuzz"));
        assertThat(fizzBuzz(45), is("fizzbuzz"));
        assertThat(fizzBuzz(60), is("fizzbuzz"));
        assertThat(fizzBuzz(75), is("fizzbuzz"));
    }

    @Test
    public void numberWithDigit3_shouldReturnLucky() {
        assertThat(fizzBuzz(3), is("lucky"));
        assertThat(fizzBuzz(13), is("lucky"));
        assertThat(fizzBuzz(23), is("lucky"));
        assertThat(fizzBuzz(30), is("lucky"));
    }

    @Test
    public void realFizzBuzzfrequencies_shouldBeSummedUp() {
        Map<String, Long> freq = frequencies(EXPECTED_OUTPUT);
        assertThat(freq.get("fizz"), is(4L));
        assertThat(freq.get("buzz"), is(3L));
        assertThat(freq.get("fizzbuzz"), is(1L));
        assertThat(freq.get("lucky"), is(2L));
        assertThat(freq.get("integer"), is(10L));
    }

    @Test
    public void realFizzBuzz_shouldReturnExpectedOutput() {
        List<Integer> list = IntStream.range(1,21).distinct().boxed().collect(Collectors.toList());
        assertThat(realFizzBuzz(list), is(EXPECTED_OUTPUT));
    }
}
