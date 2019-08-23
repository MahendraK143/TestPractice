package Java8;

import java.util.Collections;
import java.util.function.Predicate;

public class ApplePredicates {
    public Predicate<Apple> filter(){
//        Collections.re

        return apple -> apple.getWeight()>90;

    }
}
