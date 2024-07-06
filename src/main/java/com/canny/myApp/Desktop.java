package com.canny.myApp;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {

    public void compile() {
        System.out.println("Compiling with 313 errors but faster");
    }
}
