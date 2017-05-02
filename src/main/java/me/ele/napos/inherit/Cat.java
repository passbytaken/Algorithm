package me.ele.napos.inherit;

/**
 * Created by jakoo on 26/04/2017.
 */
public class Cat {

    private int id;
    private String name;
    private String color;

    public Cat(int myId, String myName, String catColor) {
        id = myId;
        name = myName;
        color = catColor;
    }

    public void sleep() {
        System.out.println(name + "正在睡觉");
    }
    public void eat() {
        System.out.println(name + "正在吃东西");
    }

    public void introduction() {
        System.out.println("Hi  everybody and I'm " + id + "number" + name + ".");
    }

}
