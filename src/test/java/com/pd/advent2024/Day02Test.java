package com.pd.advent2024;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Day02Test {

    @Test
    public void checkPart1WithSampleInput(){
        Day02 day02=new Day02();
        int result = day02.part1("day02/sample.txt");

        assertEquals(2, result);

    }

    @Test
    public void checkPart1WithActualInput(){
        Day02 day02=new Day02();
        int result = day02.part1("day02/input.txt");
        assertEquals(252, result);

        System.out.println(result);

    }

    @Test
    public void checkPart2WithSampleInput(){
        Day02 day02=new Day02();
        int result = day02.part2("day02/sample.txt");
        assertEquals(4, result);
    }

    @Test
    public void checkPart2WithActualInput(){
        Day02 day02=new Day02();
        int result = day02.part2("day02/input.txt");
        System.out.println(result);
        assertEquals(324, result);

    }
}
