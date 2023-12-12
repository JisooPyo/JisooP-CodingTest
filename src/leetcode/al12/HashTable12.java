package leetcode.al12;

import java.util.HashMap;
import java.util.Map;

public class HashTable12 {
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 1};
        int[] nums2 = {1, 0, 1, 1};
        int[] nums3 = {1, 2, 3, 1, 2, 3};

        System.out.println(containsNearbyDuplicate(nums1, 3));  // true
        System.out.println(containsNearbyDuplicate(nums2, 1));  // true
        System.out.println(containsNearbyDuplicate(nums3, 2));  // false
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        // map에 원소와 index 저장
        // map에 같은 원소가 있다면 index차 비교하여 k이하인지 확인
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (Math.abs(i - map.get(nums[i])) <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);
        }
        return false;
    }
}
