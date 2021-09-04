package week5._2.calculator;

import java.util.List;

public class Minimum {
    public static int min(List<Integer> list) {
        return list.stream().reduce(Math::min).orElseThrow();
    }
}
