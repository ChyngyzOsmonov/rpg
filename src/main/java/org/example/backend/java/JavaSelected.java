package org.example.backend.java;

import org.example.utils.CheckLevelUtils;
import org.example.utils.InitialPointUtils;
import org.example.utils.TextDB;
import org.example.utils.ThreadUtils;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class JavaSelected {
    public static void start() {
        InitialPointUtils.setPoint(JavaSelected.class.getName());
        InitialPointUtils.getLevel(JavaSelected::determineWhatNext);
    }

    private static void determineWhatNext(String level) {
        if (level.equals("NO_LEVEL")) {
            InitialPointUtils.setLevel(CheckLevelUtils.takeTest());
            startJava(level);
        } else {
            startJava(level);
        }
    }

    private static void startJava(String level) {
        System.out.println(level);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Тебе поручили работу над реальным проектом для крупного заказчика. Успешное выполнение проекта — ключ к твоему росту, но провал может закончиться увольнением.");

        switch (level) {
            case "JUNIOR":
                showText("JUNIOR", 0);

                int choice1 = scanner.nextInt();

                if (choice1 == 1) {
                    showText("JUNIOR",1);
                } else if (choice1 == 2) {
                    showText("JUNIOR",2);
                } else {
                    showText("JUNIOR",3);
                }
                break;

            case "MIDDLE":
                showText("MIDDLE", 0);
                int choice2 = scanner.nextInt();

                if (choice2 == 1) {
                    showText("MIDDLE", 1);
                } else if (choice2 == 2) {
                    showText("MIDDLE", 2);
                } else {
                    showText("MIDDLE", 3);
                }
                break;

            case "SENIOR":
                showText("SENIOR", 0);
                int choice3 = scanner.nextInt();

                if (choice3 == 1) {
                    showText("SENIOR", 1);
                } else if (choice3 == 2) {
                    showText("SENIOR", 2);
                } else {
                    showText("SENIOR", 3);
                }
                break;
        }
        retry(scanner);
    }

    private static void showText(String level, int choice) {
        ThreadUtils.startThreadWithAction(() -> {
            for (String i : getTextsByLevel(level, choice)) {
                ThreadUtils.sleepUninterruptedly(2000L);
                System.out.println(i);
            }
        });
    }

    private static List<String> getTextsByLevel(String level, int choice) {
        if (level.equals("JUNIOR")) {
            return TextDB.javaJunior(choice);
        } else if (level.equals("MIDDLE")) {
            return TextDB.javaMiddle(choice);
        } else if (level.equals("SENIOR")) {
            return TextDB.javaSenior(choice);
        } else {
            return TextDB.defaultTextWeakLevel();
        }
    }

    private static void retry(Scanner scanner) {
        try {
            Thread.sleep(3000);
            System.out.println("Попробовать еще раз? Если да выбери У, если нет N");
            String answer = scanner.next();
            if (answer.toLowerCase(Locale.ROOT).equals("y") || answer.toLowerCase(Locale.ROOT).equals("у")) {
                start();
            } else {
                scanner.close();
                ThreadUtils.stopThread();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
