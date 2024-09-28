package org.example.utils;

import java.util.Scanner;

public class CheckLevelUtils {
    static Scanner scanner = new Scanner(System.in);
    public static int takeTest() {
        System.out.println("Для выбора просто вводите число");
        int score = 0;
        System.out.println("Вопрос 1: Что такое переменная?");
        System.out.println("1. Место для хранения данных.");
        System.out.println("2. Условие.");
        System.out.println("3. Функция.");

        int answer1 = scanner.nextInt();
        if (answer1 == 1) score++;

        System.out.println("Вопрос 2: Какой оператор используется для сравнения?");
        System.out.println("1. =");
        System.out.println("2. == ");
        System.out.println("3. %");

        int answer2 = scanner.nextInt();
        if (answer2 == 2) score++;

        System.out.println("Вопрос 3: Что такое цикл?");
        System.out.println("1. Конструкция, выполняющаяся много раз.");
        System.out.println("2. Массив.");
        System.out.println("3. Класс.");

        int answer3 = scanner.nextInt();
        if (answer3 == 1) score++;

        System.out.println("Вопрос 4: ООП это?");
        System.out.println("1. Общество объедененных программистов");
        System.out.println("2. Объектно ориентированная программа");
        System.out.println("3. Объектно ориентированная программирование");

        int answer4 = scanner.nextInt();
        if (answer4 == 3) score++;

        System.out.println(" Вопрос 4: Что такое SOLID?");
        System.out.println("1. Совокупность методов оптимизации кода.");
        System.out.println("2. Это принципы разработки программного обеспечения.");
        System.out.println("3. Объектно-ориентированное программирование.");
        System.out.println("4. Модель данных для хранения информации.");

        int answer5 = scanner.nextInt();
        if (answer5 == 2) score++;

        System.out.println("Вопрос 4: Что такое Git?");
        System.out.println("1. Система управления версиями.");
        System.out.println("2. База данных.");
        System.out.println("3. Программа для тестирования.");
        System.out.println("4. Фреймворк для разработки.");

        int answer6 = scanner.nextInt();
        if (answer6 == 1) score++;

        return score;
    }
}
