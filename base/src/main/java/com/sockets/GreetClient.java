package com.sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class GreetClient {

    public Socket socket;
    public PrintWriter printWriter;
    public BufferedReader bufferedReader;

    public void startConnection(String ip, String port) throws IOException {
        socket = new Socket(ip, Integer.parseInt(port));
        printWriter = new PrintWriter(socket.getOutputStream(),true);
        bufferedReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));

    }
    public  String sendMessage(String message) throws IOException {
        printWriter.println(message);
        String resp = bufferedReader.readLine();
        return resp;
    }
    public void closeConnection() throws IOException {
        printWriter.close();
        bufferedReader.close();
        socket.close();
    }

    public static void main(String[] args) throws IOException {
        GreetClient client = new GreetClient();
        client.startConnection("127.0.0.1", "6666");
        String response = client.sendMessage("hello server");
        System.out.println(response);

    }

}
