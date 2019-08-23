package Java8;

@FunctionalInterface
public interface HeavyApplePredicate<Apple> {
    public boolean isHeavyApple(Apple apple);
}
