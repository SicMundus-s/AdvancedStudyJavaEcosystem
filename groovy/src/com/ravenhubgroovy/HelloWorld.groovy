package com.ravenhubgroovy

import java.sql.DriverManager

class HelloWorld {
    Integer value; // по умолчанию - private
    static void main(String[] args) { // Модификатор доступа по умолчанию - public
        println("Hello World")
        String value = String.class
        Class<String> clazz = value.getClass();
        println(clazz.getClass())
        println(DriverManager.class.getClassLoader())
        println(HelloWorld.class.getClassLoader())


    }
}
