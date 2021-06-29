package com.github.inchh.turtle.base;


/**
 * 抽象动物类
 *
 * @author In_Chh
 */
public abstract class Animal {
    private int x;
    private int y;

    public Animal(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void move(char direction,int step){
        if(direction!='w')
    }

    public String show() {
        return "(" + this.x + "," + this.y + ")";
    }
}
