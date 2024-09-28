package org.example.frontend;

import org.example.frontend.mobile.android.AndroidSelected;
import org.example.frontend.mobile.ios.IosSelected;
import org.example.frontend.web.WebSelected;
import org.example.utils.FrontTextDB;
import org.example.utils.InitialPointUtils;
import org.example.utils.ThreadUtils;

import java.util.Locale;
import java.util.Scanner;

public class FrontendMain {
    public static void start() {
        InitialPointUtils.setPoint(FrontendMain.class.getName());
        ThreadUtils.startThreadWithAction(() -> {
            for (String i: FrontTextDB.mainFrontendTextList()) {
                ThreadUtils.sleepUninterruptedly(200);
                System.out.println(i);
            }
        });

        Scanner scanner = new Scanner(System.in);
        String checkSide = scanner.next();

        switch (checkSide.toLowerCase(Locale.ROOT)) {
            case ("a"):
                AndroidSelected.start();
                break;
            case ("i"):
                IosSelected.start();
                break;
            case ("w"):
                WebSelected.start();
                break;
            default:
                System.out.println("Что-то пошло не так, попробуй заново!");
                start();
                break;
        }
    }
}
