package ex3;

import java.util.Objects;

public class Skyscraper {
    private final int height;
    private final String name;

    public Skyscraper(String name, int height) {
        this.height = height;
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Skyscraper that = (Skyscraper) o;
        return height == that.height && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, name);
    }

    @Override
    public String toString() {
        return "Skyscraper{"
                + "name=" + name
                + ", height=" + height
                + '}';
    }
}
