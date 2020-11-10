package com.sockets;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class EchoServer {
    public ServerSocket serverSocket;


    public void start(int port) throws IOException {
        serverSocket = new ServerSocket(port);
        while(true)
            new EchoHandler(serverSocket.accept()).start();



    }
    public static  class  EchoHandler extends  Thread{
        public Socket socket;
        public  PrintWriter out;
        public  BufferedReader in ;
        public  EchoHandler(Socket socket)
        {
            this.socket=socket;
        }


        public  void run() {
            try {
                out = new PrintWriter(socket.getOutputStream(), true);
                in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

                while(in.readLine() != null)
                {
                    if("".equals(in.readLine()))
                    {

                        System.out.println("bye");
                        break;
                    }

                }
            }
            catch ( Exception e){

            }

        }

    }
}
