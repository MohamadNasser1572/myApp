package com.canny.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Developer {
    @Autowired //field injection
    private Computer computer;
    public void build() {
        computer.compile();
        System.out.println("Working on an awesome project");
    }
}
