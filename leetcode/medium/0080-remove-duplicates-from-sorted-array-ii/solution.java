class Solution {
    public int removeDuplicates(int[] nums) {

     int officer=2;
    int cm = 2;
    int res =2;
    int n = nums.length;

        while(cm < n) {
            
            if(nums[cm] == nums[officer-2]){
                cm++;
                continue;
            }
            nums[officer] = nums[cm];
            officer++;
            res++;
            cm++;
        }
        return res;
    }
}