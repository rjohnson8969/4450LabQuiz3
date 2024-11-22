import org.junit.jupiter.api.Test;
import com.jwetherell.algorithms.sorts.BubbleSort;
import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void sort() {
        // Test regular case
        Integer[] array = {5, 1, 4, 2, 8};
        Integer[] expected = {1, 2, 4, 5, 8};
        assertArrayEquals(expected, BubbleSort.sort(array));

        // Test edge cases
        Integer[] emptyArray = {};
        Integer[] singleElement = {42};
        Integer[] alreadySorted = {1, 2, 3, 4, 5};
        Integer[] reverseSorted = {5, 4, 3, 2, 1};

        assertArrayEquals(emptyArray, BubbleSort.sort(emptyArray));
        assertArrayEquals(singleElement, BubbleSort.sort(singleElement));
        assertArrayEquals(alreadySorted, BubbleSort.sort(alreadySorted));
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, BubbleSort.sort(reverseSorted));

        // Test duplicate elements
        Integer[] withDuplicates = {3, 3, 2, 1, 2};
        Integer[] expectedDuplicates = {1, 2, 2, 3, 3};
        assertArrayEquals(expectedDuplicates, BubbleSort.sort(withDuplicates));
    }
}