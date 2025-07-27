package org.example;

public class Desktop implements Computer{

    public Desktop() {
        System.out.println("Destop object created");
    }

    @Override
    public void compile() {
        System.out.println("compiling using Desktop");
    }
}
