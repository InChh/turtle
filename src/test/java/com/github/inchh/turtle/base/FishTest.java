package com.github.inchh.turtle.base;


import org.junit.jupiter.api.Test;

class FishTest {
    @Test
    public void fishTest() {
        Fish fish1 = new Fish(1, 2);
        System.out.println(fish1);
        fish1.setX(2);
        fish1.setY(3);
        System.out.println(fish1.getX());
        System.out.println(fish1.getY());
    }

}