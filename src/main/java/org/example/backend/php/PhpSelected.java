package org.example.backend.php;

import org.example.utils.InitialPointUtils;
import org.example.utils.TextDB;
import org.example.utils.ThreadUtils;

import java.util.Locale;
import java.util.Scanner;

public class PhpSelected {
    public static void start() {
        InitialPointUtils.setPoint(PhpSelected.class.getName());
        startPhp();
    }

    private static void startPhp() {
        showText(0);
        Scanner scanner = new Scanner(System.in);
        int choice1 = scanner.nextInt();
        showText(choice1);
        System.out.println("Эржан, Эржан, просыпайся, на работу пора");
        for (String line : TextDB.phpDream()) {
            System.out.println(line);
        }
        retry(scanner);
    }

    private static void showText(int choice) {
        ThreadUtils.startThreadWithAction(() -> {
            for (String i : TextDB.phpDeveloper(choice)) {
                ThreadUtils.sleepUninterruptedly(2000L);
                System.out.println(i);
            }
        });
    }

    private static void retry(Scanner scanner) {
        try {
            Thread.sleep(3000);
            System.out.println("Попробовать еще раз? Если да выбери У, если нет N");
            String answer = scanner.next();
            if (answer.toLowerCase(Locale.ROOT).equals("y") || answer.toLowerCase(Locale.ROOT).equals("у")) {
                startPhp();
            } else {
                scanner.close();
                ThreadUtils.stopThread();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
