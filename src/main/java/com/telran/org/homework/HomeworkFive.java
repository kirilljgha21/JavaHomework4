package com.telran.org.homework;

public class HomeworkFive {
        public static void main(String[] args) {
            double m = 10.5;
            double n = 10.45;
            findClosestToTen(m, n);

            m = 9;
            n = 12;
            findClosestToTen(m, n);

            m = 10.1;
            n = 9.9;
            findClosestToTen(m, n);
        }

    public static void findClosestToTen(double m, double n) {
        double diffM;
        if (m >= 10) {
            diffM = m - 10;
        } else {
            diffM = 10 - m;
        }

        double diffN;
        if (n >= 10) {
            diffN = n - 10;
        } else {
            diffN = 10 - n;
        }

        if (diffM < diffN) {
            System.out.println("Число " + m + " ближе к 10.");
        } else if (diffN < diffM) {
            System.out.println("Число " + n + " ближе к 10.");
        } else {
            System.out.println("Оба числа равно близки к 10.");
        }
      }
    }