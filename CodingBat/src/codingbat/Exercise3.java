package codingbat;

public class Exercise3 {
    public boolean has271(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < 10; j ++) {
                if (nums[i] == j && nums[i + 1] == j + 5 && (nums[i + 2] == j - 1 || nums[i + 2] == j - 2 || nums[i + 2] == j - 3 || nums[i + 2] == j || nums[i + 2] == j + 1)) {
                    return true;
                }
            }
        }
        return false;
    }

}
