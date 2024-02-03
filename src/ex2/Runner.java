package ex2;

import java.util.List;

public class Runner {
    public static void main(String[] args) {
        List<String> words = List.of("тонь", "тополь", "боль", "рой", "стройка");
        words.stream().map((e) -> e.chars().filter(ch -> ch == 'о').count())
                .peek(System.out::println)
                .filter((e) -> e != 0)
                .reduce(Long::sum)
                .stream().forEach(System.out::println);
    }
}
