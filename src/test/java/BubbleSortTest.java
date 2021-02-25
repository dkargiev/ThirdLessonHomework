import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BubbleSortTest {

    @Test
    public void ArrayElementTest() {
        int[] array = {9, 5, 1};
        BubbleSort.sort(array);
        Assertions.assertEquals(9, array[2]);
    }

    @Test
    public void NegativeArrayElementTest() {
        int[] array = {9, 5, 1};
        BubbleSort.sort(array);
        Assertions.assertNotEquals(15, array[1]);
    }

    @Test
    public void ArraySortTest() {
        int[] array1 = {10, 4, 2};
        BubbleSort.sort(array1);
        int[] array2 = {2, 4, 10};
        Assertions.assertArrayEquals(array2, array1);
    }

    @Test
    public void ArrayLengthTest() {
        int[] array = {9, 5, 1};
        BubbleSort.sort(array);
        Assertions.assertNotEquals(4, array.length);
    }

    @Test
    public void NotEmptyLinkTest() {
        int[] array = new int[3];
        BubbleSort.sort(array);
        Assertions.assertNotNull(array[2]);
    }
}
