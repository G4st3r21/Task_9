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
        int[] arrayList = ArrayUtils.readIntArrayFromFile("testSrc/normalCase.txt");

        int[] expectedResult = ArrayUtils.readIntArrayFromFile("testSrc/normalCaseOutput.txt");
        List<Integer> list = program.specSortingList(ArrayUtils.toList(arrayList));
        int[] receivedResult = list.stream().mapToInt(i -> i).toArray();


        Assertions.assertArrayEquals(expectedResult, receivedResult);
    }

    @Test
    public void testCaseWithUnusualInput() throws FileNotFoundException {
        int[] arrayList = ArrayUtils.readIntArrayFromFile("testSrc/caseWithUnusualInput.txt");

        int[] expectedResult = ArrayUtils.readIntArrayFromFile("testSrc/caseWithUnusualInputOutput.txt");
        int[] receivedResult = null;

        try {
            List<Integer> list = program.specSortingList(ArrayUtils.toList(arrayList));
            receivedResult = list.stream().mapToInt(i -> i).toArray();
        } catch (NullPointerException ignored) {}


        Assertions.assertArrayEquals(expectedResult, receivedResult);
    }

    @Test
    public void testCaseWithUnusualInput2() throws FileNotFoundException {
        int[] arrayList = ArrayUtils.readIntArrayFromFile("testSrc/caseWithUnusualInput2.txt");

        int[] expectedResult = ArrayUtils.readIntArrayFromFile("testSrc/caseWithUnusualInputOutput2.txt");
        List<Integer> list = program.specSortingList(ArrayUtils.toList(arrayList));
        int[] receivedResult = list.stream().mapToInt(i -> i).toArray();


        Assertions.assertArrayEquals(expectedResult, receivedResult);
    }

    @Test
    public void testCaseWithUnusualInput3() throws FileNotFoundException {
        int[] arrayList = ArrayUtils.readIntArrayFromFile("testSrc/caseWithUnusualInput3.txt");

        int[] expectedResult = ArrayUtils.readIntArrayFromFile("testSrc/caseWithUnusualInputOutput3.txt");
        List<Integer> list = program.specSortingList(ArrayUtils.toList(arrayList));
        int[] receivedResult = list.stream().mapToInt(i -> i).toArray();


        Assertions.assertArrayEquals(expectedResult, receivedResult);
    }

    @Test
    public void testCaseWithBigInput() throws FileNotFoundException {
        int[] arrayList = ArrayUtils.readIntArrayFromFile("testSrc/caseWithBigInput.txt");

        int[] expectedResult = ArrayUtils.readIntArrayFromFile("testSrc/caseWithBigInputOutput.txt");
        List<Integer> list = program.specSortingList(ArrayUtils.toList(arrayList));
        int[] receivedResult = list.stream().mapToInt(i -> i).toArray();


        Assertions.assertArrayEquals(expectedResult, receivedResult);
    }

}