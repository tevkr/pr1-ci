import org.example.SortingAlgorithms;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SortingAlgorithmsTest {
    @Test
    public void testBubbleSort() {
        int[] actual = {5, 1, 4, 2, 8};
        int[] expected = {1, 2, 4, 5, 8};
        SortingAlgorithms.bubbleSort(actual);
        assertArrayEquals(expected, actual, "The bubble sort did not sort the array correctly.");
    }
}