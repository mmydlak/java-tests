package tests;

import classes.ListSolutionClass;
//import org.junit.Assert;
//import org.junit.jupiter.api.Test;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

public class ListSolutionClassTest {

    Throwable throwable;

    @Test
    public void Should_Return1_When_ListContainsOnlyExtremeElement() {
        List<Integer> list = new ArrayList<>();
        list.add(1000000);

        int actual = -1;
        try {
            actual = ListSolutionClass.solution(list);
        } catch (Exception e) {
            fail(e.getMessage());
        }

        assertEquals(1, actual);
        }

    @Test
    public void Should_Return1Or2_When_ListContainsRandomValueFromRange() {
        List<Integer> list = new ArrayList<>();

        Random rand = new Random();
        list.add((rand.nextInt(2000001)-1000000));

        int actual = -1;
        try {
            actual = ListSolutionClass.solution(list);
        } catch (Exception e) {
            fail(e.getMessage());
        }

        if(list.get(0) == 1) {
            assertEquals(2, actual);
        }
        else {
            assertEquals(1, actual);
        }
    }

    @Test
    public void Should_ReturnFirstMissingPositiveNumber_When_ListWithNoDuplicatesContainsPositiveElements() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(1);
        list.add(2);
        list.add(9);
        list.add(4);
        list.add(7);
        list.add(8);

        int actual = -1;
        try {
            actual = ListSolutionClass.solution(list);
        } catch (Exception e) {
            fail(e.getMessage());
        }

        assertEquals(3, actual);
    }

    @Test
    public void Should_Return1_When_ListWithNoDuplicatesContainsNegativeElements() {
        List<Integer> list = new ArrayList<>();
        list.add(-10);
        list.add(-1);
        list.add(-2);
        list.add(-9);
        list.add(-4);
        list.add(-7);
        list.add(-8);

        int actual = -1;
        try {
            actual = ListSolutionClass.solution(list);
        } catch (Exception e) {
            fail(e.getMessage());
        }

        assertEquals(1, actual);
    }

    @Test
    public void Should_ReturnFirstMissingPositiveNumber_When_ListContainsDuplicates() {
        List<Integer> list = new ArrayList<>();
        list.add(-10);
        list.add(1);
        list.add(-2);
        list.add(-9);
        list.add(4);
        list.add(4);
        list.add(1);

        int actual = -1;
        try {
            actual = ListSolutionClass.solution(list);
        } catch (Exception e) {
            fail(e.getMessage());
        }

        assertEquals(2, actual);
    }

    @Test
    public void Should_ReturnFirstMissingPositiveNumber_When_ListContainsSomeElementsAnd10Zeros() {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<10; i++) {
            list.add(0);
        }
        list.add(1);
        list.add(5);
        list.add(5);
        list.add(7);
        list.add(10);

        int actual = -1;
        try {
            actual = ListSolutionClass.solution(list);
        } catch (Exception e) {
            fail(e.getMessage());
        }

        assertEquals(2, actual);
    }

    @Test
    public void Should_Return100001_When_ListContainsElementsFrom1To100000() {
        List<Integer> list = new ArrayList<>();
        for(int i=1; i<=100000; i++) {
            list.add(i);
        }

        int actual = -1;
        try {
            actual = ListSolutionClass.solution(list);
        } catch (Exception e) {
            fail(e.getMessage());
        }

        assertEquals(100001, actual);
    }

//    @Rule
//    public ExpectedException thrown = ExpectedException.none();

    @Test //(expected = Exception.class)
    public void Should_ThrowRightException_When_ListIsEmpty() {
        List<Integer> list = new ArrayList<>();
//        thrown.expectMessage("List is empty.");

        throwable = assertThrows(Exception.class, () -> ListSolutionClass.solution(list));
        assertEquals("List is empty.", throwable.getMessage());

    }

    @Test
    public void Should_ThrowRightException_When_ListIsNotInitialized() {
        List<Integer> list = null;

        throwable = assertThrows(Exception.class, () -> ListSolutionClass.solution(list));
        assertEquals("List is not initialized.", throwable.getMessage());
//
//        try {
//            ListSolutionClass.solution(list);
//        } catch (Exception e) {
//
//            assertEquals("List is not initialized.", e.getMessage());
//        }
    }

    @Test
    public void Should_ThrowRightException_When_ListIsTooLarge() {
        List<Integer> list = new ArrayList<>();
        for(int i=0; i<1e5+1; i++) {
            list.add(i);
        }

        throwable = assertThrows(Exception.class, () -> ListSolutionClass.solution(list));
        assertEquals("List size exceed allowed range.", throwable.getMessage());

//        try {
//            ListSolutionClass.solution(list);
//        } catch (Exception e) {
//            assertEquals("List size exceed allowed range.", e.getMessage());
//        }
    }

}