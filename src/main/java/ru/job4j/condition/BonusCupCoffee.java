package ru.job4j.condition;

public class BonusCupCoffee {
    public static int countCup(int count, int n) {
        int summCountCup = 0;
        int countFreeCup = 0;
        countFreeCup = count / n;
        summCountCup = count + countFreeCup;
        return summCountCup;
    }
}