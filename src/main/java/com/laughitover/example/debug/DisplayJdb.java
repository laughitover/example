package com.laughitover.example.debug;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Function;

/**
 * @author laughitover
 */
public class DisplayJdb {

    public static void display() {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("DateTime :" + dateTimeFormatter.format(localDateTime));

        int year = localDateTime.getYear();
        int second = localDateTime.getSecond();
        int sum = add(year, x -> x + second);
        System.out.println(sum);

        sum = 0;
        for (int i = 0; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static int add(int i, Function<Integer, Integer> fun) {
        return fun.apply(i);
    }

    public static void main(String[] args) {
        display();
    }
}
