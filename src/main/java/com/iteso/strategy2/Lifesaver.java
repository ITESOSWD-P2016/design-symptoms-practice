package com.iteso.strategy2;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/9/13
 * Time: 10:56 AM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Lifesaver {
    protected String type;
    public String inflating() {
        return "I'm inflating";
    }
    public String deflating() {
        return "I'm deflating";
    }
    public String floating() {
        return "I'm floating";
    }
    public String display() {
        return "I'm a " + type;
    }
}
