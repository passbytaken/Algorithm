package me.ele.napos.randomString;

import java.util.Random;

/**
 * Created by jakoo on 07/08/2017.
 */
public class RandomStringData {

    public static void main(String[] args) {
        //general random pure number
        for (int i = 0; i < 15; i++)
            create(20);
        System.out.println("=========================");

        //general number and alphabet

        for (int i = 0; i < 15 ; i++)
            createRandomStringData(20);

    }

    public static void create(int length) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < length; i++) {
            sb.append(random.nextInt(10));
        }
        String data = sb.toString();
        System.out.println(length + " random data " + data);
    }

    public static void createRandomStringData(int length) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        Random randData = new Random();
        int data = 0;
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(3);
            switch (index) {
                case 0:
                    data = randData.nextInt(10); // general 0~9
                    sb.append(data);
                    break;
                case 1:
                    data = randData.nextInt(26) + 65; //int 65~90
                    sb.append(data);
                    break;
                case 2:
                    data = randData.nextInt(26) + 97; //int 97~122
                    sb.append((char)data);
                    break;
            }
            String result = sb.toString();
            System.out.println(result);
        }
    }
}
