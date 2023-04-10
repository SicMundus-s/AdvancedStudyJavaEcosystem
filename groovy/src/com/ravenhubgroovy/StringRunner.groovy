package com.ravenhubgroovy

class StringRunner {
    static void main(String[] args) {
        def name = "Izek"
        def string = "Hello $name"

        def valueString = """ 
        base string
        and
        value
        """

        println name[1]
        println name[-1]
        println name * 3
        println name - "Iz"
    }
}
