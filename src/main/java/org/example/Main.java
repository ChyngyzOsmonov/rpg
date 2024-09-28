package org.example;

import org.example.backend.BackendMain;
import org.example.backend.c.CSharpSelected;
import org.example.backend.java.JavaSelected;
import org.example.backend.php.PhpSelected;
import org.example.frontend.FrontendMain;
import org.example.frontend.mobile.android.AndroidSelected;
import org.example.frontend.mobile.ios.IosSelected;
import org.example.frontend.web.WebSelected;
import org.example.utils.InitialPointUtils;
import org.example.utils.TextDB;
import org.example.utils.ThreadUtils;

import java.util.Locale;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        InitialPointUtils.getPoint(Main::setupInitialPoint);
    }

    private static void setupInitialPoint(Map<Boolean, String> map) {
        for (var entry : map.entrySet()) {
            if (entry.getKey()) {
                startWithInitialPoint(entry.getValue());
            } else {
                startApplication();
            }
        }
    }

    private static void startApplication() {
        ThreadUtils.startThreadWithAction(() -> {
            for (String i: TextDB.mainTextList()) {
                ThreadUtils.sleepUninterruptedly(200L);
                System.out.println(i);
            }
        });

        Scanner scanner = new Scanner(System.in);
        String checkSide = scanner.next();

        switch (checkSide.toLowerCase(Locale.ROOT)) {
            case ("b"):
                BackendMain.start();
                break;
            case ("f"):
                FrontendMain.start();
                break;
            default:
                System.out.println("Что-то пошло не так, попробуй заново!");
        }
    }

    private static void startWithInitialPoint(String point) {
        System.out.println(point);
        if (point.equals(BackendMain.class.getName())) {
            BackendMain.start();
        } else if (point.equals(FrontendMain.class.getName())) {
            FrontendMain.start();
        }
        else if (point.equals(WebSelected.class.getName())) {
            WebSelected.start();
        }
        else if (point.equals(AndroidSelected.class.getName())) {
            AndroidSelected.start();
        }
        else if (point.equals(IosSelected.class.getName())) {
            IosSelected.start();
        }
        else if (point.equals(JavaSelected.class.getName())) {
            JavaSelected.start();
        }
        else if (point.equals(CSharpSelected.class.getName())) {
            CSharpSelected.start();
        }
        else if (point.equals(PhpSelected.class.getName())) {
            PhpSelected.start();
        }
        else {
            System.out.println("Не смогли открыть с точки сохранения!");
        }
    }
}