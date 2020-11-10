package com.sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class GreetServer {

    public ServerSocket serverSocket;
    public Socket clientSocket;
    public PrintWriter printWriter;
    public BufferedReader bufferedReader;

    public void start(int port) throws IOException {
        serverSocket = new ServerSocket(port);
        clientSocket = serverSocket.accept();
        printWriter = new PrintWriter(clientSocket.getOutputStream(), true);
        bufferedReader = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));

        String greet = bufferedReader.readLine();
        if ("hello server".equals(greet)) {
            printWriter.println("hello");
        } else {
            printWriter.println("error");
        }
    }
          public void stop () throws IOException {

            printWriter.close();;
            bufferedReader.close();
            clientSocket.close();;
            serverSocket.close();
        }

    public static void main(String[] args)  {
        GreetServer server = new GreetServer();
        try {
            server.start(6666);
            ;
           // server.stop();
        }
        catch (Exception e)
        {
            System.out.println( e.getStackTrace());

    }




    }


}
