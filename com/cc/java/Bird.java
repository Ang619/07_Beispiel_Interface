package com.cc.java;

public class Bird implements Flyable, iFeathers{

    @Override
    public String fly() {
        // TODO Auto-generated method stub
        return "I'm a bird, i can fly.";
 
    }

    @Override
    public String hasFeathers() {
        // TODO Auto-generated method stub
        return "I'm a bird, I have feathers.";
    }



    
}
