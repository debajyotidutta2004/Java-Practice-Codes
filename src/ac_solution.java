public class ac_solution {
    public static int maxSubArray(int[] nums){
        if(nums.length == 0){
            return 0;
        }
        int maxCurrent = nums[0];
        int maxGlobal = nums[0];

        for(int i = 1; i < nums.length; i++){
            maxCurrent = Math.max(nums[i], maxCurrent + nums[i]);
            if(maxCurrent > maxGlobal){
                maxGlobal = maxCurrent;
            }
        }
        return maxGlobal;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        int result = maxSubArray(nums);
        System.out.println(result);
    }
}