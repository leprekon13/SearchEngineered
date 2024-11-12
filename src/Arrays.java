import java.util.Comparator;
import exceptions.InvalidRangeException;

public class Arrays {

    // 1. Методы для byte[]
    /**
     * Бинарный поиск в массиве byte.
     * @param a массив (должен быть отсортирован)
     * @param key искомый элемент
     * @return индекс элемента или -1, если элемент не найден
     */
    public static int binarySearch(byte[] a, byte key) {
        if (a == null) throw new IllegalArgumentException("Массив не должен быть null");
        int low = 0, high = a.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2; // Вычисляем средний индекс
            if (a[mid] < key) low = mid + 1;
            else if (a[mid] > key) high = mid - 1;
            else return mid;
        }
        return -1; // Элемент не найден
    }

    /**
     * Бинарный поиск в массиве byte в указанном диапазоне индексов.
     * @param a массив (должен быть отсортирован)
     * @param fromIndex начальный индекс (включительно)
     * @param toIndex конечный индекс (исключительно)
     * @param key искомый элемент
     * @return индекс элемента или -1, если элемент не найден
     */
    public static int binarySearch(byte[] a, int fromIndex, int toIndex, byte key) {
        if (a == null) throw new IllegalArgumentException("Массив не должен быть null");
        if (fromIndex < 0 || toIndex > a.length || fromIndex > toIndex) {
            throw new InvalidRangeException("Некорректный диапазон индексов");
        }
        int low = fromIndex, high = toIndex - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2; // Вычисляем средний индекс
            if (a[mid] < key) low = mid + 1;
            else if (a[mid] > key) high = mid - 1;
            else return mid;
        }
        return -1; // Элемент не найден
    }

    // 2. Методы для char[]
    /**
     * Бинарный поиск в массиве char.
     * @param a массив (должен быть отсортирован)
     * @param key искомый элемент
     * @return индекс элемента или -1, если элемент не найден
     */
    public static int binarySearch(char[] a, char key) {
        if (a == null) throw new IllegalArgumentException("Массив не должен быть null");
        int low = 0, high = a.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a[mid] < key) low = mid + 1;
            else if (a[mid] > key) high = mid - 1;
            else return mid;
        }
        return -1;
    }

    /**
     * Бинарный поиск в массиве char в указанном диапазоне индексов.
     * @param a массив (должен быть отсортирован)
     * @param fromIndex начальный индекс (включительно)
     * @param toIndex конечный индекс (исключительно)
     * @param key искомый элемент
     * @return индекс элемента или -1, если элемент не найден
     */
    public static int binarySearch(char[] a, int fromIndex, int toIndex, char key) {
        if (a == null) throw new IllegalArgumentException("Массив не должен быть null");
        if (fromIndex < 0 || toIndex > a.length || fromIndex > toIndex) {
            throw new InvalidRangeException("Некорректный диапазон индексов");
        }
        int low = fromIndex, high = toIndex - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a[mid] < key) low = mid + 1;
            else if (a[mid] > key) high = mid - 1;
            else return mid;
        }
        return -1;
    }

    // 3. Методы для double[]
    /**
     * Бинарный поиск в массиве double.
     * @param a массив (должен быть отсортирован)
     * @param key искомый элемент
     * @return индекс элемента или -1, если элемент не найден
     */
    public static int binarySearch(double[] a, double key) {
        if (a == null) throw new IllegalArgumentException("Массив не должен быть null");
        int low = 0, high = a.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a[mid] < key) low = mid + 1;
            else if (a[mid] > key) high = mid - 1;
            else return mid;
        }
        return -1;
    }

    /**
     * Бинарный поиск в массиве double в указанном диапазоне индексов.
     * @param a массив (должен быть отсортирован)
     * @param fromIndex начальный индекс (включительно)
     * @param toIndex конечный индекс (исключительно)
     * @param key искомый элемент
     * @return индекс элемента или -1, если элемент не найден
     */
    public static int binarySearch(double[] a, int fromIndex, int toIndex, double key) {
        if (a == null) throw new IllegalArgumentException("Массив не должен быть null");
        if (fromIndex < 0 || toIndex > a.length || fromIndex > toIndex) {
            throw new InvalidRangeException("Некорректный диапазон индексов");
        }
        int low = fromIndex, high = toIndex - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a[mid] < key) low = mid + 1;
            else if (a[mid] > key) high = mid - 1;
            else return mid;
        }
        return -1;
    }

    // 4. Обобщённые методы
    /**
     * Бинарный поиск в массиве объектов с использованием Comparator.
     * @param a массив объектов (должен быть отсортирован)
     * @param key искомый элемент
     * @param c Comparator для сравнения объектов
     * @return индекс элемента или -1, если элемент не найден
     */
    public static <T> int binarySearch(T[] a, T key, Comparator<? super T> c) {
        if (a == null || c == null) throw new IllegalArgumentException("Массив и Comparator не должны быть null");
        int low = 0, high = a.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int cmp = c.compare(a[mid], key);
            if (cmp < 0) low = mid + 1;
            else if (cmp > 0) high = mid - 1;
            else return mid;
        }
        return -1;
    }

    /**
     * Бинарный поиск в массиве объектов в указанном диапазоне индексов с использованием Comparator.
     * @param a массив объектов (должен быть отсортирован)
     * @param fromIndex начальный индекс (включительно)
     * @param toIndex конечный индекс (исключительно)
     * @param key искомый элемент
     * @param c Comparator для сравнения объектов
     * @return индекс элемента или -1, если элемент не найден
     */
    public static <T> int binarySearch(T[] a, int fromIndex, int toIndex, T key, Comparator<? super T> c) {
        if (a == null || c == null) throw new IllegalArgumentException("Массив и Comparator не должны быть null");
        if (fromIndex < 0 || toIndex > a.length || fromIndex > toIndex) {
            throw new InvalidRangeException("Некорректный диапазон индексов");
        }
        int low = fromIndex, high = toIndex - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            int cmp = c.compare(a[mid], key);
            if (cmp < 0) low = mid + 1;
            else if (cmp > 0) high = mid - 1;
            else return mid;
        }
        return -1;
    }
}
