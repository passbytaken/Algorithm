package me.ele.napos.array;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jakoo on 16/03/2017.
 */
public class MapController {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<String, Integer>();

        for(int i = 0; i < 100; i++) {
            map.put("语文" + i, 1);
            map.put("数学" + i, 2);
            map.put("英语" + i, 3);
            map.put("历史" + i, 4);
            map.put("政治" + i, 5);
            map.put("地理" + i, 6);
            map.put("生物" + i, 7);
            map.put("化学" + i, 8);
        }

        System.out.println("Traverse");
        long s = System.currentTimeMillis();
        for (String key : map.keySet()) {
            System.out.println("key is " + key + " and value is " + map.get(key));
        }
        long e = System.currentTimeMillis();
        System.out.println("cost1:" + (e - s));


        System.out.println("===========================");
        long s1 = System.currentTimeMillis();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("key is " + entry.getKey() + " and value is " + entry.getValue());
        }
        long e1 = System.currentTimeMillis();
        System.out.println("cost2:" + (e1 - s1));


        System.out.println("=============================");
        long s2 = System.currentTimeMillis();
        for (Map.Entry<String,Integer> entry : map.entrySet()) {
            System.out.println("Maps : " + entry.getKey() + " Value : " + entry.getValue());
        }
        long e2 = System.currentTimeMillis();
        System.out.println("cost3:" + (e2 - s2));

        System.out.println("===========================");
        map.forEach((k, v) -> System.out.println(" Maps : " + k + " Value : " + v) );

        System.out.println("===========================");
        long s3 = System.currentTimeMillis();
        map.forEach((k, v) -> {
            System.out.println(" Maps : " + k + " Value : " + v);
            if ("Token".equals(k)) {
                System.out.println("Hello Token");
            }
        });
        long e3 = System.currentTimeMillis();
        System.out.println("cost4:" + (e3 - s3));


    }

}
