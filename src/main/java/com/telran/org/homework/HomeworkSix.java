package com.telran.org.homework;

import java.util.Random;

public class HomeworkSix {
        public static void main (String[]args){
            Random random = new Random();
            int n = random.nextInt(28800);

            System.out.println("Осталось секунд: " + n);
            printRemainingTime(n);
        }

        public static void printRemainingTime ( int seconds){
            int hours = seconds / 3600;

            if (hours > 1) {
                System.out.println("Осталось " + hours + " часов");
            } else if (hours == 1) {
                System.out.println("Остался 1 час");
            } else {
                System.out.println("Осталось менее часа");
            }
        }
    }