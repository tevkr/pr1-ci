import org.example.SortingAlgorithms;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SortingAlgorithmsTest {
    @Test
    void testBubbleSort() {
        int[] actual = {5, 1, 4, 2, 8};
        int[] expected = {1, 2, 4, 5, 8};
        SortingAlgorithms.bubbleSort(actual);
        assertArrayEquals(expected, actual, "The bubble sort did not sort the array correctly.");
    }
    @Test
    void testInsertionSort() {
        int[] actual = {3, 1, 2, 5, 7, 0};
        int[] expected = {0, 1, 2, 3, 5, 7};
        SortingAlgorithms.insertionSort(actual);
        assertArrayEquals(expected, actual, "The insertion sort did not sort the array correctly.");
    }
}