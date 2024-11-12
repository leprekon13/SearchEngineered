import java.util.Comparator;
import java.util.List;

public class Collections {

    /**
     * Бинарный поиск в списке с использованием естественного порядка.
     * @param list список (должен быть отсортирован)
     * @param key искомый элемент
     * @param <T> тип элементов списка (должен реализовывать Comparable)
     * @return индекс элемента или -1, если элемент не найден
     */
    public static <T extends Comparable<? super T>> int binarySearch(List<? extends T> list, T key) {
        if (list == null) throw new IllegalArgumentException("Список не должен быть null");

        int low = 0;
        int high = list.size() - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            T midVal = list.get(mid);
            int cmp = midVal.compareTo(key);

            if (cmp < 0) {
                low = mid + 1;
            } else if (cmp > 0) {
                high = mid - 1;
            } else {
                return mid; // Элемент найден
            }
        }
        return -1; // Элемент не найден
    }

    /**
     * Бинарный поиск в списке с использованием Comparator.
     * @param list список (должен быть отсортирован)
     * @param key искомый элемент
     * @param c Comparator для сравнения элементов
     * @param <T> тип элементов списка
     * @return индекс элемента или -1, если элемент не найден
     */
    public static <T> int binarySearch(List<? extends T> list, T key, Comparator<? super T> c) {
        if (list == null || c == null) throw new IllegalArgumentException("Список и Comparator не должны быть null");

        int low = 0;
        int high = list.size() - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            T midVal = list.get(mid);
            int cmp = c.compare(midVal, key);

            if (cmp < 0) {
                low = mid + 1;
            } else if (cmp > 0) {
                high = mid - 1;
            } else {
                return mid; // Элемент найден
            }
        }
        return -1; // Элемент не найден
    }
}
