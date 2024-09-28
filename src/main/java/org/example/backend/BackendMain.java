package org.example.backend;

import org.example.backend.c.CSharpSelected;
import org.example.backend.java.JavaSelected;
import org.example.backend.php.PhpSelected;
import org.example.utils.InitialPointUtils;
import org.example.utils.TextDB;
import org.example.utils.ThreadUtils;

import java.util.Locale;
import java.util.Scanner;

public class BackendMain {
    public static void start() {
        InitialPointUtils.setPoint(BackendMain.class.getName());
        ThreadUtils.startThreadWithAction(() -> {
            for (String i: TextDB.mainBackendTextList()) {
                ThreadUtils.sleepUninterruptedly(200);
                System.out.println(i);
            }
        });

        Scanner scanner = new Scanner(System.in);
        String checkSide = scanner.next();

        switch (checkSide.toLowerCase(Locale.ROOT)) {
            case ("ph"):
                PhpSelected.start();
                break;
            case ("j"):
                JavaSelected.start();
                break;
            case ("c"):
                CSharpSelected.start();
                break;
            default:
                System.out.println("Что-то пошло не так, попробуй заново!");
                start();
                break;
        }
    }
}
