package com.ravenhub.socket.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

/**
 * Вызывается при каждом запросе на сервер
 */
@WebFilter("/*") // Фильтр будет срабатывать для всех запросов
public class CharsetFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        servletRequest.setCharacterEncoding(StandardCharsets.UTF_8.name()); // Базовый класс
        servletResponse.setCharacterEncoding(StandardCharsets.UTF_8.name());// Установили для всех сервлетов вилтер на запрос и ответ
        filterChain.doFilter(servletRequest, servletResponse); // Знает всю цепочку вызовов фильтров

     }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }
}
