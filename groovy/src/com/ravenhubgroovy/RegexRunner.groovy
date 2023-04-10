package com.ravenhubgroovy

import java.util.regex.Matcher
import java.util.regex.Pattern

class RegexRunner {
    static void main(String[] args) {
        String value = "one 2 two 22 three 33";
       // def regex = "\\w+ \\d+" // Java
        String regex = /\w+ \d+/
        Pattern pattern = Pattern.compile(regex)
        Matcher matcher = pattern.matcher(value)

        matcher.matches() // Возращает boolean используется полное соотсвествие
        matcher.find() // Возвращает boolean
        matcher.group() // Возвращает найденную группу(подтекст) в строке(если она есть), если группы нет, то всю строку

        matcher.each {group -> println(group)}
    }
}
