package com.company;

public class Main {

    public static void main(String[] args) {
        Greeting aGreeting = null;
        if (args.length>0)
            aGreeting = new Greeting(args[0]);
        else
            aGreeting = new Greeting("Loris");
        System.out.println(aGreeting.sayHello());
    }
}
