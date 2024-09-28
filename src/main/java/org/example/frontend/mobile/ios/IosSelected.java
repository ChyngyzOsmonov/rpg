package org.example.frontend.mobile.ios;

import org.example.backend.php.PhpSelected;
import org.example.utils.FrontTextDB;
import org.example.utils.InitialPointUtils;
import org.example.utils.TextDB;
import org.example.utils.ThreadUtils;

import java.util.Locale;
import java.util.Scanner;

public class IosSelected {
    public static void start() {
        InitialPointUtils.setPoint(IosSelected.class.getName());
        startIos();
    }

    private static void startIos() {
        showText(0);
        Scanner scanner = new Scanner(System.in);
        int choice1 = scanner.nextInt();
        showText(choice1);
        retry();
    }

    private static void showText(int choice) {
        ThreadUtils.startThreadWithAction(() -> {
            for (String i : FrontTextDB.iosDeveloper(choice)) {
                ThreadUtils.sleepUninterruptedly(2000L);
                System.out.println(i);
            }
        });
    }

    private static void retry() {
        try {
            Thread.sleep(3000);
            System.out.println("Попробовать еще раз? Если да выбери У, если нет N");
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.next();
            if (answer.toLowerCase(Locale.ROOT).equals("y") || answer.toLowerCase(Locale.ROOT).equals("у")) {
                startIos();
            } else {
                ThreadUtils.stopThread();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
