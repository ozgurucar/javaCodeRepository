package org.ozgurucar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Leetcode_1 {
    public static void main(String[] args) {

    }
    public int[] twoSum(int[] nums, int target) {
        int[] outputs = new int[2];

        for(int i = 0; i < nums.length;i++) {
            int current = nums[i];
            int interval = target - current;
            boolean hasInterval = Arrays.stream(nums).anyMatch(value -> value == interval);
            long dualityCounter = Arrays.stream(nums).filter(num -> num == interval).count();
            System.out.println(hasInterval);

            if(hasInterval) {
                if(dualityCounter == 1 && current == interval)
                    continue;
                else {
                    outputs[0] = i;
                    outputs[1] = Arrays.stream(nums).boxed().toList().lastIndexOf(interval);
                    break;
                }
            }
        }
        return outputs;
    }
}
