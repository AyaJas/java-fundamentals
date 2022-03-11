/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.basics;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import java.util.List;
import java.util.Arrays;

class LibraryTest {

    Library classUnderTest;
    int[] arrayTest = {5, 9, 2, 1, 9};
    Integer[][] weeklyMonthTemperatures = {
            {66, 64, 58, 65, 71, 57, 60},
            {57, 65, 65, 70, 72, 65, 51},
            {55, 54, 60, 53, 59, 57, 61},
            {65, 56, 55, 52, 55, 62, 57}
    };
    String expected = "\nHigh: "+ 72 +"\nLow: "+ 51 +"\nNever saw temperature: "+ 63 +"\nNever saw temperature: "+ 67 +"\nNever saw temperature: " + 68 +
            "\nNever saw temperature: "+ 69 + "\n";

    List<String> votes = Arrays.asList("Bush","Bush","Bush","Shrub","Hedge","Shrub","Bush","Hedge","Bush");


    @BeforeEach
    void setUp() {
        classUnderTest = new Library();
    }

    @Test void someLibraryMethodReturnsTrue() {
        Library classUnderTest = new Library();
        assertTrue(classUnderTest.someLibraryMethod(), "someLibraryMethod should return 'true'");
    }


    @Test
    @DisplayName("contains Duplicates Test")
    void containsDuplicates() {
        boolean result = classUnderTest.containsDuplicates(arrayTest);
        assertEquals(true, result);
    }

    @Test
    @DisplayName("calculating Averages Test")
    void calculatingAverages() {
        double result = classUnderTest.calculatingAverages(arrayTest);
        assertEquals(5.2, result);
    }

//    @BeforeEach
//    @DisplayName("Array of Array Test")
//    @Test
//    void arrayOfArray() {
//        double[] testResult = Library.arrayOfArray(weeklyMonthTemperatures);
////        double[] expected = {63.0, 63.57142857142857, 57.0, 57.42857142857143};
//        double[] expected = {63.0, 63.57142857142857, 57.0, 57.42857142857143};
////        double[] result = classUnderTest.arrayOfArray(weeklyMonthTemperatures);
//        assertEquals(expected,testResult);
//    }


    @Test
    @DisplayName("Tally Test")
    void tally() {
            String result = classUnderTest.tally(votes);
            assertEquals("Bush", result);
    }

    @Test
    @DisplayName("analyzingWeatherData Test")
    void analyzingWeatherData(){
        String result = classUnderTest.analyzingWeatherData(weeklyMonthTemperatures);
        assertEquals(expected, result);
    }

}
