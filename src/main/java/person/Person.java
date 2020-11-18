package person;

import java.util.Objects;

public class Person {
    private final String name;
    private final int sum;

    public String getName() {
        return name;
    }

    public int getSum() {
        return sum;
    }

    private Person(Builder builder) {
        this.name = builder.name;
        this.sum = builder.sum;
    }

    public static class Builder {
        private String name;
        private int sum;

        public Builder setName(String name) {
            if (name == null) {
                throw new IllegalArgumentException("Некорректное имя");
            }
            this.name = name;
            return this;
        }

        public Builder setSum(int sum) {
            this.sum = sum;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return sum == person.sum &&
                name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, sum);
    }

    @Override
    public String toString() {
        return "name = '" + name + '\'' +
                ", sum = " + sum;
    }
}
