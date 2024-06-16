package dsa.twopointers;

/*
 * https://leetcode.com/problems/container-with-most-water/description/
 * [1,8,6,2,5,4,8,3,7]
 *  0,1,2,3,4,5,6,7,8
 */

public class ContainerWithMostWater {

	public int maxArea(int[] height) {
		int n = height.length;
		int left = 0, right = n - 1;
		int maxArea = 0;
		while(left < right) {
			int breadth = right - left;
			int length = Math.min(height[left], height[right]);
			int area = breadth * length;
			if(area > maxArea) {
				maxArea = area;
			}
			if(height[left] < height[right]) {
				left++;
			}
			else {
				right--;
			}
		}
		return maxArea;
	}
	
	public static void main(String[] args) {
		ContainerWithMostWater obj = new ContainerWithMostWater();
		int[] height = {1,8,6,2,5,4,8,3,7};
		System.out.println(obj.maxArea(height));
	}
}
