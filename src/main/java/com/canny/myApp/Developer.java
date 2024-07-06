package com.canny.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Developer {
    @Autowired //field injection
    private Laptop laptop;
    public void build() {
        laptop.compile();
        System.out.println("Working on an awesome project");
    }
}
