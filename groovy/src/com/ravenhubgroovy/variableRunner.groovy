package com.ravenhubgroovy

import java.sql.Date as SqlDate // Можно использовать allies

class variableRunner {
    /**
     */
    static void main(String[] args) {
        Integer value = 5; // В groovy нет примитивных типов данных
        int inttest = 5; // Автоматические оборачивается в Intenger
        BigInteger valueBig = 36G
        new SqlDate()
        def defvalue = "sdgsgsfd"; // Динамическая переменная
    }

    void operators() {
        assert  1+2 == 3
        assert  4 -3 == 1
        assert  4 * 3 == 12
        assert  3 / 2 == 1.5
        assert  10 % 3 == 1
        assert  4**3 == 64
    }
}
