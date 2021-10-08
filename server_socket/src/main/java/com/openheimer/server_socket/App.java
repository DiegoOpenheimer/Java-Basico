package com.openheimer.server_socket;

import io.github.cdimascio.dotenv.Dotenv;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {

    private static Dotenv dotenv = Dotenv
            .configure()
            .directory(".env")
            .load();

    public static void main(String[] args) {
        String port = dotenv.get("port");
        try {
            ServerSocket serverSocket = new ServerSocket(Integer.parseInt(port));
            System.out.println("Server started on port: " + port + "...");
            run(serverSocket);
        } catch (Exception e) {
            System.out.println("Server close " + e.getMessage());
        }
        System.out.println("Finish...");
    }

    private static void run(ServerSocket serverSocket) throws Exception {
        String nThreads = dotenv.get("nThreads");
        ExecutorService executorService = Executors.newFixedThreadPool(Integer.parseInt(nThreads));
        while (true) {
            Socket socket = serverSocket.accept();
            executorService.execute(new ConsumerClient(socket, () -> {
                try {
                    System.exit(0);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }));
        }
    }

}
