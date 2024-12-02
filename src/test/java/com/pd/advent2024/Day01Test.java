package com.pd.advent2024;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class Day01Test {
    @Test
    public void testPart1WithSampleInput(){
        Day01 day01 = new Day01();
        int result = day01.part1("day01/sample.txt");
        assertEquals(result, 11);
    }

    @Test
    public void testPart2WithSampleInput(){
        Day01 day01 = new Day01();
        int result = day01.part2("day01/sample.txt");
        assertEquals(result, 31);
    }

    @Test
    public void testPart1WithActualInput(){
        Day01 day01 = new Day01();
        int result = day01.part1("day01/input.txt");
        System.out.println(result);
        assertEquals(result, 2_904_518);
    }


    @Test
    public void testPart2WithActualInput(){
        Day01 day01 = new Day01();
        int result = day01.part2("day01/input.txt");
        System.out.println(result);
        assertEquals(result, 18_650_129);
    }
}
