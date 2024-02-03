package ex1;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Runner {
    public static void main(String[] args) {

        AtomicInteger counter = new AtomicInteger(0);
        Stream<Car> firstStream = Stream.generate(() ->
                new Car(numberGenerator("а0[01-50]ан799", counter.addAndGet(1)))).limit(50);

        AtomicInteger counter2 = new AtomicInteger(0);
        Stream<Car> secondStream = Stream.generate(() ->
                new Car(numberGenerator("к0[01-50]се178", counter2.addAndGet(1)))).limit(50);

        System.out.println(Stream.concat(firstStream, secondStream)
                .map(Car::getRegistrationNumber)
                .filter((e) -> e.matches("[а-я]04[0-9][а-я]{2}\\d{3}")
                ).reduce((f, s) -> f + ", " + s).orElse(""));
    }

    private static String numberGenerator(String template, int counter) {
        return template.replaceAll("\\[01-50]", String.format("%2s", counter).replace(" ", "0"));
    }
}
