package com.dtcc.exams.fundamentals.stringutils;

import com.dtcc.exams.fundamentals.StringUtils;
import org.junit.Assert;
import org.junit.Test;

public class IsNumericTest {
    @Test
    public void alphaStringTest1() {
        // Given
        String alphaString = "The quick brown fox jumps";

        // When
        boolean outcome = StringUtils.isNumericString(alphaString);

        // Then
        Assert.assertFalse(outcome);
    }

    @Test
    public void alphaStringTest2() {
        // Given
        String alphaString = "Over the lazy dog";

        // When
        boolean outcome = StringUtils.isNumericString(alphaString);

        // Then
        Assert.assertFalse(outcome);
    }


    @Test
    public void numericStringTest1() {
        // Given
        String alphaString = "1234";

        // When
        boolean outcome = StringUtils.isNumericString(alphaString);
        System.out.println(outcome);
        System.out.println(alphaString.matches("[0-9]"));
        // Then
        Assert.assertTrue(outcome);
    }


    @Test
    public void numericStringTest2() {
        // Given
        String alphaString = "Over the lazy dog1";

        // When
        boolean outcome = StringUtils.isNumericString(alphaString);

        // Then
        Assert.assertFalse(outcome);
    }


    @Test
    public void specialCharacterStringTest1() {
        // Given
        String alphaString = "!&*(";

        // When
        boolean outcome = StringUtils.isNumericString(alphaString);

        // Then
        Assert.assertFalse(outcome);
    }


    @Test
    public void specialCharacterStringTest2() {
        // Given
        String alphaString = "Over the lazy dog!";

        // When
        boolean outcome = StringUtils.isNumericString(alphaString);

        // Then
        Assert.assertFalse(outcome);
    }
}
