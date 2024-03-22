class Solution {
    public int singleNumber(int[] nums) {
        int XOR=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            XOR=XOR^nums[i];
        }
        return XOR;

    }
}