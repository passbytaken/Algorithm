package me.ele.napos.generic;

/**
 * Created by jakoo on 20/03/2017.
 */
public class GenericMethodTest {
    //Generic
    public static <E> void print (E[] input ) {
        for (E element : input) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }


    public static void main(String[] args) {

        Integer[] integers = {1,2,3,4,5,6,7};
        Double[] doubles = {1.2,2.3,3.4,4.5};
        Character[] characters = {'H','E','L','L','O'};

        System.out.println("整型：");
        print(integers);
        System.out.println("\n双精度：");
        print(doubles);
        System.out.println("\n字符型：");
        print(characters);
    }

}
