package ex3;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {
        List<Skyscraper> skyscrapers = List.of(new Skyscraper("Всемирный торговый центр 1", 541),
                new Skyscraper("Шанхайская башня", 632),
                new Skyscraper("Бурдж-Халифа", 828),
                new Skyscraper("Бурдж-Халифа", 828),
                new Skyscraper("Международный финансовый центр Пинань", 599),
                new Skyscraper("Абрадж аль-Бейт", 601),
                new Skyscraper("Всемирный центр Лотте", 555));

        skyscrapers.stream().distinct().limit(3).forEachOrdered(System.out::println);

        System.out.println("------------");

        skyscrapers.stream().distinct()
                .max(Comparator.comparingInt(Skyscraper::getHeight))
                .stream().forEach(System.out::println);

        System.out.println("------------");

        skyscrapers.stream().distinct()
                .filter(e -> e.getHeight() > 1000)
                .peek(System.out::println)
                .toList().stream()
                .findAny()
                .orElseThrow(() -> new RuntimeException("Небоскреба выше километра - нет"));

    }
}
