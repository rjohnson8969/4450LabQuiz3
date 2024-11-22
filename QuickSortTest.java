import com.jwetherell.algorithms.sorts.QuickSort;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    @Test
    void sort() {
        // Test regular case
        Integer[] array = {5, 1, 4, 2, 8};
        Integer[] expected = {1, 2, 4, 5, 8};
        assertArrayEquals(expected, QuickSort.sort(QuickSort.PIVOT_TYPE.RANDOM, array));

        // Test edge cases
        Integer[] emptyArray = {};
        Integer[] singleElement = {42};
        Integer[] alreadySorted = {1, 2, 3, 4, 5};
        Integer[] reverseSorted = {5, 4, 3, 2, 1};

        assertArrayEquals(emptyArray, QuickSort.sort(QuickSort.PIVOT_TYPE.FIRST, emptyArray));
        assertArrayEquals(singleElement, QuickSort.sort(QuickSort.PIVOT_TYPE.FIRST, singleElement));
        assertArrayEquals(alreadySorted, QuickSort.sort(QuickSort.PIVOT_TYPE.MIDDLE, alreadySorted));
        assertArrayEquals(new Integer[]{1, 2, 3, 4, 5}, QuickSort.sort(QuickSort.PIVOT_TYPE.RANDOM, reverseSorted));

        // Test duplicate elements
        Integer[] withDuplicates = {3, 3, 2, 1, 2};
        Integer[] expectedDuplicates = {1, 2, 2, 3, 3};
        assertArrayEquals(expectedDuplicates, QuickSort.sort(QuickSort.PIVOT_TYPE.RANDOM, withDuplicates));
    }
}
