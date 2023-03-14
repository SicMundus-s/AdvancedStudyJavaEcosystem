package com.ravenhub.socket.servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

@WebServlet("/download")
public class DownloadServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // Устанавливаем хеддеры
        resp.setHeader("Content-Disposition", "attachment; filename=\"filename.txt\"");
        resp.setContentType("application/json");
        resp.setCharacterEncoding(StandardCharsets.UTF_8.name());


        // Через рефлексию получаем ресурсы класса, так как приложение крутится в томкате, то через обычный file не получится
        try (var outputStream = resp.getOutputStream();
             var stream = DownloadServlet.class.getClassLoader().getResourceAsStream("first.json")) {
            outputStream.write(stream.readAllBytes());
        }
    }
}
