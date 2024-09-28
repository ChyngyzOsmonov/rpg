package org.example.utils;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadUtils {
    private static ExecutorService executor = Executors.newSingleThreadExecutor();
    private static long startTime;
    private static long endTime;

    public static void startThreadWithAction(Runnable action) {
        if (!executor.isShutdown()) { // Check if the executor is active
            executor.submit(action);
            startTime = System.currentTimeMillis();
        } else {
            System.out.println("Игра уже запущена и не может быть запущен заново");
        }
    }

    public static void startThreadWithAction(long delay, Runnable action) {
        if (!executor.isShutdown()) {
            executor.submit(() -> {
                if (delay > 0) {
                    try {
                        Thread.sleep(delay);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        throw new RuntimeException("Thread was interrupted", e);
                    }
                }
                action.run();
            });
        } else {
            System.out.println("Игра уже запущена и не может быть запущен заново");
        }
    }

    public static void sleepUninterruptedly(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("Thread was interrupted", e);
        }
    }

    public static void stopThread() {
        if (!executor.isShutdown()) {
            executor.shutdown();
            endTime = System.currentTimeMillis();
            long spentTime = endTime - startTime;
            System.out.println("Игра закончена, вы играли " + TimeUnit.MILLISECONDS.toSeconds(spentTime) + " секунд");
        } else {
            System.out.println("Игра уже была закрыта");
        }
    }

    // Option to restart the executor if needed
    public static void restartExecutor() {
        if (executor.isShutdown()) {
            executor = Executors.newSingleThreadExecutor();
            System.out.println("Executor service restarted.");
        } else {
            System.out.println("Executor is already running.");
        }
    }
}
