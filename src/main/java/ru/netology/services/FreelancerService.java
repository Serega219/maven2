package ru.netology.services;

public class FreelancerService {

    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счетчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счетчик месяцев отдыха
                money = money - expenses; // тратим деньги на расходы
                money = money / 3; // уменьшаем сбережения в три раза
            } else {
                money = money + income; // зарабатываем деньги на доход
                money = money - expenses; // тратим деньги на расходы
            }
        }
        return count;
    }
}

