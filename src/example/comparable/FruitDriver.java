package example.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FruitDriver {

    public static void main(String[] args) {

        Fruit apple = new Fruit("Apple", 100);
        Fruit orange = new Fruit("Orange",20);
        Fruit banana = new Fruit("Banana",19);
        Fruit peach = new Fruit("Peach",98);
        Fruit apple2 = new Fruit("Apple2",5);
        Fruit watermelon = new Fruit("Watermelon",1000);

        List<Fruit> fruits = new ArrayList<>();

        fruits.add(apple);
        fruits.add(apple2);
        fruits.add(banana);
        fruits.add(peach);
        fruits.add(orange);
        fruits.add(watermelon);

        fruits.forEach(System.out::println);

        Collections.sort(fruits);

        fruits.forEach(System.out::println);

    }
}
