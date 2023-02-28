package com.ravenhub.socket.socket;

import java.io.*;
import java.net.Inet4Address;
import java.net.Socket;

/**
 * Протокол TCP
 */
public class SocketRunner {
    public static void main(String[] args) throws IOException {
        var inetAddress = Inet4Address.getByName("localhost");
        try (var socket = new Socket(inetAddress, 7777)) {
            DataOutputStream outputStream = new DataOutputStream(socket.getOutputStream());
            DataInputStream inputStream = new DataInputStream(socket.getInputStream());
            outputStream.writeUTF("Hello world");
            System.out.println("Response from server:" + inputStream.readUTF());

        }
    }
}
