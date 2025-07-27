package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Alien {

    private int age;

    private Computer comp;


    public int getAge() {
        return age;
    }


    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public  void coding()
    {
        System.out.println("coding");
        comp.compile();
    }
}
