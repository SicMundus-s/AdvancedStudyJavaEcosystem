package com.ravenhub.socket.client;

import java.io.IOException;
import java.net.URL;

public class UrlExample {

    public static void main(String[] args) throws IOException {
        checkGoogle();
    }

    private static void checkGoogle() throws IOException {
        var url = new URL("https://www.google.com");
        var urlConnection = url.openConnection();

//        urlConnection.setDoOutput(true);
//        try (var outputStream = urlConnection.getOutputStream()) {
//        }

        System.out.println(urlConnection.getHeaderFields());
    }
}