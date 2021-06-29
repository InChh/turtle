package com.github.inchh.turtle.base;

/**
 * 鱼类
 *
 * @author In_Chh
 */
public class Fish extends Animal {
    public Fish(int x, int y) {
        super(x, y);
    }

    @Override
    public String toString() {
        return "Fish" + show();
    }
}
