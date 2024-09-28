package org.example.frontend.mobile.android;

import org.example.utils.FrontTextDB;
import org.example.utils.InitialPointUtils;
import org.example.utils.ThreadUtils;

import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class AndroidSelected {
    public static void start() {
        InitialPointUtils.setPoint(AndroidSelected.class.getName());
        startAndroid();
    }

    private static void startAndroid() {
        showText(0, true);
        Scanner scanner = new Scanner(System.in);
        int choice1 = scanner.nextInt();
        showText(choice1, true);
        retry(true, scanner);
    }

    private static void startAndroidPart2() {
        showText(0, false);
        Scanner scanner = new Scanner(System.in);
        int choice1 = scanner.nextInt();
        showText(choice1, false);
        retry(false, scanner);
    }

    private static void showText(int choice, boolean isFirst) {
        List<String> texts;
        if (isFirst) {
            texts = FrontTextDB.androidDeveloper(choice);
        } else {
            texts = FrontTextDB.androidPart2(choice);
        }
        ThreadUtils.startThreadWithAction(() -> {
            for (String i : texts) {
                ThreadUtils.sleepUninterruptedly(2000L);
                System.out.println(i);
            }
        });
    }

    private static void retry(boolean isFirst, Scanner scanner) {
        try {
            Thread.sleep(3000);
            System.out.println("Попробовать еще раз? Если да выбери У, если нет N");
            String answer = scanner.next();
            if (answer.toLowerCase(Locale.ROOT).equals("y") || answer.toLowerCase(Locale.ROOT).equals("у")) {
                if (isFirst) startAndroid(); else startAndroidPart2();
            } else {
                if (isFirst) startAndroidPart2(); else {
                    scanner.close();
                    ThreadUtils.stopThread();
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
