class Solution {
    public int minimizeSum(int[] nums) {
        int n = nums.length, res = Integer.MAX_VALUE;
        int min1 = Integer.MAX_VALUE, min2 = min1, min3 = min1;
        int max1 = Integer.MIN_VALUE, max2 = max1, max3 = max1;

        for(int num : nums){
            if(num >= max1){
                max3 = max2;
                max2 = max1;
                max1 = num;
            }
            else if(num >= max2){
                max3 = max2;
                max2 = num;
            }
            else if(num > max3) max3 = num;

            if(num <= min1){
                min3 = min2;
                min2 = min1;
                min1 = num;
            }
            else if(num <= min2){
                min3 = min2;
                min2 = num;
            }
            else if(num < min3) min3 = num;
        }

        res = Math.min(res, max3 - min1);
        res = Math.min(res, max1 - min3);
        res = Math.min(res, max2 - min2);

        return res;
    }
}