package org.example.frontend.web;

import org.example.frontend.mobile.android.AndroidSelected;
import org.example.utils.FrontTextDB;
import org.example.utils.InitialPointUtils;
import org.example.utils.ThreadUtils;

import java.util.Locale;
import java.util.Scanner;

public class WebSelected {
    public static void start() {
        InitialPointUtils.setPoint(WebSelected.class.getName());
        startWeb();
    }

    private static void startWeb() {
        showText(0);
        Scanner scanner = new Scanner(System.in);
        int choice1 = scanner.nextInt();
        showText(choice1);
        retry(scanner);
    }

    private static void showText(int choice) {
        ThreadUtils.startThreadWithAction(() -> {
            for (String i : FrontTextDB.webDeveloper(choice)) {
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
            if (answer.toLowerCase(Locale.ROOT).equals("y")) {
                startWeb();
            } else {
                scanner.close();
                ThreadUtils.stopThread();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
