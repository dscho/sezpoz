package com.example;

import java.util.ArrayList;
import java.util.List;

import net.java.sezpoz.Index;
import net.java.sezpoz.IndexItem;

/**
 * The class to test SezPoz with class loader hierarchies.
 */
public class Main {
    public static List<Class<?>> listClasses(final ClassLoader loader) {
        final List<Class<?>> result = new ArrayList<Class<?>>();

        final Index<MyAnnotation, MyInterface> index =
            Index.load(MyAnnotation.class, MyInterface.class, loader);

        for (final IndexItem<MyAnnotation, MyInterface> item : index) try {
            result.add(item.annotation().myClass());
        } catch (Throwable t) {
            t.printStackTrace();
            // continue gracefully
        }

        return result;
    }
}

