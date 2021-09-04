package week5._2.calculator;

import java.util.List;

public class Sum {
    public static int sum(List<Integer> list) {
        return list.stream().reduce(Integer::sum).orElseThrow();
    }
}
