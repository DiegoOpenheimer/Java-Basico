package com.openheimer.socket;

import java.io.OutputStream;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class WriteThread extends Thread {

    private PrintStream printStream;

    public WriteThread(OutputStream outputStream) {
        super(WriteThread.class.getName());
        printStream = new PrintStream(outputStream, true);
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(System.in);
        try {
            while (scanner.hasNext()) {
                String value = scanner.nextLine();
                if (value.startsWith("-1")) {
                    break;
                }
                printStream.write(value.getBytes(StandardCharsets.UTF_8));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        scanner.close();
        printStream.close();
    }

}
