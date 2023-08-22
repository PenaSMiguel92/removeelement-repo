public class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                count++;
                continue;
            }

            if (nums[i] == val) {
                int j = 0;
                while (i + j < nums.length && nums[i + j] == val) {
                    j++;
                }
                if (i + j >= nums.length) {
                    break;
                }

                int repval = nums[i];
                nums[i] = nums[i + j];
                nums[i + j] = repval;
                count++;
            }
        }
        return count;
    }
}
