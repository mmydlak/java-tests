package tests;

import classes.ArraySolutionClass;
//import org.junit.Assert;
//import org.junit.jupiter.api.Test;
import org.junit.Test;


import static org.junit.jupiter.api.Assertions.*;

public class ArraySolutionClassTest {

    Throwable throwable;

    @Test //(expected = Exception.class)
    public void Should_ThrowRightException_When_ArrayIsEmpty() {
        int[] a = new int[0];

        throwable = assertThrows(Exception.class, () -> ArraySolutionClass.solution(a));
        assertEquals("Array is empty.", throwable.getMessage());
    }

    @Test
    public void Should_ThrowRightException_When_ArrayIsNotInitialized() {
        int[] a = null;

        throwable = assertThrows(Exception.class, () -> ArraySolutionClass.solution(a));
        assertEquals("Array is not initialized.", throwable.getMessage());

    }

    @Test
    public void Should_ThrowRightException_When_ArrayContainsNegativeValues() {
        int[] a = {1,0,-1,2};

        throwable = assertThrows(Exception.class, () -> ArraySolutionClass.solution(a));
        assertEquals("Array contains negative values.", throwable.getMessage());
//        try {
//            ArraySolutionClass.solution(a);
//        } catch (Exception e) {
//            assertEquals("Array contains negative values.", e.getMessage());
//        }
    }

    @Test
    public void Should_ThrowRightException_When_ArrayContainsValueBiggerThan9() {
        int[] a = {1,10,2};

        throwable = assertThrows(Exception.class, () -> ArraySolutionClass.solution(a));
        assertEquals("Array contains value bigger than 9.", throwable.getMessage());

    }

    @Test
    public void Should_ReturnRightValue_When_ArrayWithNoDuplicatesContainsPositiveNumbers() {
        int[] a = {3, 5, 1};

        int actual = -1;
        try {
            actual = ArraySolutionClass.solution(a);
        } catch (Exception e) {
            fail(e.getMessage());
        }

        assertEquals(9, actual);
    }

    @Test
    public void Should_ReturnRightValue_When_ArrayWithDuplicatesContainsPositiveNumbers() {
        int[] a = {1, 3, 1, 1};

        int actual = -1;
        try {
            actual = ArraySolutionClass.solution(a);
        } catch (Exception e) {
            fail(e.getMessage());
        }

        assertEquals(21, actual);
    }

    @Test
    public void Should_Return0_When_ArrayContainsOnlyZeros() {
        int[] a = {0, 0, 0};

        int actual = -1;
        try {
            actual = ArraySolutionClass.solution(a);
        } catch (Exception e) {
            fail(e.getMessage());
        }

        assertEquals(0, actual);
    }

    @Test
    public void Should_ReturnRightValue_When_ArrayContainsOnlyOneElement() {
        int[] a = {1};

        int actual = -1;
        try {
            actual = ArraySolutionClass.solution(a);
        } catch (Exception e) {
            fail(e.getMessage());
        }

        assertEquals(8, actual);
    }

    @Test
    public void Should_ReturnRightValue_When_ArrayContainsZerosAtFirstIndexes() {
        int[] a = {0,0,0,0,2};

        int actual = -1;
        try {
            actual = ArraySolutionClass.solution(a);
        } catch (Exception e) {
            fail(e.getMessage());
        }

        assertEquals(7, actual);
    }

    @Test
    public void Should_ReturnRightValue_When_ArrayContainsZerosAtLastIndexes() {
        int[] a = {2,0,0,0,0};

        int actual = -1;
        try {
            actual = ArraySolutionClass.solution(a);
        } catch (Exception e) {
            fail(e.getMessage());
        }

        assertEquals(7, actual);
    }

    @Test
    public void Should_ReturnRightValue_When_ArrayContainsZerosAtMiddleIndexes() {
        int[] a = {2,0,0,0,0,1};

        int actual = -1;
        try {
            actual = ArraySolutionClass.solution(a);
        } catch (Exception e) {
            fail(e.getMessage());
        }

        assertEquals(15, actual);
    }

    @Test
    public void Should_ReturnRightValue_When_AfterMultiplyBy17IntValueIsOverflowed() {
        int [] a = {8,3,6,5,2,3,6,4,3};

        int actual = -1;
        try {
            actual = ArraySolutionClass.solution(a);
        } catch (Exception e) {
            fail(e.getMessage());
        }

        assertEquals(59, actual);
    }

    @Test
    public void Should_ReturnRightValue_When_IntValueBuiltWithArrayValuesIsOverflowed() {
        int [] a = {0,0,0,0,0,0,0,0,0,0,0,0,9};

        int actual = -1;
        try {
            actual = ArraySolutionClass.solution(a);
        } catch (Exception e) {
            fail(e.getMessage());
        }

        assertEquals(9, actual);
    }


}