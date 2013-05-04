package com.example;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import net.java.sezpoz.Indexable;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Indexable(type = MyInterface.class)
public @interface MyAnnotation {
    Class<?> myClass();
}
