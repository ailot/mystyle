package com.ailot.design.decorator.battercake.v1;

/**
 * @author ailot
 * @version BattercakeWithEgg.java, 2019年04月01日 下午10:23
 */
public class BattercakeWithEgg extends Battercake {
    @Override
    public String getMsg() {
        return super.getMsg() + "+一个鸡蛋";
    }

    @Override
    public int getPrice() {
        return super.getPrice() + 1;
    }
}
