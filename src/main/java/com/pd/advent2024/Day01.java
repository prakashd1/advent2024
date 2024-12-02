package com.pd.advent2024;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Day01 {
    public int part1(String file){
        String []lines = FileUtil.readFileAsArrayOfStrings(file);
        int [] a = new int[lines.length];
        int [] b = new int[lines.length];

        for(int i=0;i<lines.length;i++){
            String []temp = lines[i].split("\\s+");
            a[i] = Integer.parseInt(temp[0]);
            b[i] = Integer.parseInt(temp[1]);
        }
        Arrays.sort(a); Arrays.sort(b);
        int result = 0;
        for(int i=0;i<a.length;i++){
            result+= Math.abs(a[i]-b[i]);
        }
        return result;
    }

    public int part2(String file){
        String []lines = FileUtil.readFileAsArrayOfStrings(file);
        int [] a = new int[lines.length];
        Map<Integer, Integer> b = new HashMap<>();

        for(int i=0;i<lines.length;i++){
            String []temp = lines[i].split("\\s+");
            a[i] = Integer.parseInt(temp[0]);
            b.put(Integer.parseInt(temp[1]), b.getOrDefault(Integer.parseInt(temp[1]), 0) +1 );

        }

        int result = 0;
        for(int i=0;i<a.length;i++){
            result+= (a[i] * b.getOrDefault(a[i], 0));
        }
        return result;
    }

}
