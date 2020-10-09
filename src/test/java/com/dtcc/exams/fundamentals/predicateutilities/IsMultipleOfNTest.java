package com.dtcc.exams.fundamentals.predicateutilities;

import com.dtcc.exams.fundamentals.StringUtils;
import org.junit.Assert;
import org.junit.Test;

public class IsMultipleOfNTest {
    @Test
    public void test1() {
        test(1, 2,false);
    }

    @Test
    public void test2() {
        test(3, 3, true);
    }

    @Test
    public void test3() {
        test(7, 5, false);
    }

    @Test
    public void test4() {
        test(8, 4, true);
    }

    @Test
    public void test5() {
        test(12, 6, true);
    }


    private void test(Integer value, Integer multiple, Boolean expectedOutcome) {
        // when
        Boolean actualOutcome = StringUtils.PredicateUtilities.isMultipleOfN(value, multiple);

        // then
        Assert.assertEquals(actualOutcome, expectedOutcome);
    }
}
