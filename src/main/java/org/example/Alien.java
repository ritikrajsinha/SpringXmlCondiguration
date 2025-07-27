package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Alien {

    private int age;

    private Laptop lap;

    public int getAge() {
        return age;
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        this.lap = lap;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public  void coding()
    {
        System.out.println("coding");
        lap.compile();
    }
}
