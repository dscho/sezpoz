package com.example;

@MyAnnotation(myClass = MyExample.class)
public class MyExample implements MyInterface {
    public String get() {
        return "Hello, World!";
    }
}
