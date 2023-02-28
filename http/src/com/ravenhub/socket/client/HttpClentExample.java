package com.ravenhub.socket.client;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HttpClentExample {
    public static void main(String[] args) throws IOException, InterruptedException {
        var httpClient = HttpClient.newHttpClient();

        HttpRequest httpRequest = HttpRequest.
                newBuilder(URI.create("https://www.google.com")).
                build();

        var response = httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString());
        System.out.println(response.headers());
        System.out.println(response.body());
    }
}
