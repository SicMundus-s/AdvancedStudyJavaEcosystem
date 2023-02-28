package com.ravenhub.socket.socket;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;

public class SocketServerRunner  {
    public static void main(String[] args) throws IOException {
        try (var serverSocket = new ServerSocket(7777);
        var socket = serverSocket.accept();
        var dataOutput = new DataOutputStream(socket.getOutputStream());
        var input = new DataInputStream(socket.getInputStream())) {
            System.out.println("CLient response: " + input.readUTF());
            dataOutput.writeUTF("response server");
        }
    }
}
