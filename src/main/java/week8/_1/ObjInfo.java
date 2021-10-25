package week8._1;

import java.util.Collection;
import java.util.Map;


public class ObjInfo<T> {
    private T collection;

    public ObjInfo(T collection) {
        this.collection = collection;
    }

    public void printInfo() {
        switch (collection) {
            case Collection<?> c -> {
                System.out.println("Size is: " + c.size());
                System.out.println("Contents are: ");
                c.forEach(System.out::println);
            }
            case Map<?, ?> m -> {
                System.out.println("Size is: " + m.size());
                System.out.println("Contents are: ");
                m.forEach((k, v) -> System.out.println(k + ": " + v));
            }
            default -> System.out.println("Collection not supported");
        }
        if (collection instanceof Collection<?>) {
            System.out.println("Size of collection is: " + ((Collection<?>)collection).size());
            System.out.println("Collection contains: ");
            ((Collection<?>)collection).forEach(System.out::println);
        } else if (collection instanceof Map<?,?>) {
            System.out.println(collection);
        }
    }
}
