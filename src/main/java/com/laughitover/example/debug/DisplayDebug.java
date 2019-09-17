package com.laughitover.example.debug;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * <p>Description: 远程debug演示</p>
 * @author laughitover
 * @date 2019/9/12
 */
@Component
public class DisplayDebug {

    @Scheduled(cron = "5/10 * * * * ?")
    public static void display(){
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("time"+dateTimeFormatter.format(localDateTime));

        int i = localDateTime.getYear();
        int j = localDateTime.getSecond();
        int sum = add(i, j);
        System.out.println(sum);

        sum = 0;
        for(i=0; i<= 100; i++){
            sum += i;
        }
        System.out.println(sum);
    }

    public static int add(int i, int j){
        int sum = i + j;
        return sum;
    }

    public static void main(String[] args) {
        display();
    }
}
