package main;

import gui.UI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class ZeloClient implements Runnable {

    Socket socket = null;
    BufferedReader input;
    PrintWriter output;
    UI ui;
    Thread clientThread;
    boolean isConnected;

    public ZeloClient(UI ui) {
        this.ui = ui;
        isConnected = false;
        clientThread = new Thread(this);
        clientThread.start();

    }

    public void sendMessage(String message) {
        if (!isConnected) {
            ui.writeChatLog(message + " - chưa gửi!\n");
        } else {
            output.println(message);
            ui.writeChatLog("Me: "+message + "\n");
        }
        //ui.writeChatLog(message);
    }

    @Override
    public void run() {
        while (!isConnected) {
            //ket noi den server
            try {
                socket = new Socket("localhost", 8080);
                isConnected = true;
            } catch (IOException ex) {
                isConnected = false;
                ui.writeChatLog("Try to connect to server...\n");
                sleep(1000);
            }

            if (isConnected)
            try {
                ui.writeChatLog("Connected to chat server.\n");
                System.out.println("Connected to chat server.");

                input = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                output = new PrintWriter(socket.getOutputStream(), true);

                String response;
                while (isConnected) {
                    response = input.readLine();
                    if (response != null) {
                        System.out.println("Server says: " + response);
                        ui.writeChatLog(response + "\n");
                    }
                }
            } catch (IOException e) {
                ui.writeChatLog("Disconnected to chat server.\n");
                isConnected = false;
            }
        }
    }

    public void sleep(long mili) {
        try {
            Thread.sleep(mili);
        } catch (InterruptedException ex) {
        }
    }
}
