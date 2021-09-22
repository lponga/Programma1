package com.company;

public class Greeting {
    String name;

    public Greeting(String name){
        this.name = name;
    }

    public String sayHello(){
        return "Hello "+name;
    }
}
