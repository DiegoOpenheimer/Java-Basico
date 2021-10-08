package com.openheimer.server_socket;

import java.io.PrintStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.Random;
import java.util.Scanner;

public class ConsumerClient implements Runnable {

    private Socket socket;
    private OnFinish onFinish;

    public ConsumerClient(Socket socket, OnFinish onFinish) {
        this.socket = socket;
        this.onFinish = onFinish;
    }

    @Override
    public void run() {
        try {
            Scanner scanner = new Scanner(socket.getInputStream());
            PrintStream printStream = new PrintStream(socket.getOutputStream(), true);
            while (scanner.hasNext()) {
                String value = scanner.nextLine();
                System.out.println("VALUE: " + value);
                if (value.startsWith("-1")) {
                    socket.close();
                    break;
                }
                if (value.startsWith("down")) {
                    socket.close();
                    onFinish.invoke();
                    break;
                }
                new Thread(() -> {
                    try {
                        Thread.sleep(500);
                        Random random = new Random();
                        StringBuilder stringBuilder = new StringBuilder();
                        stringBuilder
                                .append("ID generated: ")
                                .append(random.nextInt(1000));
                        printStream.write(stringBuilder.toString().getBytes(StandardCharsets.UTF_8));
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }).start();
            }
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
