package me.ele.napos.inherit;

/**
 * Created by jakoo on 26/04/2017.
 */
public class Mouse {
    private String name;
    private int id;

    public Mouse(String myName, int myId) {
        name = myName;
        id = myId;
    }

    public void eat() {
        System.out.println(name + "正在吃");
    }
    public void sleep() {
        System.out.println(name + "正在睡觉");
    }
    public void introduction() {
        System.out.println("Hi everybody");
    }
}
