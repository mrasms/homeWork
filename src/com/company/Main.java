package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(firstMethod(48, 3));     // строки 6-10 вызов результата основного ДЗ
        System.out.println(firstMethod(12, -1));
        System.out.println(firstMethod(50, -15));
        System.out.println(firstMethod(18, 21));
        System.out.println(firstMethod(25, 31));

        System.out.println(firstMethod(generateRandomAge(),23)); // строка вызова результата доп. ДЗ
    }

    public static String firstMethod(int age, int outsideTemperature) {
        //int age = generateRandomAge;
        if ((age >= 20 && age <= 45) && (outsideTemperature >= -20 && outsideTemperature <= 30)) {
            return "Можно идти гулять";

        } else if (age > 45 && (outsideTemperature >= -10 && outsideTemperature <= 25)) {
            return "Можно идти гулять";

        } else if (age < 20 && (outsideTemperature >= 0 && outsideTemperature <= 28)) {
            return "Можно идти гулять";

        } else return "Оставайтесь дома";
    }

    public static int generateRandomAge() {
        int randomValue = (int) (Math.random()*(122)); // самый старый человек по данным википедии прожил 122 года (Жанна Кальман)
        return randomValue;

    }
}


