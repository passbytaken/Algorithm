package me.ele.napos;

import me.ele.napos.Constant.ConstantClassFunction;
import me.ele.napos.Constant.ConstantEnum;
import me.ele.napos.Constant.ConstantField;
import me.ele.napos.Constant.ConstantInterface;

/**
 * Created by jakoo on 03/06/2018.
 */
public class TestConstant {
    public static final String day = "saturday";

    public static void main(String[] args) {
        System.out.println("Is today Saturday?");
        System.out.println(day.equalsIgnoreCase(ConstantInterface.SATURDAY));
        System.out.println(day.equalsIgnoreCase(ConstantEnum.SATURDAY.name()));
        System.out.println(day.equalsIgnoreCase(ConstantField.SATURDAY));
        System.out.println(day.equalsIgnoreCase(ConstantClassFunction
                .getSATURDAY()));
    }
}
