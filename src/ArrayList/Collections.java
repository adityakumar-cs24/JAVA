package ArrayList;

import java.util.ArrayList;

public class Collections {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");

        System.out.println(fruits.get(0));
        System.out.println(fruits.get(1));
        System.out.println(fruits.get(2));

        fruits.set(2, "Orange");
        fruits.remove("Apple");
        System.out.println("Size : " + fruits.size());
        System.out.println(fruits);


    }
}
