package Java8;

import java.util.*;
import java.util.function.Predicate;

public class AppleTestCases {

    public static void main(String arg[]) {
        List<Apple> apples = Arrays.asList(new Apple(1,"red",100,150),
                new Apple(2,"green",233,170),
                new Apple(13,"green",233,122),
                new Apple(22,"green",233,188),
                new Apple(3,"white",544,166),
                new Apple(13,"white",334,134),
                new Apple(23,"white",343,433),
                new Apple(4,"pink",1000,555));
        System.out.println(filterGreenApples(apples));
        System.out.println(filterHeavyApples(apples));
        System.out.println(filterApples(apples,(Apple a)->"green".equals(a.getColor())));
        System.out.println(filterApples(apples,(Apple a)->200 > a.getWeight()));
        System.out.println(filterApples(apples,(Apple a)->200 < a.getWeight()));
        //highest cost
        OptionalDouble maxCost = apples.stream().filter(apple -> apple.getColor().equals("white"))
                .mapToDouble(apple->apple.getCost())
                .max();
        System.out.print(maxCost.getAsDouble());
        OptionalInt maxWeight = apples.stream().filter(apple -> apple.getColor().equals("white"))
                .mapToInt(apple->apple.getWeight())
                .max();
        System.out.print(maxWeight.getAsInt());
    }
    public static List<Apple> filterGreenApples(List<Apple> apples) {
        List<Apple> greenApples = new ArrayList<>();
        for (Apple a:apples) {
            if(a.getColor().equals("green")) greenApples.add(a);
        }
        return greenApples;
    }
    public static List<Apple> filterHeavyApples(List<Apple> apples) {
        List<Apple> greenApples = new ArrayList<>();
        for (Apple a:apples) {
            if(a.getWeight() > 200) greenApples.add(a);
        }
        return greenApples;
    }

    public static List<Apple> filterApples(List<Apple> apples,Predicate<Apple> predicate) {
        List<Apple> greenApples = new ArrayList<>();
        for (Apple a:apples) {
            if(predicate.test(a)) greenApples.add(a);
        }
        return greenApples;
    }




}
