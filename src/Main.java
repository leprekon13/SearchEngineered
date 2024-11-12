import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Демонстрация работы методов класса Arrays:");

        // Пример с int[]
        int[] intArray = {1, 3, 5, 7, 9};
        System.out.println("Индекс 5 в массиве int: " + Arrays.binarySearch(intArray, 5));
        System.out.println("Индекс 7 в диапазоне [1, 4): " + Arrays.binarySearch(intArray, 1, 4, 7));

        // Пример с char[]
        char[] charArray = {'a', 'c', 'e', 'g'};
        System.out.println("Индекс 'e' в массиве char: " + Arrays.binarySearch(charArray, 'e'));

        // Пример с double[]
        double[] doubleArray = {1.1, 2.2, 3.3, 4.4};
        System.out.println("Индекс 3.3 в массиве double: " + Arrays.binarySearch(doubleArray, 3.3));

        // Пример с float[]
        float[] floatArray = {1.1f, 2.2f, 3.3f, 4.4f};
        System.out.println("Индекс 2.2 в массиве float: " + Arrays.binarySearch(floatArray, 2.2f));

        System.out.println("\nДемонстрация работы методов класса Collections:");

        // Список строк с использованием Comparable
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("cherry");
        Collections.sort(stringList);
        System.out.println("Индекс 'banana' в списке: " + Collections.binarySearch(stringList, "banana"));

        // Список объектов Person с использованием Comparator
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));
        people.sort(new NameComparator());
        System.out.println("Индекс 'Bob' в списке: " + Collections.binarySearch(people, new Person("Bob", 0), new NameComparator()));
    }

    // Класс Person для демонстрации
    static class Person {
        String name;
        int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }
    }

    // Comparator для сравнения объектов Person по имени
    static class NameComparator implements Comparator<Person> {
        @Override
        public int compare(Person p1, Person p2) {
            return p1.getName().compareTo(p2.getName());
        }
    }
}
