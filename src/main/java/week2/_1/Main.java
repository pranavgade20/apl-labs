package week2._1;

import java.util.LinkedList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    // Write a Java method to find all twin prime numbers less than 100 such as (3, 5), (5, 7),
    // (7, 11), (11, 13),………
    public static void main(String[] args) {
        int n = 100;
        LinkedList<Integer> primes = IntStream.rangeClosed(2, n).boxed().collect(Collectors.toCollection(LinkedList::new));

        sieve(primes);

        var it = primes.iterator();
        int prev = it.next();
        while (it.hasNext()) {
            int next = it.next();
            if (next - prev == 2) {
                System.out.printf("(%d, %d)\n", prev, next);
            }
            prev = next;
        }
    }

    private static void sieve(LinkedList<Integer> primes) {
        var i = 0;
        while (i < primes.size()) {
            int val = primes.get(i);
            var rit = primes.iterator();
            int rval = rit.next();
            while (rit.hasNext()) {
                if (val == rval) break;
                rval = rit.next();
            }
            while (rit.hasNext()) {
                rval = rit.next();
                if (rval%val == 0) rit.remove();
            }
            i++;
        }
    }
}
