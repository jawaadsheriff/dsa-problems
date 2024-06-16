package dsa.twopointers;

/*
 * https://leetcode.com/problems/two-sum/description/
 */

public class TwoSum {

	public int[] twoSum(int[] nums, int target) {
        int i = 0;
        int j = i + 1;
        int n = nums.length;
        while(i < n){
            if(nums[i]+nums[j] == target){
                return new int[] {i, j};
            }
            else if(j < n - 1){
                j++;
            }
            else if(j == n - 1){
                i++;
                j = i + 1;
            }
        }
        return new int[] {0, 0};
	}
	
	public static void main(String[] args) {
		TwoSum obj = new TwoSum();
		int[] nums = {3,3};
		int target = 6;
		int[] ans = obj.twoSum(nums, target);
		for(int i = 0; i < ans.length; i++) {
			System.out.print(ans[i]+" ");
		}
	}
	
}
