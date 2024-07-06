package com.canny.myApp;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {

    public void compile() {
        System.out.println("Compiling with 313 errors");
    }
}
