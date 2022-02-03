class TwoSum {
    public static void main(String args[]) {
        int target = 6;

        int[] nums = new int[] { 3, 5, 3 };

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if (target == sum) {
                    System.out.println(i + "," + j);
                }
            }
        }

    }
}