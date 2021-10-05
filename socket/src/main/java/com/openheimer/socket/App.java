package com.openheimer.socket;

import io.github.cdimascio.dotenv.Dotenv;

import java.net.Socket;

public class App {

    private static Dotenv dotenv = Dotenv
            .configure()
            .directory(".env")
            .load();

    public static void main(String[] args) throws Exception {
        String host = dotenv.get("host");
        String port = dotenv.get("port");
        Socket socket = new Socket(host, Integer.parseInt(port));
        ReadThread readThread = new ReadThread(socket.getInputStream());
        WriteThread writeThread = new WriteThread(socket.getOutputStream());
        readThread.start();
        writeThread.start();
        System.out.println("Connected in host: " + host + " and port: " + port);
    }

}
