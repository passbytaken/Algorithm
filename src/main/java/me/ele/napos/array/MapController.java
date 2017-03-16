package me.ele.napos.array;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by jakoo on 16/03/2017.
 */
public class MapController {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("Name", "Tom");
        map.put("Key", "Aeir53diener33fsdfe");
        map.put("Num", "99");

        System.out.println("Traverse");
        for (String key : map.keySet()) {
            System.out.println("key is " + key + " and value is " + map.get(key));
        }

        System.out.println("===========================");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println("key is " + entry.getKey() + " and value is " + entry.getValue());
        }


    }

}
