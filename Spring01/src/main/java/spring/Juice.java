package spring;

import org.springframework.stereotype.Component;

/*
饮料
 */
@Component
public class Juice {
    private Apple apple;
    private Suger suger;
    private Water water;

    public Juice() {
    }

    public Juice(Apple apple, Suger suger, Water water) {
        this.apple = apple;
        this.suger = suger;
        this.water = water;
    }

    public Apple getApple() {
        return apple;
    }

    public void setApple(Apple apple) {
        this.apple = apple;
    }

    public Suger getSuger() {
        return suger;
    }

    public void setSuger(Suger suger) {
        this.suger = suger;
    }

    public Water getWater() {
        return water;
    }

    public void setWater(Water water) {
        this.water = water;
    }

    @Override
    public String toString() {
       return "饮料是由"+water.getName()+"和"+suger.getName()+"还有"+apple.getName()+"生成的";
    }
}
