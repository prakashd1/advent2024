package com.pd.advent2024;

import java.util.Arrays;

public class Day02 {
    public int part1(String file) {
        String[] lines = FileUtil.readFileAsArrayOfStrings(file);

        int result = 0;

        for (String line : lines) {
            int[] nums = Arrays.stream(line.split("\\s+")).mapToInt(Integer::parseInt).toArray();
            if(isValid(nums)) result++;
        }
        return result;
    }

    public int part2(String file) {
        String[] lines = FileUtil.readFileAsArrayOfStrings(file);

        int result = 0;

        for (String line : lines) {
            int[] nums = Arrays.stream(line.split("\\s+")).mapToInt(Integer::parseInt).toArray();
            if(isValidWithDampener(nums)) result++;
        }
        return result;
    }

    public boolean isValid(int [] nums){
        boolean asc = true, desc = true;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] <= nums[i - 1]) {
                asc = false;
            }
            if (nums[i] >= nums[i - 1]) {
                desc = false;
            }
            if (Math.abs(nums[i] - nums[i - 1]) > 3) {
                asc = desc = false;
            }
        }
        return asc || desc;
    }

    public boolean isValidWithDampener(int[] arr) {
        if (isValid(arr)) return true; // Already valid without removing anything

        for (int i = 0; i < arr.length; i++) {
            int[] modifiedArray = removeElement(arr, i);
            if (isValid(modifiedArray)) {
                return true; // Removing one element makes it valid
            }
        }
        return false;
    }

    public int[] removeElement(int[] arr, int index) {
        int[] result = new int[arr.length - 1];
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (i != index) {
                result[j++] = arr[i];
            }
        }
        return result;
    }

}
