package com.github.inchh.turtle.base;

import org.junit.jupiter.api.Test;


class TurtleTest {
    @Test
    public void turtleTest(){
        Turtle turtle=new Turtle();
        System.out.println(turtle);
        turtle.setEnergy(50);
    }

}