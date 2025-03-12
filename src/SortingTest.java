import org.junit.Test;

import java.util.*;

import org.junit.Before;

import static org.junit.Assert.assertTrue;

public class SortingTest {
    int[] toSort;
    int[] sortedInts;
    int[] sortedRangeInts;
    SortAlgoriths algoritmos = new SortAlgoriths();

    @Before
    public void setUp() {
        toSort = new int[]{5, 1, 89, 255, 7, 88, 200, 123, 66};
        sortedInts = new int[]{1, 5, 7, 66, 88, 89, 123, 200, 255};
        sortedRangeInts = new int[]{5, 1, 89, 7, 88, 200, 255, 123, 66};
    }

    @Test
    public void givenIntArray_whenUsingSort_thenSortedArray() {
        Arrays.sort(toSort);
        assertTrue(Arrays.equals(toSort,sortedInts));
    }

    @Test
    public void givenIntArray_whenUsingRangeSort_thenRangeSortedArray() {
        Arrays.sort(toSort,3,7);
        assertTrue(Arrays.equals(toSort,sortedRangeInts));
    }

    @Test
    public void givenIntArray_whenUsingParallelSort_thenArraySorted(){
        Arrays.parallelSort(toSort);
        assertTrue(Arrays.equals(toSort,sortedInts));
    }

    @Before
    public void initVariables(){
        HashMap<Integer,String> map = new HashMap<>();
        map.put(55,"John");
        map.put(22, "Apple");
        map.put(66, "Earl");
        map.put(77, "Pearl");
        map.put(12, "George");
        map.put(6, "Rocky");
    }

    @Test
    public void bubbleTest(){
        Integer[] data = algoritmos.bubbleSort(new Integer[]{17,9,2132,234,45,66});
        Integer[] dataOrdenada= {9,17,45,66,234,2132};
        assertTrue(Arrays.equals(data,dataOrdenada));
    }

    @Test
    public void selectionSortTest(){
        Integer[] coleccion = algoritmos.selectionSort(new Integer[]{3,1,5,7,2,6});

        Integer[] coleccionOrdenada = {1,2,3,5,6,7};

        assertTrue(Arrays.equals(coleccion,coleccionOrdenada));
    }

    @Test
    public void mergeSortTest(){
        Integer[] coleccion = algoritmos.mergeSort(new Integer[]{3,1,5,7,2,6});

        Integer[] coleccionOrdenada = {1,2,3,5,6,7};

        assertTrue(Arrays.equals(coleccion,coleccionOrdenada));
    }

    @Test
    public void insertionSortTest(){
        Integer[] coleccion = algoritmos.isertionSort(new Integer[]{3,1,5,7,2,6});

        Integer[] coleccionOrdenada = {1,2,3,5,6,7};

        assertTrue(Arrays.equals(coleccion,coleccionOrdenada));
    }

    @Test
    public void quickSortTest(){
        Integer[] coleccion = algoritmos.quickSort(new Integer[]{3,1,5,7,2,6});

        Integer[] coleccionOrdenada = {1,2,3,5,6,7};

        assertTrue(Arrays.equals(coleccion,coleccionOrdenada));
    }
}
