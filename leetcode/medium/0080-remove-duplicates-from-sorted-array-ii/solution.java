class Solution {
    public int removeDuplicates(int[] nums) {

     int officer=1;
    int cm = 2;
    int res =2;
    int n = nums.length;

        while(cm < n) {
            
            if(nums[cm] == nums[officer-1]){
                cm++;
                continue;
            }
            nums[officer + 1] = nums[cm];
            officer++;
            res++;
            cm++;
        }
        return res;
    }
}