package com.github.inchh.turtle.base;

/**
 * 乌龟类
 *
 * @author In_Chh
 */
public class Turtle extends Animal implements java.io.Serializable {
    public static long serialVersionUID = -12343254544335L;
    /**
     * 乌龟体力，默认初始化为100
     */
    private int energy = 100;

    public Turtle() {
        super(0, 0);
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        if (energy >= 0) {
            this.energy = energy;
        }
    }

    @Override
    public String toString() {
        return "Turtle" + show() + " energy:" + this.energy;
    }
}
