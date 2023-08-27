class Solution {
    public int[] twoSum(int[] nums, int target) {
        // edge cases
        if (nums == null || nums.length < 2) {
            return new int[0];
        }
        // create a HashMap to store the numbers and their indices
        HashMap<Integer, Integer> map = new HashMap<>();
        // loop through the array
        for (int i = 0; i < nums.length; i++) {
            // get the current number
            int num = nums[i];
            // calculate the complement
            int complement = target - num;
            // check if the complement is in the map
            if (map.containsKey(complement)) {
                // return the indices of the complement and the current number
                return new int[]{map.get(complement), i};
            }
            // put the current number and its index in the map
            map.put(num, i);
        }
        // no solution found
        return new int[0];
    }
}