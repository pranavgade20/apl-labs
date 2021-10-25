package week8._1;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    //Write a java program to demonstrate generic class in java. Create Generic class objInfo<T> which has
    //private printinfo method. printinfo method prints length of the collections objects of which T represents
    //and iterates over the collections objects to print its value and also print the type of collections which the T
    //represents. In the main method, create an ArrayList, List, Map and Set and create object of objInfo for
    //each of them and call printinfo method for each. Use appropriate logic to implement the same.
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(List.of(1, 2, 3, 4));
        List<Character> list = List.of('a', 'b', 'c', 'd');
        Map<Integer, Character> map = Map.of(1, 'x', 2, 'y');
        Set<String> set = Set.of("hello", "world");

        new ObjInfo<>(arrayList).printInfo();
        new ObjInfo<>(list).printInfo();
        new ObjInfo<>(map).printInfo();
        new ObjInfo<>(set).printInfo();
    }
}
