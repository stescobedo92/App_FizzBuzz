# FizzBuzz
The "Fizz-Buzz test" is an interview question designed to help filter out the 99.5% of programming job candidates who can't seem to program their way out of a wet paper bag. The text of the programming assignment is as follows:
"Write a program that prints the numbers from 1 to 100. But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”. For numbers which are multiples of both three and five print “FizzBuzz”."

# The App_FizzBuzz in Java

Prints out the following for a contiguous range of numbers:
* the number
* `fizz` for numbers that are multiples of `3`
* `buzz` for numbers that are multiples of `5`
* `fizzbuzz` for numbers that are multiples of `15`
* if the number contains a `three` output the text `lucky`, overriding any existing behaviour
* report at the end of the program showing how many times each `word` was substituted

## Example

Running the program over a range from (1-100) or (1-20) one should get the following output:

```
1 2 lucky 4 buzz fizz 7 8 fizz buzz 11 fizz lucky 14 fizzbuzz 16 17 fizz 19 buzz

fizz: 4
buzz: 3
fizzbuzz: 1
lucky: 2
integer: 10
```

## Run

```
mvn clean test exec:java
