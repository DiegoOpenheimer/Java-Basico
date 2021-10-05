package com.openheimer.socket;

import java.io.InputStream;
import java.util.Scanner;

public class ReadThread extends Thread {

    private InputStream inputStream;

    public ReadThread(InputStream inputStream) {
        super(ReadThread.class.getName());
        this.inputStream = inputStream;
    }

    @Override
    public void run() {
        Scanner scanner = new Scanner(inputStream);
        while (scanner.hasNext()) {
            String value = scanner.next();
            System.out.println("Value read: " + value);
        }
        scanner.close();
    }
}
