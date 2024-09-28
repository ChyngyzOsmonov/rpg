package org.example.utils;

import java.io.*;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Consumer;

public class InitialPointUtils {
    private static final String filePath = "/Users/owner/IdeaProjects/FirstProject/src/main/resources/point.txt";
    private static final String fileLevelPath = "/Users/owner/IdeaProjects/FirstProject/src/main/resources/level.txt";
    private static FileWriter getFOS(String path) throws IOException {
        FileOutputStream fos = new FileOutputStream(path);
        fos.close();
        FileWriter fw = new FileWriter(path);
        return fw;
    }
    public static void setPoint(String str) {
        try {
            FileWriter fw = getFOS(filePath);
            fw.write(str);
            fw.close();
            System.out.println("Удачно сохранил точку запуска");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void setLevel(Integer level) {
        try {
            FileWriter fw = getFOS(fileLevelPath);
            fw.write(level.toString());
            fw.close();
            System.out.println("Удачно сохранил уровень");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void getPoint(Consumer<Map<Boolean, String>> action) {
        try {
            FileReader fr = new FileReader(filePath);
            Scanner scanner = new Scanner(fr);
            String line = scanner.hasNextLine() ? scanner.nextLine() : "";
            action.accept(Map.of(!line.isEmpty(), line));
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void getLevel(Consumer<String> action) {
        try {
            FileReader fr = new FileReader(fileLevelPath);
            Scanner scanner = new Scanner(fr);
            String line = scanner.hasNextLine() ? scanner.nextLine() : "";
            String level = "";
            switch (line) {
                case (""):
                    level = "NO_LEVEL";
                    break;
                case ("6"):
                    level = "SENIOR";
                    break;
                case ("4"):
                    level = "MIDDLE";
                    break;
                case ("3"):
                    level = "JUNIOR";
                    break;
                case ("2"):
                    level = "NO_LEVEL";
                    break;
                case ("1"):
                    level = "NO_LEVEL";
                    break;
                case ("0"):
                    level = "NO_LEVEL";
                    break;

            }
            action.accept(level);
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
