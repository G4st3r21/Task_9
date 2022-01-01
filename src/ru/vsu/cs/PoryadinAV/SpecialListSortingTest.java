package ru.vsu.cs.PoryadinAV;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import ru.vsu.cs.PoryadinAV.utils.ArrayUtils;

import java.io.FileNotFoundException;
import java.util.List;


public class SpecialListSortingTest {

    SpecialListSorting program = new SpecialListSorting();

    @Test
    public void testNormalCase() throws FileNotFoundException {
        int[] arrayList = ArrayUtils.readIntArrayFromFile("testSrc/testInput1.txt");

        int[] expectedResult = ArrayUtils.readIntArrayFromFile("testSrc/testOutput1.txt");
        List<Integer> list = program.specSortingList(ArrayUtils.toList(arrayList));
        int[] receivedResult = list.stream().mapToInt(i -> i).toArray();


        Assertions.assertArrayEquals(expectedResult, receivedResult);
    }

    @Test
    public void testCaseWithUnusualInput() throws FileNotFoundException {
        int[] arrayList = ArrayUtils.readIntArrayFromFile("testSrc/testInput2.txt");

        int[] expectedResult = ArrayUtils.readIntArrayFromFile("testSrc/testOutput2.txt");
        int[] receivedResult = null;

        try {
            List<Integer> list = program.specSortingList(ArrayUtils.toList(arrayList));
            receivedResult = list.stream().mapToInt(i -> i).toArray();
        } catch (NullPointerException ignored) {}


        Assertions.assertArrayEquals(expectedResult, receivedResult);
    }

    @Test
    public void testCaseWithUnusualInput2() throws FileNotFoundException {
        int[] arrayList = ArrayUtils.readIntArrayFromFile("testSrc/testInput3.txt");

        int[] expectedResult = ArrayUtils.readIntArrayFromFile("testSrc/testOutput3.txt");
        List<Integer> list = program.specSortingList(ArrayUtils.toList(arrayList));
        int[] receivedResult = list.stream().mapToInt(i -> i).toArray();


        Assertions.assertArrayEquals(expectedResult, receivedResult);
    }

    @Test
    public void testCaseWithUnusualInput3() throws FileNotFoundException {
        int[] arrayList = ArrayUtils.readIntArrayFromFile("testSrc/testInput4.txt");

        int[] expectedResult = ArrayUtils.readIntArrayFromFile("testSrc/testOutput4.txt");
        List<Integer> list = program.specSortingList(ArrayUtils.toList(arrayList));
        int[] receivedResult = list.stream().mapToInt(i -> i).toArray();


        Assertions.assertArrayEquals(expectedResult, receivedResult);
    }

    @Test
    public void testCaseWithBigInput() throws FileNotFoundException {
        int[] arrayList = ArrayUtils.readIntArrayFromFile("testSrc/testInput5.txt");

        int[] expectedResult = ArrayUtils.readIntArrayFromFile("testSrc/testOutput5.txt");
        List<Integer> list = program.specSortingList(ArrayUtils.toList(arrayList));
        int[] receivedResult = list.stream().mapToInt(i -> i).toArray();


        Assertions.assertArrayEquals(expectedResult, receivedResult);
    }

}